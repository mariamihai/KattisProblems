package difficulty_1.difficulty_1_3.sibice;

import java.util.Scanner;

public class Sibice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int pitagora = (int) Math.sqrt(w*w + h*h);
        for (int i = 0; i < count; i++) {
            if(scanner.nextInt() <= pitagora) System.out.println("DA");
            else System.out.println("NE");
        }

        scanner.close();
    }

}
