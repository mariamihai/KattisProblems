package difficulty_1.difficulty_1_7.pervasiveHeartMonitor;

import java.util.Scanner;

public class pervasiveHeartMonitor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split(" ");

            calculateAvg(split);
        }
    }

    private static void calculateAvg(String[] split) {
        StringBuilder builder = new StringBuilder();
        double sum = 0;
        int count = 0;

        for(int i = 0; i < split.length; i++) {
            try{
                sum += Double.parseDouble(split[i]);
                count++;
            } catch(Exception e) {
                builder.append(split[i]).append(" ");
            }
        }

        System.out.println(sum / count + " " + builder);
    }
}
