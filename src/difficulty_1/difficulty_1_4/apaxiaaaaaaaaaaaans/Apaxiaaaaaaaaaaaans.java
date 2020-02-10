package difficulty_1.difficulty_1_4.apaxiaaaaaaaaaaaans;

import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        StringBuilder builder = new StringBuilder();

        char saved = name.charAt(0);
        builder.append(saved);

        for(int i = 1; i < name.length(); i++) {
            char current = name.charAt(i);

            if(saved != current) {
                builder.append(current);
                saved = current;
            }
        }

        System.out.println(builder);
    }
}
