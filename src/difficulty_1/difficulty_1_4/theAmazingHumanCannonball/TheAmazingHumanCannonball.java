package difficulty_1.difficulty_1_4.theAmazingHumanCannonball;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheAmazingHumanCannonball {


    public static Integer VELOCITY = 0;
    public static Integer ANGLE = 1;
    public static Integer X = 2;
    public static Integer H1 = 3;
    public static Integer H2 = 4;

    public static Double G = 9.81;


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < N; i++) {
            LinkedList<Double> parmeters = Arrays.stream(scanner.nextLine().split(" "))
                                                .map(Double::parseDouble)
                                                .collect(Collectors.toCollection(LinkedList::new));
            calculate(parmeters);
        }
    }

    private static void calculate(LinkedList<Double> parmeters) {
        double t = parmeters.get(X) / (parmeters.get(VELOCITY) * Math.cos(parmeters.get(ANGLE) * Math.PI / 180.0));

        double y = parmeters.get(VELOCITY) * t * Math.sin(parmeters.get(ANGLE) * Math.PI / 180.0) - G * t * t / 2;

        if(parmeters.get(H1) + 1 < y && y < parmeters.get(H2) - 1) {
            System.out.println("Safe");
        } else {
            System.out.println("Not Safe");
        }
    }
}
