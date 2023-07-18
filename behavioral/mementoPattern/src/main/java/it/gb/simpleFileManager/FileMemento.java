package it.gb.simpleFileManager;

public class FileMemento {
    private String fileContent;

    public String getState() {
        return this.fileContent;
    }

    public void setState(String fileContent) {
        this.fileContent = fileContent;
    } 
}
