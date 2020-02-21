package difficulty_1.difficulty_1_5.jobExpenses;

import java.util.Scanner;

public class JobExpenses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNr = scanner.nextInt();
        scanner.nextLine();

        int sum = 0;
        for(int i = 0; i < totalNr; i++) {
            int nr = scanner.nextInt();

            sum += Math.max(nr, 0);
        }

        System.out.println(Math.abs(sum));

        scanner.close();
    }
}
