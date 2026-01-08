import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1_6 {
    public static void main(String[] args) {
        Bugatti bu = new Bugatti();
        System.out.println(bu.getBody());
        System.out.println(bu.setBody("Coupe"));
    }
    static class Bugatti {


        String color = "Black";
        int year = 2020;
        String body = "Coupe";

        Bugatti() {

        }

        public String getBody() {
            return body;

        }

        public String setBody(String body) {
            this.body = body;
            return body;

        }
    }

    }



