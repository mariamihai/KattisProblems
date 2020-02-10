package difficulty_1.difficulty_1_6.sodaSurpler;

import java.util.Scanner;

public class SodaSurpler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startOfTheDayEmpty = scanner.nextInt();
        int foundDuringTheDayEmpty = scanner.nextInt();
        int emptyNeeded = scanner.nextInt();

        int count = 0;

        int drunk = startOfTheDayEmpty / emptyNeeded;
        count += drunk;

        foundDuringTheDayEmpty += drunk;
        foundDuringTheDayEmpty += startOfTheDayEmpty % emptyNeeded;

        while(foundDuringTheDayEmpty > 0 && foundDuringTheDayEmpty >= emptyNeeded) {
            drunk = foundDuringTheDayEmpty / emptyNeeded;
            count += drunk;
            foundDuringTheDayEmpty = drunk + foundDuringTheDayEmpty % emptyNeeded;
        }

        System.out.println(count);
    }
}
