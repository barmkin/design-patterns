package it.gb.crossPlatformUI;

public class DesktopWindow extends Window {

    @Override
    public void render() {
        System.out.println("[DesktopWindow - render] Rendering window on desktop.");
    }

    @Override
    public void close() {
        System.out.println("[DesktopWindow - close] Close desktop window");
    }
    
}
