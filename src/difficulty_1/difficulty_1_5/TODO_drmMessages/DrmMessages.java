package difficulty_1.difficulty_1_5.TODO_drmMessages;

import java.util.Scanner;

public class DrmMessages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String firstHalf = text.substring(0, text.length() / 2);
        String secondHalf = text.substring(text.length() / 2);

        System.out.println(firstHalf);
        System.out.println(secondHalf);

        System.out.println(rotate(firstHalf, sumOfLetters(firstHalf)));
        System.out.println(rotate(secondHalf, sumOfLetters(secondHalf)));
    }

    private static Integer sumOfLetters(String text) {
        int sum = 0;

        // 'A' = 65
        for(int i = 0; i < text.length(); i++) {
            sum += text.charAt(i) - 65;
        }

        return sum;
    }

    private static String rotate(String text, Integer positions) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < text.length(); i++) {
            int ch = 65 + (text.charAt(i) + positions % 25) % 25;

            builder.append((char)ch);
        }

        return builder.toString();
    }
}
