package difficulty_1.difficulty_1_3.cryptographersConundrum;

import java.util.Scanner;

public class CryptographersConundrum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(i % 3 == 0) count += str.charAt(i) == 'P' ? 0 : 1;
            if(i % 3 == 1) count += str.charAt(i) == 'E' ? 0 : 1;
            if(i % 3 == 2) count += str.charAt(i) == 'R' ? 0 : 1;
        }

        System.out.println(count);
    }
}
