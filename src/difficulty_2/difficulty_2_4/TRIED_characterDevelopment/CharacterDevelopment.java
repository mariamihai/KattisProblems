package difficulty_2.difficulty_2_4.TRIED_characterDevelopment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterDevelopment {

    // Saving the factorial values to be reused
    private static Map<Integer, Long> factorialMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrCharacters = scanner.nextInt();
        int sum = 0;
        for(int i = 2; i <= nrCharacters; i++) {
            sum += combination(nrCharacters, i);
        }
        System.out.println(sum);

        scanner.close();
    }

    // n choose k
    private static long combination(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // Return n! from the factorial map or calculates it.
    private static long factorial(int n) {
        if(isAlreadySavedFactorial(n)) {
            return factorialMap.get(n);
        }

        if(isZeroOrOne(n)) {
            factorialMap.put(n, 1L);
            return 1;
        }

        long result = 1;

        for(int i = 2; i <= n; i++) {
            result *= i;
        }

        factorialMap.put(n, result);

        return result;
    }

    private static boolean isAlreadySavedFactorial(int n) {
        return factorialMap.containsKey(n);
    }

    private static boolean isZeroOrOne(int n) {
        return n == 0 || n == 1;
    }
}
