package difficulty_2.difficulty_2_0.TRIED_okvir;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Okvir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();

        int u = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.nextLine();

        List<String> text = new LinkedList<>();
        for(int i = 0; i < m; i++) {
            text.add(scanner.nextLine());
        }

        StringBuilder result = new StringBuilder();

        // Upper part
        for(int i = 0; i < u; i++) {
            for(int j = 0; j < l + n + r; j++) {
                result.append(setCharacter(i, j));
            }
            result.append("\n");
        }

        // Left, text and right parts
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < l + m + r; j++) {
                if(j < l) {
                    result.append(setCharacter(i + u, j));
                } else if(j == l) {
                    result.append(text.get(i));
                } else if (j > l && j < l + m) {
                    // redundant - for readability
                    continue;
                } else {
                    result.append(setCharacter(i + u, j));
                }
            }
            result.append("\n");
        }

        // Down part
        for(int i = 0; i < d; i++) {
            for(int j = 0; j < l + n + r; j++) {
                result.append(setCharacter(i + u + m, j));
            }
            result.append("\n");
        }

        System.out.println(result);

        scanner.close();
    }

    private static String setCharacter(int row, int column) {
        return (row % 2) == (column % 2) ? "#" : ".";
    }
}
