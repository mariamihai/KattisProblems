package difficulty_1.difficulty_1_3.cetvrta;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        List<Integer> xs = new LinkedList<>();
        List<Integer> ys = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        int x, y;

        for(int i = 0; i < 3; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();

            if(!xs.remove((Integer) x)) {
                xs.add(x);
            }

            if(!ys.remove((Integer) y)) {
                ys.add(y);
            }
        }

        System.out.println(xs.get(0) + " " + ys.get(0));
    }
}
