package difficulty_1.difficulty_1_5.deathKnightHero;

import java.util.Scanner;

public class DeathKnightHero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < nr; i++) {
            String str = scanner.next();
            if(!str.contains("CD")) count++;
        }

        System.out.println(count);
    }
}
