public class Solution13 {
    public static void main(String[] args) {}

    interface DBObject{
        DBObject initializeIdAndName(long id, String name);
    }
    static class User implements DBObject{
        long id;
        String name;
        public void initializeIdAndName(){
            System.out.println("The user's name is " + name + id );
        }
    }
    static class Matrix{
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }
    }

}
