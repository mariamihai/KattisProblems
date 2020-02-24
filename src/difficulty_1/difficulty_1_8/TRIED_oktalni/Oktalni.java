package difficulty_1.difficulty_1_8.TRIED_oktalni;

import java.util.Scanner;

public class Oktalni {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert the binary number
        int nr = Integer.parseInt(scanner.nextLine(), 2);
        // Convert and output the number in octal
        System.out.println(Integer.toOctalString(nr));
    }
}
