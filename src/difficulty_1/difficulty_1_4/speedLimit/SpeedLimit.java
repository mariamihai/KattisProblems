package difficulty_1.difficulty_1_4.speedLimit;

import java.util.Scanner;

public class SpeedLimit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        while(count != -1) {
            int sum = 0;
            int prev = 0;

            for(int i = 0; i < count; i++) {
                int speed = scanner.nextInt();
                int totalHours = scanner.nextInt();

                sum += speed * (totalHours - prev);

                prev = totalHours;
            }

            System.out.println(sum + " miles");

            count = scanner.nextInt();
        }
    }
}
