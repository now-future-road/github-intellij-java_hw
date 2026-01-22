package Task2;

public class WithSausage extends PizzaDecorator {
    public WithSausage(Pizza pizza){
         super(pizza);
    }
    public double getCost(){
        return super.getCost();
    }
    public String getIngredients(){
        return super.getIngredients();
    }

}
