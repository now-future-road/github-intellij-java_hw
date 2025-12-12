public class Task7_7 {
    public static void main(String[] args){
        int n = 0;
        int sum = 0;
        while(n<=100){
            if(n %3 !=0){
                sum +=n;
            }
            n++;

        }
        System.out.println(sum);
    }
}