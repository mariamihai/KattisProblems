package difficulty_1.difficulty_1_5.helpaPhDcandidateOut;

import java.util.Scanner;

public class HelpaPhDcandidateOut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < nr; i++) {
            String line = scanner.nextLine();
            if(line.contains("P=NP")) System.out.println("skipped");
            else {
                String[] data = line.split("\\+");
                System.out.println(Integer.parseInt(data[0]) + Integer.parseInt(data[1]));
            }
        }
    }
}
