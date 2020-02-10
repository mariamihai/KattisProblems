package difficulty_1.difficulty_1_7.TODO_baconEggsAndSpam;

import java.util.*;

public class BaconEggsAndSpam {

    private static Map<String, List<String>> map = new TreeMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();
        while(count !=0) {
            for(int n = 0; n < count; n++) {
                String[] line = scanner.nextLine().split(" ");
                String name = line[0];

                for(int i = 1; i < line.length; i++) {
                    String menuItem = line[i];

                    if(map.containsKey(menuItem)) {
                        List<String> list = map.get(menuItem);
                        list.add(name);
                        map.put(menuItem, list);
                    } else {
                        map.put(menuItem, new ArrayList<>(Arrays.asList(name)));
                    }
                }

                for(Map.Entry<String, List<String>> entry : map.entrySet()) {
                    System.out.print(entry.getKey() + " ");
                    List<String> values = entry.getValue();
                    Collections.sort(values);
                    for (int i = 0; i < values.size(); i++) {
                        System.out.print(values.get(i) + " ");
                    }
                    System.out.println();
                }
            }

            System.out.println();

            count = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
