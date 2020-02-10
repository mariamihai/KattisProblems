package difficulty_1.difficulty_1_4.licenseToLaunch;

import java.util.Scanner;

public class LicenseToLaunch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int min = scanner.nextInt();
        int position = 0;
        for(int i = 1; i < n; i++) {
            int current = scanner.nextInt();

            if(current < min) {
                min = current;
                position = i;
            }
        }

        System.out.println(position);
    }
}
