public class Solution6 {
    public static  void main(String[] args){

    }
    public interface Selectable{
        void onSelect();
    }
    public interface Updatable{
        void refresh();
    }
    public static class Screen implements Selectable, Updatable{
        public void onSelect(){
            System.out.println("Selecting");
        }
        public void refresh(){
            System.out.println("Updating");
        }

    }
}
