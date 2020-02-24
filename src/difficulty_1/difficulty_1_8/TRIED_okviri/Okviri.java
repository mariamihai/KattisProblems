package difficulty_1.difficulty_1_8.TRIED_okviri;

import java.util.Scanner;

public class Okviri {

    private static String peterPanFrame1 = "..#..";
    private static String peterPanFrame2 = ".#.#.";
    private static String peterPanFrame3Left = "#.";
    private static String peterPanFrame3Right = ".#";

    private static String wendyFrame1 = "..*..";
    private static String wendyFrame2 = ".*.*.";
    private static String wendyFrame3Left = "*.";
    private static String wendyFrame3Right = ".*";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("");

        StringBuilder[] builders = new StringBuilder[3];
        builders[0] = new StringBuilder();
        builders[1] = new StringBuilder();
        builders[2] = new StringBuilder();

        for(int i = 0; i < text.length; i++) {
            if(i % 3 == 0) {
                if(i == 0) {
                    appendToBuilders(builders, peterPanFrame1, peterPanFrame2, peterPanFrame3Left, text[i], peterPanFrame3Right);
                } else {
                    appendToBuilders(builders,
                                     peterPanFrame1.substring(1, 5),
                                     peterPanFrame2.substring(1, 5),
                                     peterPanFrame3Left.substring(1, 2),
                                     text[i],
                                     peterPanFrame3Right);
                }
            } else if(i % 3 == 1) {
                appendToBuilders(builders,
                                 peterPanFrame1.substring(1, 4),
                                 peterPanFrame2.substring(1, 4),
                                 peterPanFrame3Left.substring(1, 2),
                                 text[i],
                                 peterPanFrame3Right.substring(0, 1));
            } else {
                appendToBuilders(builders, wendyFrame1, wendyFrame2, wendyFrame3Left, text[i], wendyFrame3Right);
            }
        }

        System.out.println(builders[0] + "\n" +
                           builders[1] + "\n" +
                           builders[2] + "\n" +
                           builders[1] + "\n" +
                           builders[0]);
    }

    private static void appendToBuilders (StringBuilder[] builders, String line1, String line2, String line3Left, String text, String line3Right) {
        builders[0].append(line1);
        builders[1].append(line2);
        builders[2].append(line3Left).append(text).append(line3Right);
    }
}
