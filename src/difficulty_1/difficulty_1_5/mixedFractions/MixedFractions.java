package difficulty_1.difficulty_1_5.mixedFractions;

import java.util.Scanner;

public class MixedFractions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        while (n1 != 0 && n2 != 0) {
            System.out.println((n1 / n2) + " " + (n1 % n2 ) + " / " + n2);

            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
        }
    }
}
