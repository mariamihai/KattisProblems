package difficulty_1.difficulty_1_4.sevenWonders;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SevenWonders {

    private static String TABLET = "T";
    private static String COMPASS = "C";
    private static String GEAR = "G";

    public static void main(String[] args) {
        int sum = 0;
        int numberOfPairs = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        Map<String, Long> frequenties = Arrays.stream(scanner.nextLine().split(""))
                                    .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        for(Map.Entry<String, Long> entry : frequenties.entrySet()) {
            sum += Math.pow(entry.getValue(), 2);
            numberOfPairs = (int) Math.min(numberOfPairs, entry.getValue());
        }
        sum += frequenties.size() == 3 ? (7 * numberOfPairs) : 0;

        System.out.println(sum);
    }
}
