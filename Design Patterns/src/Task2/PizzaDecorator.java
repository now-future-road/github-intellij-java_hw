package Task2;

import Task1_1.Microscope;

abstract class  PizzaDecorator implements Pizza {
    private Pizza decoratedPizza;
    PizzaDecorator( Pizza decoratedPizza){
        this.decoratedPizza = decoratedPizza;


    }
    public double getCost(){
        return decoratedPizza.getCost();

    }
    public String getIngredients(){
        return decoratedPizza.getIngredients();

    }


}
