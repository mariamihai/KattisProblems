package difficulty_1.difficulty_1_6.moscowDream;

import java.util.Scanner;

public class MoscowDream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        if(isValidTotal(n) && areValidNumbers(a, b, c) && areEnoughProblems(a, b, c, n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isValidTotal(int n) {
        return n >= 3;
    }

    private static boolean areValidNumbers(int a, int b, int c) {
        return (a != 0) && (b != 0) && (c != 0);
    }

    private static boolean areEnoughProblems(int a, int b, int c, int n) {
        return (a + b + c) >= n;
    }
}
