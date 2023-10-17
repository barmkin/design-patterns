package it.gb.legacyPrinterIntegration;

public interface Printer {

    public void initialize();

    public void printDocument(String path);

    public void close();

}
