package difficulty_1.difficulty_1_7.statistics;

import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCaseNr = 0;
        while(scanner.hasNextLine()) {
            testCaseNr++;

            int count = scanner.nextInt();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < count; i++) {
                int nr = scanner.nextInt();
                if(nr < min) min = nr;
                if(nr > max) max = nr;
            }

            System.out.println("Case " + testCaseNr + ": " + min + " " + max + " " + (max - min));
            scanner.nextLine();
        }
    }
}
