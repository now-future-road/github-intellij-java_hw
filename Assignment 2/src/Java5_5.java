import java.util.Scanner;

public class Java5_5 {
    public static void main(String[] args) {


        try (Scanner input = new Scanner(System.in)) {

            int sum = 0;
            while (true) {
                System.out.println("Enter number (\"enter\" for quit)");
                String user_input = input.nextLine().trim();

                if (user_input.equals("enter")) {
                    break;
                }


                int n = Integer.parseInt(user_input);
                sum += n;
            }
            System.out.println(sum);

        }
    }
}





