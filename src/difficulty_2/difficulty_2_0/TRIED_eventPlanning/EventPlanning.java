package difficulty_2.difficulty_2_0.TRIED_eventPlanning;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EventPlanning {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrParticipants = scanner.nextInt();
        int budget = scanner.nextInt();
        int nrHotels = scanner.nextInt();
        int nrWeeks = scanner.nextInt();
        scanner.nextLine();

        boolean foundHotel = false;

        for(int i = 0; i < nrHotels; i++) {
            int priceForOnePerson = Integer.parseInt(scanner.nextLine());

            List<String> availableRoomsAsStrings = Arrays.asList(scanner.nextLine().split(" "));
            int priceForAllParticipants = priceForOnePerson * nrParticipants;

            if(isPriceUnderBudget(priceForAllParticipants, budget) &&
                    areAvailableRoomsForAllWeekends(availableRoomsAsStrings, nrWeeks) &&
                    isValidNrOfRoomsAvailable(availableRoomsAsStrings, nrParticipants)) {
                System.out.println(priceForOnePerson * nrParticipants);
                foundHotel = true;
                break;
            }
        }

        if(!foundHotel) {
            System.out.println("stay home");
        }

        scanner.close();
    }

    private static boolean areAvailableRoomsForAllWeekends(List<String> availableRoomsAsStrings, int nrWeeks) {
        return availableRoomsAsStrings.stream()
                .mapToInt(Integer::valueOf)
                .boxed()
                .filter(x -> x != 0)
                .count() == nrWeeks;
    }

    private static boolean isValidNrOfRoomsAvailable(List<String> availableRoomsAsStrings, int nrParticipants) {
        return availableRoomsAsStrings.stream()
                .mapToInt(Integer::valueOf)
                .boxed()
                .noneMatch(x -> x < nrParticipants);
    }

    private static boolean isPriceUnderBudget(int priceForAllParticipants, int budget) {
        return priceForAllParticipants < budget;
    }
}
