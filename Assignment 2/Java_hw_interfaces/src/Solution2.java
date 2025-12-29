public class Solution2 {
    public static void main(String[] args){
        Car car = new Car();
        Airplane airplane = new Airplane();
        Dog dog = new Dog();
        Duck duck = new Duck();
        dog.eat();
        dog.move();
        car.move();
        airplane.move();
        airplane.fly();
        duck.move();
        duck.eat();
        duck.move();
        duck.fly();


        }

    public interface CanFly{
        void fly();
    }
    public interface CanMove{
        void move();
    }
    public interface CanEat{
        void eat();
    }
    public static class Dog implements CanEat, CanMove{
        @Override
        public void eat() {
            System.out.println("Dog eat");
        }
        public void move(){
            System.out.println("Dog move");
        }


    }
    public static class Car implements CanMove{
        @Override
        public void move() {
            System.out.println("Car move");
        }
    }
    public static class Airplane implements CanMove, CanFly{
        @Override
        public void fly(){
            System.out.println("Airplane fly");
        }
        public void move(){
            System.out.println("Airplane move");
        }
    }
    public static class Duck implements CanEat, CanMove, CanFly{
        @Override
        public void eat(){
            System.out.println("Duck eat");
        }
        public void move(){
            System.out.println("Duck move");
        }
        public void fly(){
            System.out.println("Duck fly");
        }
    }
}