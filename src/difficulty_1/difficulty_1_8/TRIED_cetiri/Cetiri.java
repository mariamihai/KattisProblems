package difficulty_1.difficulty_1_8.TRIED_cetiri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cetiri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());

        Collections.sort(list);
        int distOne = Math.abs(list.get(1) - list.get(0));
        int distTwo = Math.abs(list.get(2) - list.get(1));

        if(distOne == distTwo) System.out.println(list.get(2) + distOne);
        if((distOne * 2) == distTwo) System.out.println(list.get(1) + distOne);
        if(distOne == (distTwo * 2)) System.out.println(list.get(0) + distTwo);
    }
}
