package difficulty_1.difficulty_1_9.convexPolygonArea;

import java.awt.Point;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvexPolygonArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrOfTestCases = scanner.nextInt();
        scanner.nextLine();

        DecimalFormat df = new DecimalFormat("###.#");

        for(int i = 0; i < nrOfTestCases; i++) {
            int nrOfPoints = scanner.nextInt();
            Point[] points = new Point[nrOfPoints];

            for(int j = 0; j < nrOfPoints; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                points[j] = new Point(x, y);
            }
            scanner.nextLine();

            System.out.println(df.format(calculateArea(points)));
        }

        scanner.close();
    }

    private static double calculateArea(Point[] points) {
        int sum = 0;
        int length = points.length;

        for(int i = 0; i < length - 1; i++) {
            sum += points[i].x * points[i + 1].y -
                   points[i].y * points[i + 1].x;
        }

        sum += points[length - 1].x * points[0].y -
               points[length - 1].y * points[0].x;

        return sum * 0.5;
    }
}
