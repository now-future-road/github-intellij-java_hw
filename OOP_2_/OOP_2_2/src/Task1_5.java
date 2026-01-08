public class Task1_5 {
    public static void main(String[] args) {
        Building building = new Building("Restaurant");
        System.out.println(building.type);
        building.initialize("Barbershop");
    }
    static class Building{
        private String type;
        public Building(String type){
            this.type = type;
        }

        public void initialize(String type1){


            System.out.println(type1);
        }


    }
}
