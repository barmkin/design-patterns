package it.gb.pizzaBuilder;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private Pizza.CrustType crust;
    private Pizza.Size size;
    private List<String> ingredients;

    public PizzaBuilder() {
        super();
        this.ingredients = new ArrayList<String>();
    }

    public Pizza.CrustType getCrust() {
        return crust;
    }
    public Pizza.Size getSize() {
        return size;
    }
    public List<String> getIngredients() {
        return ingredients;
    }

    public PizzaBuilder setCrust(Pizza.CrustType crust) {
        this.crust = crust;
        return this;
    }

    public PizzaBuilder setSize(Pizza.Size size) {
        this.size = size;
        return this;
    }
    
    public PizzaBuilder addIngredient(Pizza.Cheese cheese) {
        this.ingredients.add(cheese.name());
        return this;
    }

    public PizzaBuilder addIngredient(Pizza.Meat meat) {
        this.ingredients.add(meat.name());
        return this;
    }

    public PizzaBuilder addIngredient(Pizza.Vegetable vegetable) {
        this.ingredients.add(vegetable.name());
        return this;
    }
}
