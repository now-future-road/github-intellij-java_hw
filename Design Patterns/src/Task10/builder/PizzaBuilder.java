package Task10.builder;
import Task10.Pizza;
import Task10.PizzaType;

public class PizzaBuilder implements Buiilder {
    private PizzaType type;
    private String dough;
    private String sauce;
    private String topping;

   public void setType(){
   }

    @Override
    public void setType(PizzaType type) {

    }

    public void setDough(String dough){
       this.dough = dough;
   }
    public void setSauce(String sauce){
       this.sauce = sauce;
    }
    public void setTopping(String topping){
       this.topping = topping;
    }

    public PizzaBuilder(PizzaType type, String dough, String sauce, String topping){


    }

    public Pizza getResult() {
       return null;
    }
}
