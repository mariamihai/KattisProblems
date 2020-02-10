package difficulty_1.difficulty_1_2.coldPuterScience;

import java.util.Scanner;

public class ColdPuterScience {


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t, count = 0;

        for (int i = 0; i < n; i++) {
            t = scanner.nextInt();

            if( t < 0) count++;
        }

        System.out.println(count);
    }
}
