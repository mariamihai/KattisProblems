package difficulty_1.difficulty_1_4.sumSquaredDigitsFunction;

import java.util.Scanner;

public class SumSquaredDigitsFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNrCases = scanner.nextInt();

        for(int i = 0; i < countNrCases; i++) {
            int nrTestCase = scanner.nextInt();
            int base = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println(nrTestCase + " " + evaluateN(base, n));
        }
    }

    private static int evaluateN(int base, int n) {
        int ssd = 0;
        
        while(n > 0) {
            int remainder = n % base;
            ssd += remainder * remainder;
            n /= base;
        }

        return ssd;
    }
}
