import java.util.Scanner;
import java.lang.Math;
public class Practice11 {
    public static void main(String[] args) {
        int[] array= new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){

            array[i] = sc.nextInt();
        }

        sc.close();
        Sqrt(array);


    }
    static void Sqrt(int[] array1){


        for(int j : array1){
            double result = Math.sqrt(j);
            System.out.println(result);
        }



    }

}
