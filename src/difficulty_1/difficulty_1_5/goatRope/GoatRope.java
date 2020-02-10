package difficulty_1.difficulty_1_5.goatRope;

import java.util.Scanner;

public class GoatRope {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println(calculate(x, y, x1, y1, x2, y2));
    }

    private static boolean isBetween(int z, int z1, int z2) {
        return z > z1 && z < z2;
    }

    private static double calculate (int x, int y, int x1, int y1, int x2, int y2) {
        if(isBetween(x, x1, x2)) {
            return getMin(y, y1, y2);
        }
        if(isBetween(y, y1, y2)) {
            return getMin(x, x1, x2);
        }
        return Math.sqrt(Math.pow(getMin(x, x1, x2), 2) +
                Math.pow(getMin(y, y1, y2), 2));
    }

    private static int getMin(int z, int z1, int z2) {
        return Math.min(Math.abs(z - z1), Math.abs(z - z2));
    }
}
