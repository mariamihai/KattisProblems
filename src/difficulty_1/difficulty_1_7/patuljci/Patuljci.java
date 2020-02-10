package difficulty_1.difficulty_1_7.patuljci;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Patuljci {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        List<Integer> arr = new LinkedList<>();
        for(int i = 0; i < 9; i++) {
            int nr = Integer.parseInt(scanner.next());
            arr.add(nr);
            sum += nr;
        }

        // Get the sum of the 2 impostors
        sum -= 100;

        findImpostors(arr, sum);

        for(int i = 0; i < 7; i++) {
            System.out.println(arr.get(i));
        }
    }


    private static void findImpostors(List<Integer> arr, int sum) {
        for(int i = 0; i < 9; i++) {
            for(int j = i + 1; j < 9; j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    arr.remove(i);
                    arr.remove(j-1);

                    return;
                }
            }
        }
    }
}
