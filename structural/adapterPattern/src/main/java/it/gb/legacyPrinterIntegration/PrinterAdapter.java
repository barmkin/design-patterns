package it.gb.legacyPrinterIntegration;

public class PrinterAdapter implements Printer {

    OldPrinter oldPrinterInstance;

    public PrinterAdapter(OldPrinter oldPrinter) {
        super();
        this.oldPrinterInstance = oldPrinter;
    }

    @Override
    public void initialize() {
        this.oldPrinterInstance.powerOn();
    }

    @Override
    public void printDocument(String path) {
        this.oldPrinterInstance.printFile(path);
    }

    @Override
    public void close() {
        this.oldPrinterInstance.powerOff();
    }
    
}
