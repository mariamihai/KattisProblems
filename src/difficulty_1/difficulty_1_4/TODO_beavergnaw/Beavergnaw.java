package difficulty_1.difficulty_1_4.TODO_beavergnaw;

import java.util.Scanner;

public class Beavergnaw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            String[] line = sc.nextLine().split(" ");
            int D = Integer.parseInt(line[0]);
            if (D == 0)
                return;
            double eaten = Integer.parseInt(line[1]) * 1.5;
            double R = D / 2.0;
            double Total = Math.pow(R, 2) * Math.PI * D;
            Total -= eaten;
            Total /= Math.PI;
            Total /= 2;
            Total = Math.cbrt(Total);
            System.out.println(2 * Total);
        }
    }
}
