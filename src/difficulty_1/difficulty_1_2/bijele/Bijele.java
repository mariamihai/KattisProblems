package difficulty_1.difficulty_1_2.bijele;

import java.util.Scanner;

public class Bijele {
    /**
     * One king
     * One queen
     * Two rooks
     * Two bishops
     * Two knights
     * Eight pawns
     */
    private static int[] correctValues = {1, 1, 2, 2, 2, 8};

    public static void main(String[] args) {
        StringBuilder result  = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] values = line.split(" ");
        for(int i = 0; i < values.length; i++) {
            int value = Integer.parseInt(values[i]);
            result.append(correctValues[i] - value).append(" ");
        }

        System.out.println(result);
    }
}
