package difficulty_1.difficulty_1_6.oneChickenPerPerson;

import java.util.Scanner;

public class OneChickenPerPerson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrPeople = scanner.nextInt();
        int nrChicken = scanner.nextInt();

        int more = Math.abs(nrPeople - nrChicken);
        if (nrPeople > nrChicken) {
            System.out.println("Dr. Chaz needs " + more + " more piece" + (more == 1 ? "" : "s") + " of chicken!");
        } else {
            System.out.println("Dr. Chaz will have " + more + " piece" + (more == 1 ? "" : "s") + " of chicken left over!");
        }
    }
}
