package difficulty_1.difficulty_1_3.hissingMicrophone;

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if(string.contains("ss")) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
