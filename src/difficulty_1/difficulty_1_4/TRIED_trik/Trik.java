package difficulty_1.difficulty_1_4.TRIED_trik;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Trik {

    private static Map<String, Point> swapOrder;

    public static void main (String[] args) {
        swapOrder = new HashMap<>();

        swapOrder.put("A", new Point(1, 2));
        swapOrder.put("B", new Point(2, 3));
        swapOrder.put("C", new Point(1, 3));

        Integer currentPosition = 1;

        Scanner scanner = new Scanner(System.in);
        String[] splittedMoves = scanner.nextLine().split("");

        for(int i = 0; i < splittedMoves.length; i++) {
            currentPosition = swappedPosition(currentPosition, splittedMoves[i]);
        }

        System.out.println(currentPosition);
    }

    private static int swappedPosition (Integer previousPosition, String currentMove) {
        Point point = swapOrder.get(currentMove);

        if(previousPosition == point.getX()) return (int) point.getY();
        return (int) point.getX();
    }
}