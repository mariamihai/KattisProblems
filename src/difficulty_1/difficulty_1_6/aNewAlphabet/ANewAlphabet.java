package difficulty_1.difficulty_1_6.aNewAlphabet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ANewAlphabet {

    private static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') System.out.print(map.get(String.valueOf(ch)));
            else System.out.print(ch);
        }
        System.out.println();
    }

    private static void init() {
        map.put("a", "@");
        map.put("b", "8");
        map.put("c", "(");
        map.put("d", "|)");
        map.put("e", "3");
        map.put("f", "#");
        map.put("g", "6");
        map.put("h", "[-]");
        map.put("i", "|");
        map.put("j", "_|");
        map.put("k", "|<");
        map.put("l", "1");
        map.put("m", "[]\\/[]");
        map.put("n", "[]\\[]");
        map.put("o", "0");
        map.put("p", "|D");
        map.put("q", "(,)");
        map.put("r", "|Z");
        map.put("s", "$");
        map.put("t", "']['");
        map.put("u", "|_|");
        map.put("v", "\\/");
        map.put("w", "\\/\\/");
        map.put("x", "}{");
        map.put("y", "`/");
        map.put("z", "2");

    }
}
