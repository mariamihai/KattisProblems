package difficulty_1.difficulty_1_3.batterUp;

import java.util.Scanner;

public class BatterUp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int totalNr = 0;
        int sum = 0;
        for(int i = 0; i < count; i++) {
            int nr = scanner.nextInt();
            if(nr >= 0) {
                totalNr++;
                sum += nr;
            }
        }

        System.out.println(((double) sum) / totalNr);
    }
}
