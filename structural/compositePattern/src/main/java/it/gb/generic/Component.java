package it.gb.generic;

public interface Component {

    // Added for logs only
    public String getPath(); 
    public void setParentPath(String path);

    public void execute();

}
