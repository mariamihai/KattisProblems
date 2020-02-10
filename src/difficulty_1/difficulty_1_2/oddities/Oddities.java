package difficulty_1.difficulty_1_2.oddities;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfTests; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if(number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }

    }
}
