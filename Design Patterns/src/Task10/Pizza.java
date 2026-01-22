package Task10;

public class Pizza {
    private final PizzaType type;
    private final String dough;
    private final String sauce;
    private final String topping;

    public Pizza(PizzaType type, String dough, String sauce, String topping) {
        this.type = type;
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    public PizzaType getType() {
        return type;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }
}


public class Recipe {
    private final PizzaType type;
    private final String dough;
    private final String sauce;
    private final String topping;

    public Recipe(PizzaType type, String dough, String sauce, String topping) {
        this.type = type;
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    public String print() {
        String recipe = type.getTitle() + "\n";
        recipe += "Тесто: " + dough + "\n";
        recipe += "Соус: " + sauce + "\n";
        recipe += "Начинка: " + topping + "\n";

        return recipe;
    }
}


