package difficulty_1.difficulty_1_4.pokerHand;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokerHand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Long> frequencyCards = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.groupingBy(card -> card.split("")[0], Collectors.counting()));

        System.out.println(frequencyCards.values().stream().max((nr1, nr2) -> nr1 > nr2 ? 1 : -1).get());

    }
}
