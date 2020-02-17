package difficulty_2.difficulty_2_0.hayPoints;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HayPoints {

    private static Map<String, Integer> dictionary = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for(int i = 0; i < m; i++) {
            dictionary.put(scanner.next(), scanner.nextInt());
        }
        scanner.nextLine();

        for(int j = 0; j < n; j++) {
            String str = scanner.nextLine();

            int cnt = 0;
            while(!str.equals(".")) {
                cnt += costForLine(str);
                str = scanner.nextLine();
            }

            System.out.println(cnt);
        }
    }

    private static int costForLine(String str) {
        int cnt = 0;

        String[] splitted = str.split(" ");

        // Optimization to pass the second test
        if(splitted.length < dictionary.size()) {
            for(String word : splitted) {
                if(dictionary.containsKey(word)) cnt += dictionary.get(word);
            }
        } else {
            for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
                if (str.contains(entry.getKey())) cnt += entry.getValue();
            }
        }

        return cnt;
    }
}
