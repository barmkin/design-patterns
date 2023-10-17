package it.gb.legacyPrinterIntegration;

public class OldPrinter {

    public void powerOn() {
        System.out.println("[OldPrinter] Centronics 101 Powered On!");
    }

    public void printFile(String path) {
        System.out.println("[OldPrinter] Buffering file " + path);
        System.out.println("[OldPrinter] Printing file...");
    }
    
    public void powerOff() {
        System.out.println("[OldPrinter] Centronics 101: Power Off!");
    }
}
