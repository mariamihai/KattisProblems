package difficulty_2.difficulty_2_1.bishops;

import java.util.Scanner;

public class Bishops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            int nr = Integer.parseInt(scanner.next());

            int result = nr == 0 ? 0 : (nr == 1 ? 1 : 2 * (nr - 1));
            System.out.println(result);
        }
    }
}
