package difficulty_2.difficulty_2_1.mia;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Mia {

    private static String endLine = "0 0 0 0";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        while(!endLine.equals(line)) {
            List<Integer> dices = Arrays.stream(line.split(" ")).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());

            // Check Mia for both
            if(!validMia(dices)) {
                if(!validDouble(dices)) {
                    validateBiggerDices(dices);
                }
            }

            line = scanner.nextLine();
        }
    }

    private static boolean isMia(Integer dice1, Integer dice2) {
        return (dice1 == 1 && dice2 == 2) ||
                (dice1 == 2 && dice2 == 1);
    }

    private static boolean isDouble(Integer dice1, Integer dice2) {
        return dice1.equals(dice2);
    }

    private static Integer getBiggerDice(Integer dice1, Integer dice2) {
        return dice1 > dice2 ? dice1 : dice2;
    }

    private static Integer getSmallerDice(Integer dice1, Integer dice2) {
        return dice1 < dice2 ? dice1 : dice2;
    }

    private static boolean validMia(List<Integer> dices) {
        boolean firstMia = isMia(dices.get(0), dices.get(1));
        boolean secondMia = isMia(dices.get(2), dices.get(3));

        if(firstMia && secondMia){
            System.out.println("Tie.");
        } else if(firstMia) {
            System.out.println("Player 1 wins.");
        } else if(secondMia) {
            System.out.println("Player 2 wins.");
        } else {
            return false;
        }

        return true;
    }

    private static boolean validDouble(List<Integer> dices) {
        boolean firstDouble = isDouble(dices.get(0), dices.get(1));
        boolean secondDouble = isDouble(dices.get(2), dices.get(3));

        if(firstDouble && secondDouble) {
            if(dices.get(0).equals(dices.get(2))) {
                System.out.println("Tie.");
            } else if(dices.get(0) > dices.get(2)) {
                System.out.println("Player 1 wins.");
            } else if(dices.get(0) < dices.get(2)) {
                System.out.println("Player 2 wins.");
            }
        } else if(firstDouble) {
            System.out.println("Player 1 wins.");
        } else if(secondDouble) {
            System.out.println("Player 2 wins.");
        } else {
            return false;
        }

        return true;
    }

    private static void validateBiggerDices(List<Integer> dices) {
        Integer biggerDice1 = getBiggerDice(dices.get(0), dices.get(1));
        Integer smallerDice1 = getSmallerDice(dices.get(0), dices.get(1));
        Integer biggerDice2 = getBiggerDice(dices.get(2), dices.get(3));
        Integer smallerDice2 = getSmallerDice(dices.get(2), dices.get(3));

        if(biggerDice1.equals(biggerDice2)) {
            if(smallerDice1.equals(smallerDice2)) {
                System.out.println("Tie.");
            } else if(smallerDice1 > smallerDice2) {
                System.out.println("Player 1 wins.");
            } else {
                System.out.println("Player 2 wins.");
            }
        } else if (biggerDice1 > biggerDice2) {
            System.out.println("Player 1 wins.");
        } else {
            System.out.println("Player 2 wins.");
        }
    }
}
