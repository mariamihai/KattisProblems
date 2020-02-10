package difficulty_1.difficulty_1_3.provincesAndGold;

import java.util.Scanner;
public class ProvincesandGold {

    private static final int VICTORY_CARD_PROVINCE = 8;
    private static final int VICTORY_CARD_DUCHY = 5;
    private static final int VICTORY_CARD_ESTATE = 2;

    private static final int TREASURE_CARD_GOLD = 6;
    private static final int TREASURE_CARD_SILVER = 3;
    private static final int TREASURE_CARD_COPPER = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gold = scanner.nextInt();
        int silver = scanner.nextInt();
        int copper = scanner.nextInt();

        int sum = gold * 3 +
                silver * 2 +
                copper * 1;

        search(sum);

        scanner.close();
    }

    private static void search(int sum) {
        if(VICTORY_CARD_PROVINCE <= sum) {
            System.out.print("Province or ");
        } else if(VICTORY_CARD_DUCHY <= sum) {
            System.out.print("Duchy or ");
        } else if(VICTORY_CARD_ESTATE <= sum){
            System.out.print("Estate or ");
        }

        if(TREASURE_CARD_GOLD <= sum) {
            System.out.println("Gold");
        } else if(TREASURE_CARD_SILVER <= sum) {
            System.out.println("Silver");
        } else if(TREASURE_CARD_COPPER <= sum) {
            System.out.println("Copper");
        }
    }
}
