package difficulty_1.difficulty_1_7.kafkaesque;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Kafkaesque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr = scanner.nextInt();
        List<Integer> deskNr = new LinkedList<>();
        for(int i = 0; i < nr; i++) {
            deskNr.add(scanner.nextInt());
        }

        int cnt = 1;
        for(int i = 0; i < nr - 1; i++) {
            if(deskNr.get(i) > deskNr.get(i + 1)) cnt++;
        }
        System.out.println(cnt);

        scanner.close();
    }
}
