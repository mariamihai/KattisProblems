package difficulty_1.difficulty_1_3.detailedDifferences;

import java.util.Scanner;

public class DetailedDifferences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrTests = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < nrTests; i++) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            System.out.println(first);
            System.out.println(second);
            for(int j = 0; j < first.length(); j++) {
                if(first.charAt(j) == second.charAt(j)) System.out.print(".");
                else System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
