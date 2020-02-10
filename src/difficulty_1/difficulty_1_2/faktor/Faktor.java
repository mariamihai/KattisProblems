package difficulty_1.difficulty_1_2.faktor;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nrOfArticles = scanner.nextInt();
        double impactFactor = scanner.nextInt();

        double minImpactFactor = impactFactor - 0.99;
        System.out.println((int) Math.ceil(nrOfArticles * minImpactFactor));
    }
}
