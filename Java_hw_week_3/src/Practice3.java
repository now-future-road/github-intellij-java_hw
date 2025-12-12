public class Practice3 {
    public static void printl(String name, String dish, String surname){
        System.out.println("Brief Dossier:");
        System.out.println("Name: " + name);
        System.out.println("LastName: " + surname);
        System.out.println("Favorite dish: " + dish);
    }
    public static void main(String[] args){
        String a = "Olga";
        String b = "Kipriyanovna";
        String c = "Dumplings";
        printl(a,b,c);
    }
}
