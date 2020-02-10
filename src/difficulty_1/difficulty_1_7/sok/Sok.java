package difficulty_1.difficulty_1_7.sok;

import java.util.Scanner;

public class Sok {
    private static double leftOver2, leftOver3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOrange = scanner.nextDouble();
        double amountApple = scanner.nextDouble();
        double amountPineapple = scanner.nextDouble();

        double ratioOrange = scanner.nextDouble();
        double ratioApple = scanner.nextDouble();
        double ratioPineapple = scanner.nextDouble();

        if(isSolution(amountOrange, amountApple, amountPineapple, ratioOrange, ratioApple, ratioPineapple)) {
            System.out.println(0.00 + " " + leftOver2 + " " + leftOver3);
        } else if(isSolution(amountApple, amountOrange, amountPineapple, ratioApple, ratioOrange, ratioPineapple)) {
            System.out.println(leftOver2 + " " + 0.00 + " " + leftOver3);
        } else if(isSolution(amountPineapple, amountOrange, amountApple, ratioPineapple, ratioOrange, ratioApple)) {
            System.out.println(leftOver2 + " " + leftOver3 + " " + 0.00);
        }
    }

    private static boolean isSolution(double amount1, double amount2, double amount3,
                                      double ratio1, double ratio2, double ratio3) {
        double first = getFirst(amount1, ratio1);
        leftOver2 = getLeftOver(first, amount2, ratio2);
        leftOver3 = getLeftOver(first, amount3, ratio3);

        return !(leftOver2 < 0 || leftOver3 < 0);
    }


    private static double getFirst(double amount, double ratio) {
        return amount / ratio;
    }

    private static double getLeftOver(double initial, double amount, double ratio) {
        return amount - initial * ratio;
    }
}
