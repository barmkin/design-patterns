package it.gb.legacyPrinterIntegration;

public class ModernPrinter implements Printer {

    @Override
    public void initialize() {
        System.out.println("[ModernPrinter] Init driver...");
        System.out.println("[ModernPrinter] Printer NGD-J4335DW Ready.");
    }

    @Override
    public void printDocument(String path) {
        System.out.println("[ModernPrinter] Printing document at path " + path);
    }

    @Override
    public void close() {
        System.out.println("[ModernPrinter] Communication closed.");
    }
    
}
