package difficulty_1.difficulty_1_7.TODO_vauvau;

import java.util.Scanner;

public class Vauvau {

    private static int aTime1, aTime2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        aTime1 = scanner.nextInt();
        // cTime1
        scanner.nextInt();
        aTime2 = scanner.nextInt();
        // cTime2
        scanner.nextInt();

        int postmanTime = scanner.nextInt();
        int milkmanTime = scanner.nextInt();
        int garbagemanTime = scanner.nextInt();

        count(postmanTime);
        count(milkmanTime);
        count(garbagemanTime);
    }

    private static void count(int time) {
        int cnt = 0;
        int prediction1 = time % aTime1;
        int prediction2 = time % aTime2;

        if(1 <= prediction1 && prediction1 <= aTime1) cnt++;
        if(1 <= prediction2 && prediction2 <= aTime2) cnt++;

        System.out.println(cnt == 0 ? "none" : (cnt == 1 ? "one" : "both"));
    }
}
