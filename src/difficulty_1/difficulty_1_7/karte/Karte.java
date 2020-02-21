package difficulty_1.difficulty_1_7.karte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Karte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cards = scanner.nextLine();
        int cntP = 0, cntK = 0, cntH = 0, cntT = 0;

        List<String> processedCards = new ArrayList<>();
        boolean validDeck = true;
        for(int i = 0; i < cards.length() / 3; i++) {
            String card = getNextCard(cards, i);

            if(isDuplicateCard(processedCards, card)) {
                validDeck = false;
                break;
            } else {
                processedCards.add(card);
                switch(card.charAt(0)) {
                    case 'P':
                        cntP++;
                        break;
                    case 'K':
                        cntK++;
                        break;
                    case 'H':
                        cntH++;
                        break;
                    case 'T':
                        cntT++;
                        break;
                }
            }
        }

        if(validDeck) {
            System.out.println((13 - cntP) + " " + (13 - cntK) + " " + (13 - cntH) + " " + (13 - cntT));
        } else {
            System.out.println("GRESKA");
        }

        scanner.close();
    }

    private static String getNextCard(String cards, int i) {
        int index = i * 3;

        return cards.substring(index, index + 3);
    }

    private static boolean isDuplicateCard(List<String> processedCards, String card) {
        return processedCards.contains(card);
    }
}
