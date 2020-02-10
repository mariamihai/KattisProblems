package difficulty_1.difficulty_1_2.autori;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] splits = line.split("-");
        for(int i = 0; i < splits.length; i++) {
            result.append(splits[i].charAt(0));
        }

        System.out.println(result);
    }
}
