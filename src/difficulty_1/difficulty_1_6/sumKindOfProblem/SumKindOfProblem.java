package difficulty_1.difficulty_1_6.sumKindOfProblem;

import java.util.Scanner;

public class SumKindOfProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for(int i = 0; i < count; i++) {
            System.out.print(scanner.nextInt() + " ");
            int nr = scanner.nextInt();
            int sumN = nr * (nr + 1) / 2;
            int sumEvenN = sumN * 2;
            System.out.println(sumN + " " + (sumEvenN - nr) + " " + sumEvenN);
        }
    }
}
