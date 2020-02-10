package difficulty_1.difficulty_1_3.lastFactorialDigit;

import java.util.Scanner;

public class LastFactorialDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrOfTests = scanner.nextInt();

        for (int i = 0; i < nrOfTests; i++) {
            int nr = scanner.nextInt();
            int result = 1;

            for (int factor = 2; factor <= nr; factor++) {
                result *= factor;
                result %= 10;
            }

            System.out.println(result);
        }
    }
}
