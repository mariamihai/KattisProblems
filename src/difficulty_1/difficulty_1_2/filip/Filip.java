package difficulty_1.difficulty_1_2.filip;

import java.util.Scanner;

public class Filip {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int last = scanner.nextInt();

        int f = first%10;
        int l = last % 10;
        if(f > l) {
            System.out.print(revert(first));
        } else if(f < l) {
            System.out.print(revert(last));
        } else {
            f = first/10%10;
            l = last/10%10;
            if(f > l) {
                System.out.print(revert(first));
            } else if(f < l) {
                System.out.print(revert(last));
            } else {
                f = first/100;
                l = last/100;
                if(f > l) {
                    System.out.print(revert(first));
                } else {
                    System.out.print(revert(last));
                }
            }
        }
    }

    private static int revert(int number) {
        return (number%10)*100 + (number/10%10)*10 + (number/100);
    }
}
