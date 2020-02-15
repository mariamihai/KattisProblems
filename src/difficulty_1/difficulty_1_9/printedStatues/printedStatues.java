package difficulty_1.difficulty_1_9.printedStatues;

import java.util.Scanner;

public class printedStatues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrOfStatues = scanner.nextInt();

        int nrOfPrinters = 1;
        int nrOfDays = 0;
        int remainingToBePrinted = nrOfStatues;

        while(remainingToBePrinted > 0) {
            // Printers print printers
            if(remainingToBePrinted > nrOfPrinters) {
                nrOfPrinters += nrOfPrinters;
                nrOfDays++;
            } else {
                // Print statues
                remainingToBePrinted -= nrOfPrinters;
                nrOfDays++;
            }
        }

        System.out.println(nrOfDays);

        scanner.close();
    }
}
