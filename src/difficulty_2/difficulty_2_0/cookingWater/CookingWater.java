package difficulty_2.difficulty_2_0.cookingWater;

import java.util.Scanner;

public class CookingWater {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrOfTestCases = scanner.nextInt();
        scanner.nextLine();

        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;

        for(int i = 0; i < nrOfTestCases; i++) {
            String[] line = scanner.nextLine().split(" ");

            int currentX = Integer.parseInt(line[0]);
            int currentY = Integer.parseInt(line[1]);

            maxX = Math.max(currentX, maxX);
            minY = Math.min(currentY, minY);
        }

        System.out.println(maxX > minY ? "edward is right" : "gunilla has a point");
    }
}
