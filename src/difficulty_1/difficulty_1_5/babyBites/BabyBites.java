package difficulty_1.difficulty_1_5.babyBites;

import java.util.Scanner;

public class BabyBites {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for(int i = 1; i <= count; i++) {
            String str = scanner.next();
            if(!"mumble".equals(str) && !(i + "").equals(str)) {
                System.out.println("something is fishy");
                System.exit(0);
            }
        }

        System.out.println("makes sense");
        System.exit(0);
    }
}
