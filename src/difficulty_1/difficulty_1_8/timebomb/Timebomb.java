package difficulty_1.difficulty_1_8.timebomb;

import java.util.Scanner;

public class Timebomb {

    // Concatenating the 5 lines that display one digit
    private static final String display0 = "**** ** ** ****";
    private static final String display1 = "  *  *  *  *  *";
    private static final String display2 = "***  *****  ***";
    private static final String display3 = "***  ****  ****";
    private static final String display4 = "* ** ****  *  *";
    private static final String display5 = "****  ***  ****";
    private static final String display6 = "****  **** ****";
    private static final String display7 = "***  *  *  *  *";
    private static final String display8 = "**** ***** ****";
    private static final String display9 = "**** ****  ****";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lines = new String[5];
        for(int i = 0; i < 5; i++) {
            lines[i] = scanner.nextLine();
        }

        int sum = 0;
        int nrOfDigits = lines[0].length() / 4 + 1;

        for(int i = 0; i < nrOfDigits; i++) {
            StringBuilder builder = new StringBuilder();

            for(int j = 0; j < 5; j++) {
                builder.append(lines[j], 4 * i, 4 * i + 3);
            }

            int addZeros = (int) Math.pow(10, nrOfDigits - i - 1);

            switch (builder.toString()) {
                case display0: break;
                case display1: sum += 1 * addZeros; break;
                case display2: sum += 2 * addZeros; break;
                case display3: sum += 3 * addZeros; break;
                case display4: sum += 4 * addZeros; break;
                case display5: sum += 5 * addZeros; break;
                case display6: sum += 6 * addZeros; break;
                case display7: sum += 7 * addZeros; break;
                case display8: sum += 8 * addZeros; break;
                case display9: sum += 9 * addZeros; break;
            }
        }

        System.out.println(sum % 6 == 0 ? "BEER!!" : "BOOM!!");
    }
}
