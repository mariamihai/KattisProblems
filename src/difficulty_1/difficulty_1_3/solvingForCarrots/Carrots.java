package difficulty_1.difficulty_1_3.solvingForCarrots;

import java.util.Scanner;

public class Carrots{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.println(Integer.parseInt(line.split(" ")[1]));
    }
}