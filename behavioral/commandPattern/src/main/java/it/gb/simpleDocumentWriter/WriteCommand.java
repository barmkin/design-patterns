package it.gb.simpleDocumentWriter;

public class WriteCommand implements Command {

    //state
    Document prevDocument;
    Document currDocument;
    String text;

    public WriteCommand(Document document, String text) {
        super();
        this.currDocument = document;
        this.text = text;
    }

    @Override
    public void execute() {
        this.prevDocument = new Document();
        this.prevDocument.write(this.currDocument.getDocumentContent());
        this.currDocument.write(this.text);
    }

    @Override
    public void undo() {
        this.currDocument.replaceState(prevDocument);
    }
    
}
