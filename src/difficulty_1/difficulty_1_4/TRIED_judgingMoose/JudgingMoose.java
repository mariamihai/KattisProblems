package difficulty_1.difficulty_1_4.TRIED_judgingMoose;

import java.util.Scanner;

public class JudgingMoose {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int r = scanner.nextInt();

        if ( l == 0 || r == 0) {
            System.out.println("Not a moose");
            return;
        }

        if(l == r)  {
            System.out.println("Even " + l * 2);
            return;
        }

        System.out.println("Odd " + Math.max(l, r) * 2);
    }
}
