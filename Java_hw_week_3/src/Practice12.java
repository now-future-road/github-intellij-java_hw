public class Practice12 {


    public static String city = "Tokio";
    public static double popu = 36.7;


    public static void main(String[] args){
        printCityPopu("Jakarta", 25.3);
        printCityPopu("Seoul" , 25.2);
        printCityPopu("Delhi" , 23.1);
        printCityPopu("NY", 21.6);

    }
    static void printCityPopu(String city1, double popu2){
        System.out.println( city1 +" "+  popu2);
        System.out.println("While " + city + "is greater than" + popu) ;

    }

    }

