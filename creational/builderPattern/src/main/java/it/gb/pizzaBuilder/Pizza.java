package it.gb.pizzaBuilder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private Pizza.CrustType crust;
    private Pizza.Size size;
    private List<String> ingredients;

    public Pizza(PizzaBuilder builder) {
        super();
        this.crust = builder.getCrust();
        this.size = builder.getSize();
        this.ingredients = new ArrayList<String>();
        this.ingredients.addAll(builder.getIngredients());
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

    public static enum CrustType {
        NEAPOLITAN,
        NEW_YORK_STYLE,
        CHICAGO_STYLE_DEEP_DISH,
        SICILIAN,
        THIN_AND_CRISPY,
        STUFFED,
        MULTIGRAIN,
        GLUTEN_FREE,
        CAULIFLOWER,
        FLATBREAD,
        PITABREAD,
        FOCACCIA,
        DETROIT,
        GREEK,
        TORTILLA,
        ARTISANAL,
        GRILLED,
        PRETZEL,
        INDIAN,
        FRENCH
    }

    public static enum Size {
        SMALL,
        STANDARD,
        LARGE,
        JUMBO
    }

    public static enum Cheese {
        PARMESAN,
        MOZZARELLA,
        RICOTTA,
        CHEDDAR,
        PROVOLONE,
        FONTINA,
        GOUDA,
        BLUE_CHEESE,
        CHEVRE
    }

    public static enum Meat {
        PEPPERONI_SLICES,
        ITALIAN_SAUSAGE,
        GROUND_BEEF,
        BACON_STRIPS,
        HAM_SLICES,
        CHICKEN_SHREDDED,
        ANCHOVIES,
        WURSTEL,
        TUNA,
        SALMON
    }

    public static enum Vegetable {
        BELL_PEPPERS,
        ONIONS,
        MUSHROOMS,
        BLACK_OLIVES,
        GREEN_OLIVES,
        JALAPENO,
        SPINACH,
        BASIL,
        ARTICHOKE
    }

    @Override
    public String toString() {
        return "Pizza [crust=" + crust + ", size=" + size + ", ingredients=" + ingredients + "]";
    }


}
