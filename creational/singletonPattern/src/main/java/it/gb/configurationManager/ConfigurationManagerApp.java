package it.gb.configurationManager;

public abstract class ConfigurationManagerApp {

    public static void executeConfigurationManagerApp() {
        System.out.println("Access to Configuration Manager...");
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();

        System.out.println("Add configurations...");
        configurationManager.setConfiguration("Volume %", 25);
        configurationManager.setConfiguration("Contrast %", 50);
        configurationManager.setConfiguration("Is Muted", false);
        configurationManager.setConfiguration("Model", "Example TV 9000");

        System.out.println("Print configurations");
        for (String confName : configurationManager.listConfigurations()) {
            System.out.println(confName);
        }

        System.out.println("Add another pointer to configurations");
        ConfigurationManager configurations = ConfigurationManager.getInstance();

        System.out.println("Volume % is " + configurations.getIntegerConfiguration("Volume %"));
        System.out.println("Contrast % is " + configurations.getIntegerConfiguration("Contrast %"));
        System.out.println("Is Muted? " + 
            ( configurations.getBooleanConfiguration("Is Muted") ? "Yes" : "No" )
        );
        System.out.println("Model: " + configurations.getStringConfiguration("Model"));


    }
}
