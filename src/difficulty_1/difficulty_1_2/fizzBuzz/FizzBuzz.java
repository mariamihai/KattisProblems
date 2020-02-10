package difficulty_1.difficulty_1_2.fizzBuzz;

import java.util.Scanner;

public class FizzBuzz {


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fizz = scanner.nextInt();
        int buzz = scanner.nextInt();

        int n = scanner.nextInt();

        int prod;
        if (buzz % fizz == 0) {
            prod = buzz;
        } else {
            prod = fizz * buzz;
        }

        for(int i = 1; i <= n; i++) {
            if(i % prod == 0 ) {
                System.out.println("FizzBuzz");
            } else if(i % fizz == 0) {
                System.out.println("Fizz");
            } else if(i % buzz == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
