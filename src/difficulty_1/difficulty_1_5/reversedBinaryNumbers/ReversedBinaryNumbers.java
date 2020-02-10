package difficulty_1.difficulty_1_5.reversedBinaryNumbers;

import java.util.Scanner;

public class ReversedBinaryNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr = scanner.nextInt();
        String binary = Integer.toBinaryString(nr);

        StringBuilder builder = new StringBuilder();
        for(int i = binary.length() - 1; i >= 0 ; i--) {
            builder.append(binary.charAt(i));
        }

        System.out.println(Integer.parseInt(builder.toString(), 2));
    }
}
