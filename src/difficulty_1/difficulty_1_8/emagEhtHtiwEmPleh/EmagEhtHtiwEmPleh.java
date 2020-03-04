package difficulty_1.difficulty_1_8.emagEhtHtiwEmPleh;

import java.util.Scanner;

public class EmagEhtHtiwEmPleh {

    private static final String WHITE_CONTOUR = ".";
    private static final String BLACK_CONTOUR = ":";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String whiteLine = scanner.nextLine().replace("White: ", "");
        String blackLine = scanner.nextLine().replace("Black: ", "");

        String[][] table = new String[8][8];

        if(!"".equals(whiteLine)) {
            String[] whiteEntries = whiteLine.split(",");
            for(String entry : whiteEntries) {
                table[getRowNumber(entry)][getColumnNumber(entry)] = getWhitePieceType(entry);
            }
        }
        if(!"".equals(blackLine)) {
            String[] blackEntries = blackLine.split(",");
            for (String entry : blackEntries) {
                table[getRowNumber(entry)][getColumnNumber(entry)] = getBlackPieceType(entry);
            }
        }

        printResult(table);

        scanner.close();
    }

    private static String getBlackPieceType(String piece) {
        return getType(piece).toLowerCase();
    }

    private static String getWhitePieceType(String piece) {
        return getType(piece);
    }

    private static String getType(String piece) {
        if(isPawn(piece)) return "P";
        return piece.substring(0, 1);
    }

    private static int getRowNumber(String piece) {
        if(isPawn(piece)) return 8 - Integer.parseInt(piece.substring(1, 2));
        return 8 - Integer.parseInt(piece.substring(2, 3));
    }

    private static int getColumnNumber(String piece) {
        if(isPawn(piece)) return translateColumnToNumber(piece.substring(0, 1));
        return translateColumnToNumber(piece.substring(1, 2));
    }

    private static int translateColumnToNumber(String columnLetter) {
        switch (columnLetter) {
            case "a": return 0;
            case "b": return 1;
            case "c": return 2;
            case "d": return 3;
            case "e": return 4;
            case "f": return 5;
            case "g": return 6;
            default : return 7;
        }
    }

    private static boolean isPawn(String piece) {
        return piece.length() == 2;
    }

    private static void printResult(String[][] table) {
        System.out.println("+---+---+---+---+---+---+---+---+");

        for(int i = 0; i < 8; i++) {
            System.out.print("|");

            for(int j = 0; j < 8; j++) {
                System.out.print(setColorToField(table[i][j], i, j) + "|");
            }

            System.out.println();
            System.out.println("+---+---+---+---+---+---+---+---+");
        }
    }

    private static String setColorToField(String type, int row, int column) {
        if(isWhiteField(row, column)) return constructField(type, WHITE_CONTOUR);
        return constructField(type, BLACK_CONTOUR);
    }

    private static String constructField(String type, String contour) {
        if(isEmptyField(type)) return new String(new char[3]).replace("\0", contour);
        return contour + type + contour;
    }

    private static boolean isWhiteField(int row, int column) {
        return (row % 2 == 0 && column % 2 == 0) ||
                (row % 2 == 1 && column % 2 == 1);
    }

    private static boolean isEmptyField(String type) {
        return type == null;
    }
}
