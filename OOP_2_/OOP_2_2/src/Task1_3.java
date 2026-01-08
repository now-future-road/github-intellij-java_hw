public class Task1_3 {
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        skyscraper.output();

    }
    static class Skyscraper{
        public void output(){
            System.out.println(floorsCount);
            System.out.println(Developer);
        }


        private int floorsCount;
        private String Developer;
        public  Skyscraper(){
            floorsCount = 5;
            Developer = "JavaRushDevelopment";
        }
        public Skyscraper(int i, String s){
            this.floorsCount = i;
            this.Developer = s;
        }


    }


}

