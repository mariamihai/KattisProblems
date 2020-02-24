package difficulty_2.difficulty_2_0.babelfish;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Babelfish {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> dictionary = new HashMap<>();

        String line = scanner.nextLine();
        while(!"".equals(line)) {
            String[] dictionaryEntry = line.split(" ");
            dictionary.put(dictionaryEntry[1], dictionaryEntry[0]);

            line = scanner.nextLine();
        }

        StringBuilder builder = new StringBuilder();

        while(scanner.hasNext()) {
            line = scanner.next();
            if(line.equals("")) {
                break;
            }

            if(dictionary.containsKey(line)) {
                builder.append(dictionary.get(line)).append("\n");
            } else {
                builder.append("eh\n");
            }
        }

        System.out.println(builder);

        scanner.close();
    }
}
