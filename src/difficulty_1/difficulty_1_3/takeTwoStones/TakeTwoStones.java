package difficulty_1.difficulty_1_3.takeTwoStones;

import java.util.Scanner;

public class TakeTwoStones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int leftStone = scanner.nextInt();

        if((leftStone % 10) % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
