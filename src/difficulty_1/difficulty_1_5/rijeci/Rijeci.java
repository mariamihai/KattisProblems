package difficulty_1.difficulty_1_5.rijeci;

import java.util.Scanner;

public class Rijeci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int As = 1, Bs = 0;

        int count = scanner.nextInt();
        for(int i = 0; i < count; i++) {
            int tempAs = Bs;
            int tempBs = As + Bs;

            As = tempAs;
            Bs = tempBs;
        }

        System.out.println(As + " " + Bs);
    }
}
