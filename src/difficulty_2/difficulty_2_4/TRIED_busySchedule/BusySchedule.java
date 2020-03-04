package difficulty_2.difficulty_2_4.TRIED_busySchedule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusySchedule {

    private static final String END_VALUE = "0";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        while(!END_VALUE.equals(line)) {
            List<String> dates = new ArrayList<>();

            for(int i = 0; i < Integer.parseInt(line); i++) {
                dates.add(scanner.nextLine());
            }

            dates.sort((s1, s2) -> {
                if(s1.endsWith("a.m.") && s2.endsWith("p.m.")) return -1;
                if(s1.endsWith("p.m.") && s2.endsWith("a.m.")) return 1;

                if(s1.startsWith("12")) return -1;
                if(s2.startsWith("12")) return 1;

                int nr1 = Integer.parseInt(s1.split(":")[0]);
                int nr2 = Integer.parseInt(s2.split(":")[0]);
                if(nr1 > nr2) return 1;
                if(nr1 < nr2) return -1;

                nr1 = Integer.parseInt(s1.split(":")[1].split(" ")[0]);
                nr2 = Integer.parseInt(s2.split(":")[1].split(" ")[0]);

                return Integer.compare(nr1, nr2);
            });

            dates.forEach(System.out::println);
            System.out.println();

            line = scanner.nextLine();
        }

        scanner.close();
    }
}
