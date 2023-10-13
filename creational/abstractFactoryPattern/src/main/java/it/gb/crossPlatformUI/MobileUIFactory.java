package it.gb.crossPlatformUI;

public class MobileUIFactory extends UIComponentFactory {

    @Override
    public Window createWindow() {
        return new MobileWindow();
    }

    @Override
    public Button createButton() {
        return new MobileButton();
    }
    
}
