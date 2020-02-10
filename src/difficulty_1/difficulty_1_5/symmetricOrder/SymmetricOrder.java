package difficulty_1.difficulty_1_5.symmetricOrder;

import java.util.Scanner;

public class SymmetricOrder {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        String[] names;

        int nr = scanner.nextInt();
        scanner.nextLine();
        while(nr != 0) {
            names = new String[nr];

            for(int i = 0; i < nr / 2; i++) {
                String s1 = scanner.nextLine();
                String s2 = scanner.nextLine();

                names[i] = s1;
                names[nr - i - 1] = s2;
            }
            if(nr % 2 == 1) names[nr / 2] = scanner.nextLine();

            System.out.println("SET " + count++);
            for(int i = 0; i < nr; i++) {
                System.out.println(names[i]);
            }

            nr = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
