import java.util.Scanner;
public class  Practice8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()){
            long num =  input.nextLong();
            System.out.println(cube(num));
        input.close();
        }


    }
    public static long cube(long n){
        return n*n*n;
    }
}