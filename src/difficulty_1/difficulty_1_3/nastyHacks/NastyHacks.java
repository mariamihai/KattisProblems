package difficulty_1.difficulty_1_3.nastyHacks;

import java.util.Scanner;

public class NastyHacks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCases = scanner.nextInt();

        for(int i = 0; i < numberOfCases; i++) {
            // the expected revenue if you do not advertise
            long noAdvertise = scanner.nextLong();
            // the expected revenue if you do advertise
            long withAdvertise = scanner.nextLong();
            // the cost of advertising
            long costOfAdvertise = scanner.nextLong();

            long cost = withAdvertise - costOfAdvertise;
            if(noAdvertise < cost) {
                System.out.println("advertise");
            } else if(noAdvertise > cost){
                System.out.println("do not advertise");
            } else {
                System.out.println("does not matter");
            }
        }
    }
}
