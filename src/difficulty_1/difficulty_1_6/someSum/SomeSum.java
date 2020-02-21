package difficulty_1.difficulty_1_6.someSum;

import java.util.Scanner;

public class SomeSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr = scanner.nextInt();

        switch(nr % 4) {
            case 0:
                System.out.println("Even");
                break;
            case 2:
                System.out.println("Odd");
                break;
            default:
                System.out.println("Either");
        }

        scanner.close();
    }
}
