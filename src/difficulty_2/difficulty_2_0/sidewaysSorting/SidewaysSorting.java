package difficulty_2.difficulty_2_0.sidewaysSorting;

import java.util.*;

public class SidewaysSorting {

    private static String endProblemLine = "0 0";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        while(isNotEndingLing(line)) {
            String[] splittedLine = line.split(" ");

            int row = Integer.valueOf(splittedLine[0]);
            int column = Integer.valueOf(splittedLine[1]);

            String[] textToSort = readTextLine(scanner, row, column);

            String[] transformedText = Arrays.stream(textToSort)
                    .sorted(Comparator.comparing(String::toLowerCase)).toArray(String[]:: new);

            printText(row, column, transformedText);

            line = scanner.nextLine();
        }

        scanner.close();
    }

    private static boolean isNotEndingLing(String line) {
        return !endProblemLine.equals(line);
    }

    private static String[] readTextLine(Scanner scanner, int row, int column) {
        String[] textToSort = Arrays.stream(new String[column]).map(s -> "").toArray(String[]::new);

        for(int i = 0; i < row; i++) {
            String textLine = scanner.nextLine();

            for(int j = 0; j < column; j++) {
                textToSort[j] += textLine.charAt(j);
            }
        }

        return textToSort;
    }

    private static void printText(int row, int column, String[] transformedText) {
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(transformedText[j].charAt(i));
            }
            System.out.println();
        }

        System.out.println();
    }
}
