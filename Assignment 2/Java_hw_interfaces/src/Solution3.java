public class Solution3 {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.run();
        penguin.swim();

        Airplane airplane = new Airplane();
        airplane.fly();

        Human human = new Human();
        human.run();
        human.swim();

        Duck duck = new Duck();
        duck.fly();
        duck.swim();
        duck.run();
    }


    public interface CanFly {
        public void fly();
    }
    public interface CanRun {
        public void run();
    }
    public interface CanSwim {
        public void swim();
    }
    public static class Human implements CanRun, CanSwim {
        public void swim(){
            System.out.println("Person Swim");
        }
        public void run(){
            System.out.println("Person Run");
        }
    }
    public static class Duck implements CanFly, CanRun, CanSwim {
        public void swim(){
            System.out.println("Duck Swim");
        }
        public void run(){
            System.out.println("Duck Run");
        }
        public void fly(){
            System.out.println("Duck Fly");
        }

    }
    public static class Penguin implements CanRun, CanSwim {
        public void swim(){
            System.out.println("Penguin Swim");
        }
        public void run(){
            System.out.println("Penguin Run");
        }
    }
    public static class Airplane implements CanFly {
        public void fly(){
            System.out.println("Airplane Fly");
        }
    }}