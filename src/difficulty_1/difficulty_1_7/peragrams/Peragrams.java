package difficulty_1.difficulty_1_7.peragrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Peragrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int sumOddEncounters = 0;
        for(Integer count : map.values()) {
            sumOddEncounters += count % 2 == 0 ? 0 : 1;
        }

        if(sumOddEncounters <= 1) System.out.println(0);
        else System.out.println(sumOddEncounters - 1);
    }
}
