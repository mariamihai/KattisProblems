package difficulty_1.difficulty_1_5.reverseRot;

import java.util.Scanner;

public class ReverseRot {

    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr = scanner.nextInt();
        String text;

        while(nr != 0) {
            text = scanner.next();
            System.out.println(shift(reverse(text), nr));

            nr = scanner.nextInt();
        }
    }

    private static String reverse(String text) {
        StringBuilder builder = new StringBuilder();
        for(int i = text.length() - 1; i >= 0; i--) builder.append(text.charAt(i));
        return builder.toString();
    }

    private static String shift(String text, int nrRotations) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
            int index = (alphabet.indexOf(text.charAt(i)) + nrRotations) % 28;
            builder.append(alphabet.charAt(index));
        }
        return builder.toString();
    }
}
