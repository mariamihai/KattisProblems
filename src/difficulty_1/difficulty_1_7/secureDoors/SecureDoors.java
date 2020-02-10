package difficulty_1.difficulty_1_7.secureDoors;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecureDoors {

    private static Map<String,  String> entered;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        scanner.nextLine();

        entered = new HashMap<>();
        for(int i = 0; i < cnt; i++) {
            String[] split = scanner.nextLine().split(" ");

            String action = split[0];
            String name = split[1];

            print(name, action, isAnomaly(name, action));
        }
    }

    private static boolean isAnomaly (String name, String action) {
        if(!entered.containsKey(name)) {
            if("entry".equals(action)) {
                entered.putIfAbsent(name, action);
                return false;
            }
            return true;
        }

        if(!entered.get(name).equals(action)) {
            entered.put(name, action);
            return false;
        }

        return true;
    }

    private static void print(String name, String action, boolean isAnomaly) {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        if("entry".equals(action)) builder.append(" entered");
        if("exit".equals(action)) builder.append(" exited");
        if(isAnomaly) builder.append(" (ANOMALY)");

        System.out.println(builder);
    }
}
