package it.gb;

import it.gb.generic.Client;
import it.gb.weatherStation.WeatherStationApp;

public class ObserverPattern {
    public static enum examples_list {
        generic,
        weatherStation
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (ObserverPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Observer Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (ObserverPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (ObserverPattern.examples_list.weatherStation.name().equals(arg)) {
                    WeatherStationApp.executeWeatherStationApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    ObserverPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            ObserverPattern.printValidArgs();
        }
    }

}
