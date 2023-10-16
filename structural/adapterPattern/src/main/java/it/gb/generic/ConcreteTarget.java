package it.gb.generic;

public class ConcreteTarget implements Target {

    private String name;
    private String objectID;
    private int majorVersion;
    private int minorVersion; 
    private int patchVersion; 

    public ConcreteTarget(String name, int majorVersion) {
        super();
        this.name = name;
        this.objectID = "Target#" + super.hashCode();
        this.majorVersion = majorVersion;
        this.minorVersion = 0;
        this.patchVersion = 0;
    }

    public ConcreteTarget(String name, String objectID, int majorVersion) {
        super();
        this.name = name;
        this.objectID = objectID;
        this.majorVersion = majorVersion;
        this.minorVersion = 0;
        this.patchVersion = 0;
    }

    public ConcreteTarget(String name, String objectID, int majorVersion, int minorVersion, int patchVersion) {
        super();
        this.name = name;
        this.objectID = objectID;
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.patchVersion = patchVersion;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getObjectID() {
        return this.objectID;
    }

    @Override
    public int getMajorVersion() {
        return this.majorVersion;
    }

    @Override
    public int getMinorVersion() {
        return this.minorVersion;
    }

    @Override
    public int getPatchVersion() {
        return this.patchVersion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public void setMinorVersion(int minorVersion) {
        this.minorVersion = minorVersion;
    }

    public void setPatchVersion(int patchVersion) {
        this.patchVersion = patchVersion;
    }
    
}
