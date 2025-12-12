import java.util.Scanner;

public class Task9_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1-start(n):  ");
        int n1_start = input.nextInt();

        System.out.print("Enter 2-end(n):    ");
        int n2_end = input.nextInt();

        System.out.print("Enter 3-multiple(n): ");
        int n3_multiple = input.nextInt();


        int i_start;
        if (n1_start % n3_multiple == 0) {
            i_start = n1_start;
        } else {
            i_start = n1_start + (n3_multiple - (n1_start % n3_multiple));
        }

        int sum = 0;


        for(int i = i_start; i <= n2_end; i *= n3_multiple) {
            sum += i;
        }

        if (n1_start != i_start && n1_start < n2_end) {
            sum += n1_start;
            System.out.println(n1_start);
        }

        System.out.println(sum);


    }
}