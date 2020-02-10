package difficulty_1.difficulty_1_3.r2;

import java.util.Scanner;

public class R2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int s = scanner.nextInt();

        System.out.println(2 * s - r1);

        scanner.close();
    }

}