import java.util.Scanner;
public class Practice7 {
    public static void main(String[] args) {





    }
    public static void signIn(String username){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");
        input.nextLine();


        if(username.equals("user")){
            return;
        }
        if(username.equals(username)){
            System.out.println("Welcome " + username);
            System.out.println("Missed you very much, " + username);
        }

    }
}
