package difficulty_1.difficulty_1_4.alphabetSpam;

import java.util.Scanner;

public class AlphabetSpam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int whitespaceNr = 0;
        int lowercaseNr = 0;
        int uppercaseNr = 0;
        int speciatChNr = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if('_' == ch) whitespaceNr++;
            else if(97 <= ch && ch <= 122) lowercaseNr++;
            else if(65 <= ch && ch <= 90) uppercaseNr++;
            else speciatChNr++;
        }

        System.out.println(((double) whitespaceNr) / str.length());
        System.out.println(((double) lowercaseNr) / str.length());
        System.out.println(((double) uppercaseNr) / str.length());
        System.out.println(((double) speciatChNr) / str.length());
    }
}
