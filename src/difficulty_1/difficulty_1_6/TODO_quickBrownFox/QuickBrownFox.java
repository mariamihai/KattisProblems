package difficulty_1.difficulty_1_6.TODO_quickBrownFox;

import java.util.Scanner;

public class QuickBrownFox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < count; i++) {
            String str = scanner.nextLine();
            // upper and lower case letters, spaces, decimal digits
            // and punctuation characters ‘.’, ‘,’, ‘?’, ‘!’, ‘’’ and ‘"’.
            String replacedString = str.replaceAll("[\\s|\\d|.|,|?|!|'|\"]", "").toLowerCase();
            System.out.println(replacedString);

            char ch = 'a';

            StringBuilder builder = new StringBuilder();
            for(char check = 'a'; check <= 'z'; check = (char) (check + 1)) {
                if(!str.contains(String.valueOf(check))) {
                    builder.append(check);
                }
            }

            if(builder.length() == 0) System.out.println("pangram");
            else System.out.println("Missing " + builder);
        }
    }
}
