package SigmaProblems;

import java.util.Scanner;

/**
 * 1.5. QuickEstimates - DONE
 */
public class ProblemA {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < numberOfEntries; i++) {
            String cost = scanner.nextLine();
            result.append(cost.length()).append(System.lineSeparator());
        }

        System.out.println(result);
    }
}
