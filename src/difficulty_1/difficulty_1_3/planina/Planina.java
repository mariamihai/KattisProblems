package difficulty_1.difficulty_1_3.planina;

import java.util.Scanner;

public class Planina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrIter = scanner.nextInt();
        int result = (int) Math.pow(Math.pow(2, nrIter) + 1, 2);

        System.out.println(result);
        scanner.close();
    }
}
