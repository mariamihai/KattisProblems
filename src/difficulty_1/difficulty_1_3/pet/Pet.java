package difficulty_1.difficulty_1_3.pet;

import java.util.Scanner;

public class Pet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sum = new int[5];
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                sum[i] += scanner.nextInt();
            }
        }

        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++) {
            if(max < sum[i]) {
                maxIndex = i;
                max = sum[i];
            }
        }

        System.out.println((maxIndex + 1) + " " + max);
    }
}
