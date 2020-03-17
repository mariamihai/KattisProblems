package difficulty_2.difficulty_2_4.busNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BusNumbers {

    public static void main(String[] args) {
        List<Integer> buses = getBuses();

        Collections.sort(buses);
        printRepresentation(buses);
    }

    private static List<Integer> getBuses() {
        Scanner scanner = new Scanner(System.in);

        int nrOfBuses = scanner.nextInt();
        List<Integer> buses = new ArrayList<>();
        for(int i = 0; i < nrOfBuses; i++) {
            buses.add(scanner.nextInt());
        }

        scanner.close();

        return buses;
    }

    private static void printRepresentation(List<Integer> buses) {
        StringBuilder builder = new StringBuilder();
        int firstBus = buses.get(0);
        int previousBus = firstBus;

        for(int i = 1; i < buses.size(); i++) {
            int currentBus = buses.get(i);

            if(currentBus == previousBus + 1) {
                previousBus++;
            } else {
                builder.append(construct(firstBus, previousBus)).append(" ");

                firstBus = previousBus = currentBus;
            }
        }

        builder.append(construct(firstBus, previousBus));

        System.out.println(builder);
    }

    private static StringBuilder construct(int firstBus, int previousBus) {
        StringBuilder builder = new StringBuilder();

        if(firstBus == previousBus) {
            builder.append(firstBus);
        } else if(previousBus == firstBus + 1) {
            builder.append(firstBus).append(" ").append(previousBus);
        } else {
            builder.append(firstBus).append("-").append(previousBus);
        }

        return builder;
    }
}