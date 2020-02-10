package difficulty_1.difficulty_1_8.preludes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Preludes {

    private static Map<String, String> keys = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        keys.put("Ab", "G#");
        keys.put("G#", "Ab");
        keys.put("A#", "Bb");
        keys.put("Bb", "A#");
        keys.put("C#", "Db");
        keys.put("Db", "C#");
        keys.put("D#", "Eb");
        keys.put("Eb", "D#");
        keys.put("F#", "Gb");
        keys.put("Gb", "F#");

        int cnt = 0;
        while(scanner.hasNext()) {
            String[] line = scanner.nextLine().split(" ");
            if(line[0].length() == 1) {
                char ch = line[0].charAt(0);
                if(ch >= 65 && ch <= 71) System.out.println("Case " + (++cnt) + ": UNIQUE");
            } else {
                System.out.println("Case " + (++cnt) + ": " + keys.get(line[0]) + " " + line[1]);
            }
        }
    }
}
