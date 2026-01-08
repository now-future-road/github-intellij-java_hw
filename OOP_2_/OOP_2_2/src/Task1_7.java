import java.util.Scanner;
public class Task1_7 {
    public static void main(String[] args) {
        Programmer pg = new Programmer();
        System.out.println(pg.getter());
        System.out.println("Printing for getter");
        pg.setter(100);
    }
    static class Programmer{
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        private int Salary = 100;
        int getter(){
            return Salary;

        }

        void setter(int Salary) {
            this.Salary = Salary;
            if (input > Salary) {
                System.out.println(input);

            } else {
                System.out.println(Salary);
            }
        }


    }

}
