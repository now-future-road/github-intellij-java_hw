package Task2;

public class WithArugula extends PizzaDecorator{
    public WithArugula(Pizza pizza) {super(pizza);}
    public double getCost(){
        return super.getCost();
    }
    public String getIngredients(){
        return super.getIngredients();
    }
}
