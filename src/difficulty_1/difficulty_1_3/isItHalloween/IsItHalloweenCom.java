package difficulty_1.difficulty_1_3.isItHalloween;

import java.util.Scanner;

public class IsItHalloweenCom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();

        if("OCT 31".equals(date) || "DEC 25".equals(date)) System.out.println("yup");
        else System.out.println("nope");
    }
}
