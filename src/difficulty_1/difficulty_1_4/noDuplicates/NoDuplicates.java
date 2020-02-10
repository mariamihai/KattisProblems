package difficulty_1.difficulty_1_4.noDuplicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().toLowerCase().split(" ");

        System.out.println(validate(words));

        scanner.close();
    }

    private static String validate(String[] words) {
        List<String> wordList = new ArrayList<String>();

        for(int i = 0; i < words.length; i++) {
            if(wordList.contains(words[i])) return "no";
            else wordList.add(words[i]);
        }

        return "yes";
    }
}
