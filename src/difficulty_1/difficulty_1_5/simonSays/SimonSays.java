package difficulty_1.difficulty_1_5.simonSays;

import java.util.Scanner;

public class SimonSays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < n; i++) {
            String str = scanner.nextLine();

            if(str.contains("Simon says")) {
                System.out.println(str.replace("Simon says ", ""));
            }
        }
    }
}
