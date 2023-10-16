package it.gb.generic;

public class Adaptee {

    private String name;
    private String version;
    private boolean isLegacyVersion;

    public Adaptee(String name, String version) {
        super();
        this.name = name;
        if (version.split("\\.").length != 3) {
            this.isLegacyVersion = true;
        } else {
            this.isLegacyVersion = false;
        }
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        if (version.split("\\.").length != 3) {
            this.isLegacyVersion = true;
        } else {
            this.isLegacyVersion = false;
        }
        this.version = version;
    }

    public boolean isLegacyVersion() {
        return isLegacyVersion;
    }
    
}
