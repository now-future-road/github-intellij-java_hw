package Task10.builder;
import Task10.PizzaType;

public interface Buiilder {
    void setType(PizzaType type);
    void setDough(String dough);
    void setSauce(String sauce);
    void setTopping(String topping);
}
