package difficulty_1.difficulty_1_6.soylent;

import java.util.Scanner;

public class Soylent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for(int i = 0; i < count; i++) {
            int totalCalories = scanner.nextInt();
            System.out.println(totalCalories / 400 + (totalCalories % 400 == 0 ? 0 : 1));
        }
    }
}
