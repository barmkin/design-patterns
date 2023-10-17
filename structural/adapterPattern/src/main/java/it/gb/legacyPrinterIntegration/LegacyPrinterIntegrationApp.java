package it.gb.legacyPrinterIntegration;

public abstract class LegacyPrinterIntegrationApp {
    
    public static void executeLegacyPrinterIntegrationApp() {
        // Create printers
        Printer modernPrinter = new ModernPrinter();
        // Cannot use interface...
        OldPrinter oldPrinter = new OldPrinter();
        // ...using adapter
        Printer oldPrinterAdapted = new PrinterAdapter(oldPrinter);

        // Call interfce methods
        modernPrinter.initialize();
        oldPrinterAdapted.initialize();

        modernPrinter.printDocument("./Test.pdf");
        oldPrinterAdapted.printDocument("./Test.pdf");

        modernPrinter.close();
        oldPrinterAdapted.close();

    }

}
