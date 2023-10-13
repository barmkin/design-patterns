package it.gb.crossPlatformUI;

public class DesktopButton extends Button {

    @Override
    public void render() {
        System.out.println("[DesktopButton - render] Rendering desktop button...");
    }

    @Override
    public void onclick() {
        System.out.println("[DesktopButton - onclick] Display on click animation");
        System.out.println("[DesktopButton - onclick] Display loading...");
    }
    
}
