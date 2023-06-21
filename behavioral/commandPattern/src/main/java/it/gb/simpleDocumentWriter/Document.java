package it.gb.simpleDocumentWriter;

public class Document {
    private StringBuilder documentContent;

    public Document() {
        super();
        this.documentContent = new StringBuilder();
    }

    public void write(String s) {
        this.documentContent.append(s);
    }

    public String getDocumentContent() {
        return documentContent.toString();
    }

    protected void replaceState(Document newDocumentState) {
        this.documentContent = newDocumentState.documentContent;
    }
}
