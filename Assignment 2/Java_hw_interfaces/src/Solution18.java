import java.util.ArrayList;
import java.util.List;

public class Solution18 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Repka", "Repka"));
        plot.add(new Person("Dedka", "Dedku"));
        plot.add(new Person("Babka", "Babka"));
        plot.add(new Person("Granddaughter", "Granddaughter"));
        RepkaStory.tell(plot);

    }
    interface RepkaItem{
        public void pull(Person person);

    }
    static class Person implements RepkaItem{
        String name;
        String namePadezh;
        public void pull(Person person, Person name){
            System.out.println(name + "for" + person);
        }
    }
}
