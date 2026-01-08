public class Solution15 {
    public static void main(String[] args) {}
    interface Selectable{
        void onSelect();
    }
    interface Updatable extends Selectable{
        void refresh();
    }
    static class Screen implements Updatable, Selectable{
        public void refresh(){}
        public void  onSelect(){}

    }

    }

