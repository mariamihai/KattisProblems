package difficulty_1.difficulty_1_7.TRIED_savingForRetirement;

import java.util.Scanner;

public class SavingForRetirement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bobStart = scanner.nextInt();
        int bobEnd = scanner.nextInt();
        int bobSaving = scanner.nextInt();

        int aliceStart = scanner.nextInt();
        int aliceSaving = scanner.nextInt();

        int bobSaved = (bobEnd - bobStart) * bobSaving;

        int aliceYears = bobSaved / aliceSaving + (bobSaved % aliceSaving > 0 ? 1 : 0);
        System.out.println(aliceStart + aliceYears);
    }
}
