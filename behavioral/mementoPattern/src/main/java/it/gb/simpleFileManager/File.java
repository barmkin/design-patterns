package it.gb.simpleFileManager;

public class File {
    private String fileName;
    private StringBuilder fileContent;

    public File(String fileName) {
        super();
        this.fileName = fileName;
        this.fileContent = new StringBuilder();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void addContent(String chars) {
        fileContent.append(chars);
    }

    public void addContentOnNewLine(String chars) {
        fileContent.append("\n");
        this.addContent(chars);
    }

    public String getContent() {
        System.out.println("Content of file " + this.fileName);
        return this.fileContent.toString();
    } 

    protected FileMemento save() {
        FileMemento fileMemento = new FileMemento();
        fileMemento.setState(this.fileContent.toString());
        return fileMemento;
    }

    protected void revert(FileMemento fileMemento) {
        this.fileContent = new StringBuilder(fileMemento.getState());
    }
}
