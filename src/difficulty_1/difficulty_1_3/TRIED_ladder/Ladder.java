package difficulty_1.difficulty_1_3.TRIED_ladder;

import java.util.Scanner;

public class Ladder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int v = scanner.nextInt();

        scanner.close();

        System.out.println(Math.ceil(h * Math.sin(90) / Math.sin(v)));
    }

}