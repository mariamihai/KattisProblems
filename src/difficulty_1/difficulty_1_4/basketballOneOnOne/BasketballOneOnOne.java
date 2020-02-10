package difficulty_1.difficulty_1_4.basketballOneOnOne;

import java.util.Scanner;

public class BasketballOneOnOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int pointsForA = 0;
        int pointsForB = 0;

        for(int i = 0; i < line.length(); i += 2) {
            int number = Integer.valueOf(String.valueOf(line.charAt(i + 1)));

            if('A' == line.charAt(i)) pointsForA += number;
            else pointsForB += number;
        }

        if(pointsForA > pointsForB) System.out.println("A");
        else System.out.println("B");
    }
}
