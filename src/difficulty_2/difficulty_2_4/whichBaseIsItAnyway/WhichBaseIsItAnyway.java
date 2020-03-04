package difficulty_2.difficulty_2_4.whichBaseIsItAnyway;

import java.util.Scanner;

public class WhichBaseIsItAnyway {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrTestCases = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= nrTestCases; i++) {
            String stringNumber = scanner.nextLine().split(" ")[1];
            System.out.println(i + " " + getOctal(stringNumber) + " " + getDec(stringNumber) + " " + getHexa(stringNumber));
        }

        scanner.close();
    }

    private static int getOctal(String number) {
        if(number.contains("8") || number.contains("9")) return 0;

        return Integer.parseInt(number, 8);
    }

    private static int getDec(String number) {
        return Integer.parseInt(number);
    }

    private static int getHexa(String number) {
        return Integer.parseInt(number, 16);
    }
}
