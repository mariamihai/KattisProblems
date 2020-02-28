package difficulty_1.difficulty_1_6.leftBeehind;

import java.util.Arrays;
import java.util.Scanner;

public class LeftBeehind {

    private static String endOfTestCases = "0 0";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        while(isNotEndOfTests(line)) {
            Integer[] numbers = getNumbers(line);

            if(isSuperstition(numbers)) {
                System.out.println("Never speak again.");
            } else if(isMoreSweet(numbers)) {
                System.out.println("To the convention.");
            } else if(isMoreSour(numbers)) {
                System.out.println("Left beehind.");
            } else {
                // The values are equal
                System.out.println("Undecided.");
            }

            line = scanner.nextLine();
        }

        scanner.close();
    }

    private static Integer[] getNumbers(String line) {
        return Arrays.stream(line.split(" ")).mapToInt(Integer::valueOf).boxed().toArray(Integer[]::new);
    }

    private static boolean isNotEndOfTests(String line) {
        return !endOfTestCases.equals(line);
    }

    private static boolean isSuperstition(Integer[] numbers) {
        return (numbers[0] + numbers[1]) == 13;
    }

    private static boolean isMoreSweet(Integer[] numbers) {
        return numbers[0] > numbers[1];
    }

    private static boolean isMoreSour(Integer[] numbers) {
        return numbers[0] < numbers[1];
    }
}
