package difficulty_2.difficulty_2_0.warehouse;

import java.util.*;
import java.util.stream.Collectors;

public class Warehouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrOfTestCases = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < nrOfTestCases; i++) {
            Map<String, Integer> toys = new HashMap<>();

            int nrOfShipments = scanner.nextInt();
            scanner.nextLine();

            for(int j = 0; j < nrOfShipments; j++) {
                String[] line = scanner.nextLine().split(" ");
                int value = Integer.valueOf(line[1]);

                toys.compute(line[0], (key, oldVal) -> (oldVal == null) ? value : oldVal + value);
            }

            LinkedHashMap<String, Integer> sortedToys = toys.entrySet().stream()
                    // only the reverse order of the values
//                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    // reverse order of values and then keys
                    .sorted((entry1, entry2) -> {
                        // entry2 compared to entry 1 (for reversed order)
                        int compared = entry2.getValue().compareTo(entry1.getValue());
                        if(compared != 0) {
                            return compared;
                        } else {
                            // entry1 compared to entry2 for alphabetical order
                            return entry1.getKey().compareTo(entry2.getKey());
                        }
                    })
                    .collect(Collectors.toMap(Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e2,
                            LinkedHashMap::new));

            System.out.println(sortedToys.size());
            sortedToys.forEach((key, value) -> System.out.println(key + " " + value));
        }
    }
}
