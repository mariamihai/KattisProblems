package difficulty_1.difficulty_1_8.simpleAddition;

import java.util.Scanner;

public class SimpleAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nr1 = scanner.nextLine().split("");
        String[] nr2 = scanner.nextLine().split("");

        int maxLength = Math.max(nr1.length, nr2.length);
        int[] result = new int[maxLength + 1];

        int toAdd = 0;
        for(int i = 0; i < maxLength + 1; i++) {
            int digit1, digit2;

            if(nr1.length - i > 0) digit1 = Integer.parseInt(nr1[nr1.length - 1 - i]);
            else digit1 = 0;

            if(nr2.length - i > 0) digit2 = Integer.parseInt(nr2[nr2.length - 1 - i]);
            else digit2 = 0;

            int currentSum = digit1 + digit2 + toAdd;

            if(currentSum >= 10) {
                result[result.length - 1 - i] = currentSum % 10;
                toAdd = 1;
            } else {
                result[result.length - 1 - i] = currentSum;
                toAdd = 0;
            }
        }

        if(result[0] != 0) System.out.print(result[0]);
        for (int i = 1; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
