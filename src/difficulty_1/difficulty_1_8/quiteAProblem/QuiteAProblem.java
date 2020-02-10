package difficulty_1.difficulty_1_8.quiteAProblem;

import java.util.Scanner;

public class QuiteAProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            if(str.toLowerCase().contains("problem")) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
