package Task10;

import Task10.builder.Buiilder;
import Task10.Director.Director;
import Task10.builder.PizzaBuilder;
import Task10.builder.PizzaRecipeBuilder;
import Task10.PizzaType;


public class Solution {

    public static void main(String[] args) {
        Director director = new Director();

        PizzaBuilder builder = new PizzaBuilder(PizzaType.HAWAIIAN, "italian", "moritz", "tomatoes");
        director.makeHawaiianPizza(builder);
        Pizza pizza = builder.getResult();
        System.out.println("Pizza made:\n" + pizza.getType());

        PizzaRecipeBuilder recipeBuilder = new PizzaRecipeBuilder();
        director.makeSpicyPizza(recipeBuilder);
        Recipe pizzaRecipe = recipeBuilder.getResult();
      System.out.println("\nPizza recipe made:\n" + pizzaRecipe.print());
    }
}

