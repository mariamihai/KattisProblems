package difficulty_1.difficulty_1_7.mirrorImages;

import java.util.Scanner;

public class MirrorImages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTests = scanner.nextInt();
        for(int i = 0; i < countTests; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            scanner.nextLine();

            String s = "";
            for(int j = 0; j < r; j++) {
                String line = scanner.nextLine();
                s = new StringBuilder(line).reverse().toString() + "\n" + s;
            }

            System.out.println("Test " + (i + 1));
            System.out.println(s);
        }
    }
}
