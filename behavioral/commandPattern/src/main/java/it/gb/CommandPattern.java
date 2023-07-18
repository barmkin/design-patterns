package it.gb;

import it.gb.generic.Client;
import it.gb.simpleDocumentWriter.DocumentWriterApp;

public class CommandPattern {

    public static void main(String[] args) {
        System.out.println("Hello, Command Pattern  Playground!");

        // uncomment to play generic pattern
        // CommandPattern.executeGeneric();
        Client.executeGeneric(); 
        
        // uncomment to play Document Writer
        // DocumentWriterApp.testDocumentWriter();
    }
}
