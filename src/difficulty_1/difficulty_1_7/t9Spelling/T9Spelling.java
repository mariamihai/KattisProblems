package difficulty_1.difficulty_1_7.t9Spelling;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T9Spelling {

    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < count; i++) {
            String str = scanner.nextLine();

            System.out.print("Case #" + (i+1) + ": ");
            for(int j = 0; j< str.length(); j++ ) {
                System.out.print(isAdiacent(str, j) + map.get(String.valueOf(str.charAt(j))));
            }
            System.out.println();
        }
    }

    private static String isAdiacent(String str, int index) {
        if(index >= 1) {
            int first = map.get(String.valueOf(str.charAt(index - 1))) % 10;
            int second = map.get(String.valueOf(str.charAt(index))) % 10;
            if(first == second) return " ";
        }
        return "";
    }

    private static void init() {
        map.put(" ", 0);
        map.put("a", 2);
        map.put("b", 22);
        map.put("c", 222);
        map.put("d", 3);
        map.put("e", 33);
        map.put("f", 333);
        map.put("g", 4);
        map.put("h", 44);
        map.put("i", 444);
        map.put("j", 5);
        map.put("k", 55);
        map.put("l", 555);
        map.put("m", 6);
        map.put("n", 66);
        map.put("o", 666);
        map.put("p", 7);
        map.put("q", 77);
        map.put("r", 777);
        map.put("s", 7777);
        map.put("t", 8);
        map.put("u", 88);
        map.put("v", 888);
        map.put("w", 9);
        map.put("x", 99);
        map.put("y", 999);
        map.put("z", 9999);
    }
}
