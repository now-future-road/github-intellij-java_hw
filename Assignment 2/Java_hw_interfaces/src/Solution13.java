public class Solution13 {
    public static void main(String[] args) {
        System.out.println(Matrix.NEO);
    }
    static class Matrix{
        public static DBObject NEO = new User().initializeldAndName(1,"Neo");
    }
    interface DBObject{
        void initializeldAndName(int i,String name);
    }
    static class User implements DBObject{
        int i;
        String name;

        @Override
        public void initializeldAndName(int i,String name){
            this.i=i;
            this.name=name;

        }
        @Override
        public String toString(){
            return String.format("The user's name is %s, id = #d", name, i);
        }

    }
}
