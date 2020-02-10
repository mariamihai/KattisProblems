package difficulty_1.difficulty_1_3.stuckInATimeLoop;

import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nrOfInvocations = scanner.nextInt();

        for (int i = 1; i <= nrOfInvocations; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
