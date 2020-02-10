package difficulty_1.difficulty_1_4.skener;

import java.util.Scanner;

public class Skener {

    private static int r, c, zr, zc;
    private static String[][] matrix;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        r = scanner.nextInt();
        c = scanner.nextInt();
        zr = scanner.nextInt();
        zc = scanner.nextInt();
        String s = scanner.nextLine();

        matrix = new String[r * zr][c * zc];
        for(int i = 0; i < r; i++) {
            String line = scanner.nextLine();
            for(int j = 0; j < c; j++) {
                char ch = line.charAt(j);

                for(int ii = 0; ii < zr; ii++) {
                    for(int jj = 0; jj < zc; jj++) {
                        matrix[i * zr + ii][j * zc + jj] = String.valueOf(ch);
                    }
                }
            }
        }

        printMatrix();
    }

    private static void printMatrix() {
        for(int i = 0; i < r * zr; i++) {
            for (int j = 0; j < c * zc; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}