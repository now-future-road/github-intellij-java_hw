public class Solution4 {
    public static void main(String[] args){

    }
    public interface CanRun{
        void run();
    }
    public interface CanSwim{
        void swim();
    }
    public static abstract class Human implements CanRun, CanSwim{}
}
