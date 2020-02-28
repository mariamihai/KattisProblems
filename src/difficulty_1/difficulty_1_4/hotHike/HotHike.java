package difficulty_1.difficulty_1_4.hotHike;

import java.util.Arrays;
import java.util.Scanner;

public class HotHike {

    public static void main(String[] args) {
        int[] temp = getVacationData();

        int recordedTemp = Integer.MAX_VALUE;
        int firstDay = -1;

        for(int i = 0; i < temp.length - 2; i++) {
            int maxTempForSelection = Math.max(temp[i], temp[i + 2]);

            if(maxTempForSelection < recordedTemp) {
                recordedTemp = maxTempForSelection;
                firstDay = i;
            }
        }

        printResult(firstDay, recordedTemp);
    }

    private static int[] getVacationData() {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

        int[] temp = Arrays.stream(scanner.nextLine().split(" "))
                           .mapToInt(Integer::valueOf)
                           .toArray();

        scanner.close();

        return temp;
    }

    private static void printResult(int firstDay, int maxTemperature) {
        System.out.println((firstDay + 1) + " " + maxTemperature);
    }
}
