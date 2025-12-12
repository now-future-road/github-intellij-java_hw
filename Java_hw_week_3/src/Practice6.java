public class Practice6 {
    public static void main(String[] args){

    }
    public static void universalMethod() {
        }
    public static int universalMethod(int a, int b){
        System.out.println("Method2: summa");
        return a+b;

        }
    public static String universalMethod(String s, int count){
        System.out.println("Method 3: number of bytes in string");
        return s.repeat(count);
        }

    public static void universalMethod(boolean a){
        System.out.println("Method 4: boolean method");
    }
    public static void universalMethod(double[] a){
        System.out.println("Method 5: double method");
        int sum = 0;
        for(double d: a){
            sum +=d;
        }

    }
    public static void universalMethod(String s1, String s2){
        System.out.println("Method 6: string method");

    }
    public static int universalMethod(int numbers) {
        System.out.println("Method 7: int method");
        return numbers;

    }
    public static int universalMethod(String[] ls){
        System.out.println("Method 8: array method");
        return  Integer.parseInt(ls[1]);
    }
    public static long universalMethod(char a){
        System.out.println("Method 9: char method using long");
        return (long)a;
    }
    public static Boolean universialMethod(Float a){
        System.out.println("Method 10: float method using boolean");
        return a<0;
    }
    }

