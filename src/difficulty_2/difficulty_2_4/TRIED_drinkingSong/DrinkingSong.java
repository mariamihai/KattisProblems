package difficulty_2.difficulty_2_4.TRIED_drinkingSong;

import java.util.Scanner;

public class DrinkingSong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr = scanner.nextInt();
        scanner.nextLine();

        String beverage = scanner.nextLine();

        for(int i = nr; i > 2; i--) {
            System.out.println(nr + " bottles of " + beverage + " on the wall, " + nr + " bottles of " + beverage + ".");
            System.out.println("Take one down, pass it around, " + (nr - 1) + " bottles of " + beverage + " on the wall.");
            System.out.println();
        }
        if(nr > 1) {
            System.out.println("2 bottles of " + beverage + " on the wall, 2 bottles of " + beverage + ".");
            System.out.println("Take one down, pass it around, 1 bottle of " + beverage + " on the wall.");
            System.out.println();
        }

        System.out.println("1 bottle of " + beverage + " on the wall, 1 bottle of " + beverage + ".");
        System.out.println("Take it down, pass it around, no more bottles of " + beverage + ".");

        scanner.close();
    }
}
