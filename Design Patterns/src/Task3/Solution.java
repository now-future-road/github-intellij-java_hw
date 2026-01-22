package Task3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        DB database = new BloodDBProxy();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make request: ");
        String request = scanner.nextLine();

        if(request.matches("\\d+"){
            BloodSample result = database.getbase.getById(Integer.parseInt(request));
            printSample(result);

    }
        else{
            List<BloodSample> results = database.find(request);
            printSamplees(results);
        }
        private static void printSample(BloodSample sample){
            System.out.println(nonNull(sample) ? sample : "No results");
        }

        private static void printSamples(List <BloodSample> samples){
            if(samples.isEmpty()){
                System.out.println("No results");
            }else{
                samples.forEach(System.out::println);
            }

        }
}
}
