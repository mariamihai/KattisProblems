package difficulty_1.difficulty_1_4.zamka;

import java.util.Scanner;

public class Zamka {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        int D = scanner.nextInt();
        int X = scanner.nextInt();

        for(int i = L; i <= D; i++) {
            int sum = String.valueOf(i).chars()
                    .map(Character::getNumericValue)
                    .sum();
            if(sum == X) {
                System.out.println(i);
                break;
            }
        }

        for(int i = D; i >= L; i--) {
            int sum = String.valueOf(i).chars()
                    .map(Character::getNumericValue)
                    .sum();
            if(sum == X) {
                System.out.println(i);
                break;
            }
        }

    }
}
