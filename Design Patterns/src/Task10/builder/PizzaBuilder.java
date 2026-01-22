package Task10.builder;

public class PizzaBuilder implements Buiilder {
    private PizzaType type;
    private String dough;
    private String sauce;
    private String topping;

   public void setType(){
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
}
