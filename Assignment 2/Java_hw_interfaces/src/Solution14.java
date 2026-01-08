public class Solution14 {
    public static void main(String[] args){

    }
    interface Desire{}
    interface Dream{}

    static class Hobby implements Desire, Dream{
        static int Index = 1;
        @Override
        public String toString(){
            Index++;
            return ""+Index;
        }
    }
}
