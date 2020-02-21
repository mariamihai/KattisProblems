package difficulty_2.difficulty_2_0.TRIED_babelfish;

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

        scanner.forEachRemaining(str -> {
            if(dictionary.containsKey(str)) {
                builder.append(dictionary.get(str)).append("\n");
            } else {
                builder.append("eh\n");
            }
        });

//        while(scanner.hasNextLine()) {
//            line = scanner.nextLine();
//
//            if(dictionary.containsKey(line)) {
//                builder.append(dictionary.get(line) + "\n");
//            } else {
//                builder.append("eh\n");
//            }
//        }

        System.out.println(builder);

        scanner.close();
    }
}
