package difficulty_1.difficulty_1_5.taisFormula;

import java.util.Scanner;

public class Tai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x[] = new int[n];
        double y[] = new double[n];

        for(int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextDouble();
        }

        double area = 0;

        for (int i = 0; i < n - 1; i++) {
            area += (y[i] + y[i+1]) / 2 * (x[i+1] - x[i]) / 1000;
        }

        System.out.println(area);
    }
}
