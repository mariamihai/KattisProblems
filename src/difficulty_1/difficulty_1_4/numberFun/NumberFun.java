package difficulty_1.difficulty_1_4.numberFun;

import java.util.Scanner;

public class NumberFun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, result;

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            result = scanner.nextInt();

            if(validSet(x, y, result)) System.out.println("Possible");
            else System.out.println("Impossible");
        }
    }

    private static boolean validSet(int x, int y, int result) {
        return addition(x, y, result) || addition(y, x, result) ||
               substraction(x, y, result) || substraction(y, x, result) ||
               multiplication(x, y, result) || multiplication(y, x, result) ||
                division(x, y, result) || division(y, x, result);
    }

    private static boolean addition(int x, int y, int result) {
        return (x + y) == result;
    }

    private static boolean substraction(int x, int y, int result) {
        return (x - y) == result;
    }

    private static boolean multiplication(int x, int y, int result) {
        return (x * y) == result;
    }

    private static boolean division(int x, int y, int result) {
        return (x / y) == result && (x % y) == 0;
    }
}
