package Task2;

public class TheMain2 extends Solution {



    public static void main(String[] args) {

        Pizza pd = new SimplePizza();
        pd = new WithArugula(pd);
        printinfo(pd);
        pd = new WithSausage(pd);




    }

}
