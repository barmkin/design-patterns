package it.gb.pizzaBuilder;

public abstract class PizzaBuilderApp {
    
    public static void executePizzaBuilderApp() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder
            .setCrust(Pizza.CrustType.CAULIFLOWER)
            .setSize(Pizza.Size.JUMBO)
            .addIngredient(Pizza.Cheese.MOZZARELLA)
            .addIngredient(Pizza.Meat.TUNA)
            .addIngredient(Pizza.Vegetable.ONIONS);

        Pizza jumboTunaAndOnions = new Pizza(pizzaBuilder);

        System.out.println(jumboTunaAndOnions);
    }
}
