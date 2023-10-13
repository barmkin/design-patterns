package it.gb.crossPlatformUI;


public abstract class UIComponentFactory {

    public Window windowElement;
    public Button buttonElement;


    public abstract Window createWindow();

    public abstract Button createButton();

    public void createBasicInterface() {
        this.windowElement = this.createWindow();
        this.buttonElement = this.createButton();
    }

    public Window getWindowElement() {
        return windowElement;
    }

    public Button getButtonElement() {
        return buttonElement;
    }
}
