import java.util.Arrays;

public class Practice10{
    public static void main(String[] args) {
        int[] b = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        };
        System.out.println("In array: ");
        System.out.println(Arrays.toString(b));
        System.out.println("Max value is " + getMaxvalue(b));
        System.out.println("Min value is " + getMinvalue(b));
    }
    static int getMaxvalue(int[] array){
        int max = array[0];
        for(int j : array){
            if(max < j){
                max = j;
            }
        }
        return max;

    }
    static int getMinvalue(int[] array){
                int min = array[0];
                for(int j : array){
                    if(min > j){
                        min = j;
                    }
                }
                return min;

    }
    static void getArray(int[] array){
        for(int j : array){

            System.out.println(j);
        }
    }
}