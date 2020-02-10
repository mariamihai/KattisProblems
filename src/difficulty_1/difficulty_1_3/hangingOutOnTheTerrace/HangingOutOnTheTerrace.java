package difficulty_1.difficulty_1_3.hangingOutOnTheTerrace;

import java.util.Scanner;

public class HangingOutOnTheTerrace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maximumNr = scanner.nextInt();
        int nrEvents = scanner.nextInt();
        scanner.nextLine();

        int countPeople = 0;
        int countDenial = 0;
        for(int i = 0; i <nrEvents; i++) {
            String[] event = scanner.nextLine().split(" ");

            int nrPeople = Integer.parseInt(event[1]);
            if("enter".equals(event[0])) {
                if(countPeople + nrPeople <= maximumNr) {
                    countPeople += nrPeople;
                } else {
                    countDenial++;
                }
            } else { // "exit"
                countPeople -= nrPeople;
            }
        }

        System.out.println(countDenial);
    }
}
