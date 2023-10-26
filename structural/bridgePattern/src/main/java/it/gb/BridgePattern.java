package it.gb;

import it.gb.generic.Client;
import it.gb.remoteControls.RemoteControlsApp;

public class BridgePattern {
    public static enum examples_list {
        generic,
        remoteControls
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (BridgePattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Bridge Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (BridgePattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (BridgePattern.examples_list.remoteControls.name().equals(arg)) {
                    RemoteControlsApp.executeRemoteControlsApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    BridgePattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            BridgePattern.printValidArgs();
        }
    }

}
