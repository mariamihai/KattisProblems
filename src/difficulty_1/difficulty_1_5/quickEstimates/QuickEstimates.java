package difficulty_1.difficulty_1_5.quickEstimates;

import java.util.Scanner;

public class QuickEstimates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for(int i = 0; i < count; i++) {
            String str = scanner.next();
            System.out.println(str.length());
        }
    }
}
