import java.util.Collections;

class Practice5{
    public static void main(String[] args){
        int[] array = {1,2,3,4,4,5,6,7,8,9,0};
        printArray(array);
        reverseArray(array);
        printArray(array);



    }
    public static void printArray(int[] array){
        for(int i : array){
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void reverseArray(int[] array){
        int left = 0;
        int right = array.length -1;

        while(left< right){
            int tit = array[right];
            array[right] = array[left];
            array[left] = tit;

            left++;
            right--;
        }





    }
}