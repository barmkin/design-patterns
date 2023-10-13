package it.gb.crossPlatformUI;

public class MobileWindow extends Window {

    @Override
    public void render() {
        System.out.println("[MobileWindow - render] Save parent");
        System.out.println("[MobileWindow - render] Display mobile window interface");
    }

    @Override
    public void close() {
        System.out.println("[MobileWindow - close] Close this window");
        System.out.println("[MobileWindow - close] Bring back focus on parent");
    }
    
}
