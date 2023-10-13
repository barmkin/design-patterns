package it.gb.crossPlatformUI;

public class MobileButton extends Button {

    @Override
    public void render() {
        System.out.println("[MobileButton - render] Mobile button displayed on bottom");
    }

    @Override
    public void onclick() {
        System.out.println("[MobileButton - onclick] Tactile feedback...");
        System.out.println("[MobileButton - onclick] Display loading...");
    }
    
}
