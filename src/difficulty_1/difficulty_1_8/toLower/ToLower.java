package difficulty_1.difficulty_1_8.toLower;

import java.util.Scanner;

public class ToLower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrProblems = scanner.nextInt();
        int nrTestCases = scanner.nextInt();
        scanner.nextLine();

        int totalCnt = 0;
        for(int i = 0; i < nrProblems; i++) {
            int cnt = 0;

            for(int j = 0; j < nrTestCases; j++) {
                String str = scanner.nextLine();
                if(str.equals(str.toLowerCase()) ||
                   (str.charAt(0) >= 65 && str.charAt(0) <= 90 && str.substring(1).toLowerCase().equals(str.substring(1))))
                    cnt++;
            }

            if(cnt == nrTestCases) totalCnt++;
        }

        System.out.println(totalCnt);
    }
}
