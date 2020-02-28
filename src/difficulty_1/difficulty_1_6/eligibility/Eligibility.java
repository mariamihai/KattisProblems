package difficulty_1.difficulty_1_6.eligibility;

import java.util.Scanner;

public class Eligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrOfTestCases = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < nrOfTestCases; i++) {
            String line = scanner.nextLine();
            String[] splitted = line.split(" ");

            int yearForStudies = Integer.parseInt(splitted[1].substring(0, 4));
            int yearOfBirth = Integer.parseInt(splitted[2].substring(0, 4));
            int nrOfCourses = Integer.parseInt(splitted[3]);

            if(isEligible(yearForStudies, yearOfBirth)) {
                print(splitted[0], "eligible");
                continue;
            }
            if (isIneligible(nrOfCourses)) {
                print(splitted[0], "ineligible");
                continue;
            }

            print(splitted[0], "coach petitions");
        }

        scanner.close();
    }

    private static boolean isEligible(int yearForStudies, int yearOfBirth) {
        return yearForStudies >= 2010 || yearOfBirth >= 1991;
    }

    private static boolean isIneligible(int nrOfCourses) {
        return nrOfCourses >= 41;
    }

    private static void print(String name, String status) {
        System.out.println(name + " " + status);
    }
}
