package it.gb.coffeeShop;

public abstract class CoffeeShopApp {

    private static enum CoffeeDecorations {
        CINNAMON,
        CREAM,
        MILK,
        SUGAR
    }

    private static Coffee addDecorations(Coffee coffee, CoffeeShopApp.CoffeeDecorations decoration) {
        switch (decoration) {
            case CINNAMON:
                return new CinnamonDecorator(coffee);
            case CREAM:
                return new CreamDecorator(coffee);
            case MILK:
                return new MilkDecorator(coffee);
            case SUGAR:
                return new SugarDecorator(coffee);
            default:
                System.err.println("Cannot decorate with " + decoration.name());
                return coffee;
        }
    }

    public static void executeCoffeeShopAppApp() {

        // Create 2 basic coffees
        Coffee coffee1 = new SimpleCoffee();
        Coffee coffee2 = new SimpleCoffee();

        // Add decorations arrays
        CoffeeShopApp.CoffeeDecorations[] coffe1Decorations = {
                CoffeeShopApp.CoffeeDecorations.MILK,
                CoffeeShopApp.CoffeeDecorations.CREAM
        };
        CoffeeShopApp.CoffeeDecorations[] coffe2Decorations = {
                CoffeeShopApp.CoffeeDecorations.SUGAR,
                CoffeeShopApp.CoffeeDecorations.CINNAMON,
                CoffeeShopApp.CoffeeDecorations.CREAM
        };

        // Customize coffees
        for (CoffeeShopApp.CoffeeDecorations coffee1Decoration : coffe1Decorations) {
            coffee1 = CoffeeShopApp.addDecorations(coffee1, coffee1Decoration);
        }

        for (CoffeeShopApp.CoffeeDecorations coffee2Decoration : coffe2Decorations) {
            coffee2 = CoffeeShopApp.addDecorations(coffee2, coffee2Decoration);
        }

        // Print result
        System.out.println("Coffee 1: " + coffee1.getDecription() + "\n | cost = " + coffee1.getCost());
        System.out.println("Coffee 2: " + coffee2.getDecription() + "\n | cost = " + coffee2.getCost());

    }
}
