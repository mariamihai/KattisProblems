package difficulty_1.difficulty_1_5.tri;

import java.util.Scanner;

public class Tri {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        validate(n1, n2, n3);
    }

    private static void validate(int x, int y, int z) {
        if(addition(x, y, z)) {
            print(x, "+", y, "=", z);
            return;
        }
        if(addition(y, z, x)) {
            print(x, "=", y, "+", z);
            return;
        }

        if(substraction(x, y, z)) {
            print(x, "-", y, "=", z);
            return;
        }
        if(substraction(y, z, x)) {
            print(x, "=", y, "-", z);
            return;
        }

        if(multiplication(x, y, z)) {
            print(x, "*", y, "=", z);
            return;
        }
        if(multiplication(y, z, x)) {
            print(x,"=", y, "*", z);
            return;
        }

        if(division(x, y, z)) {
            print(x, "/", y, "=", z);
            return;
        }
        if(division(y, z, x)) {
            print(x,"=", y, "/", z);
            return;
        }
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

    private static void print(int x, String op1, int y, String op2, int z) {
        System.out.println(x + op1 + y + op2 + z);
    }
}
