package it.gb.generic;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public String getName() {
        return adaptee.getName();
    }

    @Override
    public String getObjectID() {
        return "Target#" + adaptee.hashCode();
    }

    private String[] adapteeVersionParts() {
        if (!adaptee.isLegacyVersion()) {
            return adaptee.getVersion().split("\\.");
        } else {
            return null;
        }
    }

    @Override
    public int getMajorVersion() {
        String[] versionParts = this.adapteeVersionParts();
        String integerPart = null;
        if (versionParts != null && versionParts.length > 0) {
            integerPart = versionParts[0];
        } else {
            integerPart = adaptee.getVersion();
        }

        try {
            return Integer.parseInt(integerPart);
        } catch (NumberFormatException e) {
            if (versionParts != null && versionParts.length > 0) {
                System.err.println("Invalid major version (" + versionParts[0] + ")");
            } else {
                System.err.println("Invalid major version (" + adaptee.getVersion() + ")");
            }
        }

        return 1; // Default major version
    }

    @Override
    public int getMinorVersion() {
        String[] versionParts = this.adapteeVersionParts();

        try {
            if (versionParts != null && versionParts.length > 1) {
                return Integer.parseInt(versionParts[1]);
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid minor version (" + versionParts[1] + ")");
        }

        return 0; // default minor version
    }

    @Override
    public int getPatchVersion() {
        String[] versionParts = this.adapteeVersionParts();

        try {
            if (versionParts != null && versionParts.length > 2) {
                return Integer.parseInt(versionParts[2]);
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid patch version (" + versionParts[2] + ")");
        }

        return 0; // default patch version
    }

}
