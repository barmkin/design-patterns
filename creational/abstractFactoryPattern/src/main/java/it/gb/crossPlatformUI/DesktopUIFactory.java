package it.gb.crossPlatformUI;

public class DesktopUIFactory extends UIComponentFactory {

    @Override
    public Window createWindow() {
        return new DesktopWindow();
    }

    @Override
    public Button createButton() {
        return new DesktopButton();
    }
    
}
