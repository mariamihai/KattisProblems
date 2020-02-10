package difficulty_1.difficulty_1_7.unBearAbleZoo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UnBearAbleZoo {

    private static Map<String, Integer> map;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = 1;
        int nr = scanner.nextInt();
        scanner.nextLine();
        while(nr != 0) {
            map = new TreeMap<>();

            for(int i = 0; i < nr; i++) {
                String str = scanner.nextLine();
                String[] split = str.split(" ");

                String animal;
                if (split.length > 1) {
                    animal = split[split.length - 1].toLowerCase();
                } else {
                    animal = str.toLowerCase();
                }

                map.putIfAbsent(animal, 0);
                map.replace(animal, map.get(animal) + 1);
            }

            System.out.println("List " + cnt++ + ":");
            for(Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + " | " + entry.getValue());
            }

            nr = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
