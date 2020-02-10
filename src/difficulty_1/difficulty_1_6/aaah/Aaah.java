package difficulty_1.difficulty_1_6.aaah;

import java.util.Scanner;

public class Aaah {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String doctorsAh = scanner.nextLine().replace("h", "");
        String jonsAh = scanner.nextLine().replace("h", "");

        if (doctorsAh.length() < jonsAh.length()) System.out.println("no");
        else System.out.println("go");
    }
}
