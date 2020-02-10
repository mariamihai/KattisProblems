package difficulty_1.difficulty_1_7.abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ABC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nrStrings = scanner.nextLine().split(" ");
        List<Integer> nrList = new ArrayList<>();
        String order = scanner.nextLine();

        for(int i = 0; i < 3; i++) {
            nrList.add(Integer.parseInt(nrStrings[i]));
        }

        Collections.sort(nrList);

        for(int i = 0; i < 3; i++) {
            if('A' == order.charAt(i)) System.out.print(nrList.get(0) + " ");
            if('B' == order.charAt(i)) System.out.print(nrList.get(1) + " ");
            if('C' == order.charAt(i)) System.out.print(nrList.get(2) + " ");
        }
    }
}
