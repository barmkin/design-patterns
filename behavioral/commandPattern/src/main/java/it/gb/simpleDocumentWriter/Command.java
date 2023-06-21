package it.gb.simpleDocumentWriter;

public interface Command {
    void execute();
    void undo();
}
