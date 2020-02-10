package difficulty_1.difficulty_1_3.pieceOfCake;

import java.util.Scanner;

public class PieceOfCake {

    private static int THICKNESS = 4;

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int v = scanner.nextInt();

        System.out.println(THICKNESS * (h > (n - h) ? h : (n - h)) * (v > (n - v) ? v : (n - v)));
    }
}
