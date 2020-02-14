package difficulty_2.difficulty_2_0.sort;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.nextLine();

        Map<Integer, Integer> encounteredOrder = new LinkedHashMap<>();
        String line = scanner.nextLine();

        Arrays.asList(line.split(" ")).stream()
                .map(x -> Integer.valueOf(x))
                .forEach(x -> encounteredOrder.compute(x, (key, oldVal) -> (oldVal == null) ? 1 : oldVal + 1));

        encounteredOrder.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .forEach(entry -> {
                String s = new String(new char[entry.getValue()]).replace("\0", entry.getKey().toString() + " ");
                System.out.print(s);
            });
    }
}
