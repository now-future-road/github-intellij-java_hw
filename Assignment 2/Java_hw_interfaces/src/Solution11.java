public class Solution11 {
    interface Eat{

    }
    interface  Move{

    }
    interface Eatable
    {}

    class Dog implements Eat,Move{ }
    class Cat implements Eat, Move, Eatable{}
    class Mouse implements Eatable, Move{}
}