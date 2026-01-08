public class Task1_2 {
    public static void main(String[] args) {
        Skyscraper skycraper1 = new Skyscraper();
        Skyscraper skyscraper2 = new Skyscraper(100);
        Skyscraper skyscraper3 = new Skyscraper("JavaRushDevelopment");

    }
    static class Skyscraper{
        public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
        public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT =
                "Skyscraper is built. The number of floors - ";
        public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER =
                "Skyscraper is built. Developer - ";
        Skyscraper(){
            System.out.println(SKYSCRAPER_WAS_BUILD);
        }
        Skyscraper(int i){
            System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + i);
        }
        Skyscraper(String s){
            System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + s);
        }
    }
}
