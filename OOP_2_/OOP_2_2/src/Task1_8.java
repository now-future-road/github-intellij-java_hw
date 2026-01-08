
public class Task1_8 {
    public static void main(String[] args) {
        String11 s1 = new String11("JavaITU");
        String11 s2 = new String11("JavaENU");
        String11 s3 = new String11("JavaITU");
        String s1_1 = "JavaENU";
        String s2_2 = "JavaENU";
        String s3_3= "JavaENU";
        System.out.println(s1.s1.equals(s3_3));
        System.out.println(s2.s1.equals(s3_3));
        System.out.println();



    }
    static class String11{
        String s1;
        String11(String s1) {
            this.s1 = s1;

        }

    }
}
