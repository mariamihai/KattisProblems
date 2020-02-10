package difficulty_1.difficulty_1_3.pot;

import java.util.Scanner;

public class Pot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int x = 0;
        for(int i=0; i<count; i++) {
            int p = scanner.nextInt();
            x += Math.pow(p/10, p%10);
        }
        scanner.close();

        System.out.println(x);
    }

}