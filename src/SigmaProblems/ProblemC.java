package SigmaProblems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 7.5. Dim Sum - TRIED
 */
public class ProblemC {

    // Number of people and maximum of the wanted food numbers
    private Integer N;
    // The association between food and each person - going from 1 to N
    private Map<Integer, List<Integer>> foodWanted;

    // Number of finds for each step - going from 0 to (N - 1)
    private Map<Integer, Integer> valuesOnStep;

    // Saving the combination sum values to be reused
    private static Map<Integer, Long> combinationSumMap;

    // Saving the factorial values to be reused
    private static Map<Integer, Long> factorialMap;


    public static void main (String[] args) {
        ProblemC c = new ProblemC();

        factorialMap = new HashMap<>();
        combinationSumMap = new HashMap<>();

        c.foodWanted = new HashMap<>();
        c.valuesOnStep = new HashMap<>();

        c.readData();

        c.runOrder();
    }

    private void readData() {
        Scanner scanner = new Scanner(System.in);

        // Read number of people / food
        // Parsing the String provided by nextLine() method, instead of using nextInt() and then nextLine() to be able
        // tp go to the next line containing first person's choice of food
        N = Integer.parseInt(scanner.nextLine());

        // Read wanted food by each person
        List<Integer> foodForNumber;

        // i is associated with each person (starting from 1)
        for(int i = 1; i <= N; i++) {
            String line = scanner.nextLine();

            foodForNumber = Arrays.stream(line.split(" "))
                                  .map(Integer::parseInt)
                                  .collect(Collectors.toCollection(ArrayList::new));
            // The first number on the line is the number of elements associated with that person - needs to be removed
            foodForNumber.remove(0);

            if(!foodForNumber.isEmpty()) {
                foodWanted.put(i, foodForNumber);
            }
        }
    }

    private void runOrder() {
        LinkedList<Integer> order = IntStream.rangeClosed(1, N).boxed()
                                             .collect(Collectors.toCollection(LinkedList::new));

        clockwise(order);

        long result = calculateTotalPoints();
        System.out.println(result);
    }

    private long calculateTotalPoints() {
        int numbersFoundOnStep;
        long previousCalculated = 1;
        long result = 0;

        // Clockwise:
        for(int i = 0; i < N; i++) {
            numbersFoundOnStep = valuesOnStep.get(i);
            // Add empty choice for first step
            long numberOfVariationsOnStep = combinationSum(numbersFoundOnStep) + (i == 0 ? 1 : 0);

            if(isEmptyStep(numberOfVariationsOnStep)) continue;

            previousCalculated *= numberOfVariationsOnStep;

            result += i * previousCalculated;
        }


        // CounterClockwise:
        // First step remains the same
        previousCalculated = combinationSum(valuesOnStep.get(0)) + 1;

        // The first and the last step values are the same, the difference is in the order of the intermediary steps.
        // For eg., for N = 5: C0 = CC0; C1 = CC4; C2 = CC3; C3 = CC2; C4 = CC1
        // The first step is the same and was already calculated (and the number of points for the first step is
        // numberOfVariationsOnStep * 0 points). So I don't go through j = 0.
        // The last step is always part of the clockwise last step + intermediary steps and was basically already calculated.
        // I don't calculate j = N - 1
        for(int i = 1, j = (N - 2); j > 0; j--, i++) {
            numbersFoundOnStep = valuesOnStep.get(j);
            long numberOfVariationsOnStep = combinationSum(numbersFoundOnStep);

            if(isEmptyStep(numberOfVariationsOnStep)) continue;

            previousCalculated *= numberOfVariationsOnStep;

            result += i * previousCalculated;
        }

        return result;
    }

    private boolean isEmptyStep(long numberOfValues) {
        return numberOfValues == 0;
    }

    private void clockwise(LinkedList<Integer> order) {
        // Move the round table N times so each person CAN take their wanted food
        for(int i = 1; i <= N; i++) {
            valuesOnStep.put(i - 1, verifyStep(order));

            Integer entry = order.removeFirst();
            order.addLast(entry);
        }
    }

    private int verifyStep(LinkedList<Integer> order) {
        int valuesFoundOnCurrentStep = 0;
        boolean contains;

        for(int j = 1; j <= N; j++) {
            // Check if the j-th person wants food
            if(foodWanted.containsKey(j)) {
                List<Integer> foodForNumber = foodWanted.get(j);

                // Check if the food wanted is in front of the current person
                // the order LinkedList starts from the 0 index
                contains = foodForNumber.contains(order.get(j - 1));

                if(contains) {
                    valuesFoundOnCurrentStep++;
                }
            }
        }

        return valuesFoundOnCurrentStep;
    }

    // Calculate the number of possibilities for the found values on current step.
    // For eg., if 2 values CAN be chosen, then the total number of combinations with these values is the sum of
    // (2 choose 1) + (2 choose 2)
    private long combinationSum (int n) {
        if(isAlreadySavedCombinationSum(n)) {
            return combinationSumMap.get(n);
        }

        long result = 0;

        for(int k = 1; k <= n; k++) {
            result += combination(n, k);
        }

        combinationSumMap.put(n, result);

        return result;
    }

    private boolean isAlreadySavedCombinationSum(int n) {
        return combinationSumMap.containsKey(n);
    }

    // n choose k
    private long combination(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // Return n! from the factorial map or calculates it.
    private long factorial(int n) {
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

    private boolean isAlreadySavedFactorial(int n) {
        return factorialMap.containsKey(n);
    }

    private boolean isZeroOrOne(int n) {
        return n == 0 || n == 1;
    }
}
