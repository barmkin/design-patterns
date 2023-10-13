package it.gb.crossPlatformUI;

public abstract class CrossPlatformUIApp {

    protected enum UIType {
        DESKTOP,
        MOBILE
    }

    public static UIComponentFactory getUIComponentFactory(UIType uiType) {
        switch (uiType) {
            case DESKTOP:
                return new DesktopUIFactory();
            case MOBILE:
                return new MobileUIFactory();
            default:
                throw new IllegalArgumentException("UI " + uiType.name() + " not implemented!");
        }
    }

    public static void executeCrossPlatformUIApp() {

        // Choose UI
        UIType uiType = UIType.DESKTOP;

        UIComponentFactory uiFactory = getUIComponentFactory(uiType);

        uiFactory.createBasicInterface();

        // Test window
        uiFactory.getWindowElement().render();
        uiFactory.getWindowElement().close();

        // Test button
        uiFactory.getButtonElement().render();
        uiFactory.getButtonElement().onclick();

    }
}
