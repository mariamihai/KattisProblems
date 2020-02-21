package difficulty_2.difficulty_2_0.TRIED_recount;

import java.util.*;

public class Recount {
    private static String endProblemLine = "***";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> candidates = new HashMap<>();

        String line = scanner.nextLine();
        while(!endProblemLine.equals(line)) {
            candidates.compute(line, (key, value) -> value == null ? 1 : value + 1);
            line = scanner.nextLine();
        }

        int maxNrOfVotes = candidates.values().stream().max(Integer::compareTo).get();

        long numberOfDuplicates = candidates.entrySet().stream()
                .filter(entry -> maxNrOfVotes == entry.getValue()).count();

        if (numberOfDuplicates > 1) {
            System.out.println("Runoff!");
        } else {
            candidates.entrySet().stream()
                    .filter(entry -> maxNrOfVotes == entry.getValue())
                    .forEach(entry -> System.out.println(entry.getKey()));
        }

        scanner.close();
    }
}
