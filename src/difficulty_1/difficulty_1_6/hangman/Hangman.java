package difficulty_1.difficulty_1_6.hangman;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Hangman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String permutation = scanner.nextLine();

        Set<Character> uniqueWordCharacters = word.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());

        int wrongGuesses = 0;
        int permutationIndex = 0;

        while(hasAvailableMove(wrongGuesses, uniqueWordCharacters)) {
            if(!uniqueWordCharacters.remove(getNextCharacter(permutation, permutationIndex))) {
                wrongGuesses++;
            }
            permutationIndex++;
        }

        System.out.println(wrongGuesses < 10 ? "WIN" : "LOSE");

        scanner.close();
    }

    private static boolean hasAvailableMove(int wrongGuesses, Set<Character> uniqueWordCharacters) {
        return wrongGuesses < 10 && !uniqueWordCharacters.isEmpty();
    }

    private static Character getNextCharacter(String permutation, int permutationIndex) {
        return permutation.charAt(permutationIndex);
    }
}
