public class Task4 {
    public static void main(String[] args) {
    }

    static class Entity {
        public void move(){
            System.out.println("I am moving");
        }
        public void eat(){
            System.out.println("I am eating");
        }
    }

    static class Human extends Entity {
        public void speak(){
            System.out.println("I can communicate");
        }
    }

    static class JavaDeveloper extends Human {
        public void code(){
            System.out.println("I know how to communicate in Java");
        }
    }
}