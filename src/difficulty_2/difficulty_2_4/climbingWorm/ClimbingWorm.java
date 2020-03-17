package difficulty_2.difficulty_2_4.climbingWorm;

import java.util.Scanner;

public class ClimbingWorm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int climbValue = scanner.nextInt();
        int fallValue = scanner.nextInt();
        int totalValue = scanner.nextInt();

        int cnt = 0;
        while(totalValue > 0) {
            totalValue -= climbValue;
            totalValue += fallValue;
            cnt++;
        }

        System.out.println(cnt);

        scanner.close();
    }
}
