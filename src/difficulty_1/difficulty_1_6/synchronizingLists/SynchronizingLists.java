package difficulty_1.difficulty_1_6.synchronizingLists;

import java.util.*;
import java.util.stream.IntStream;

public class SynchronizingLists {

    private static List<Integer> firstList;
    private static List<Integer> secondList;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while(n != 0) {
            firstList = new LinkedList<>();
            secondList = new LinkedList<>();

            IntStream.range(0, n).forEach(i -> firstList.add(Integer.valueOf(scanner.nextLine())));
            IntStream.range(0, n).forEach(i -> secondList.add(Integer.valueOf(scanner.nextLine())));

            ArrayList<Integer> sortedFirstList = new ArrayList<>(firstList);
            sortedFirstList.sort(Comparator.naturalOrder());
            ArrayList<Integer> sortedSecondList = new ArrayList<>(secondList);
            sortedSecondList.sort(Comparator.naturalOrder());

            IntStream.range(0, n).forEach(i -> System.out.println(sortedSecondList.get(sortedFirstList.indexOf(firstList.get(i)))));

            System.out.println();
            n = Integer.parseInt(scanner.nextLine());
        }

        scanner.close();
    }
}