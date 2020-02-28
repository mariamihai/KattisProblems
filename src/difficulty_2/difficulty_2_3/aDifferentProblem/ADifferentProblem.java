package difficulty_2.difficulty_2_3.aDifferentProblem;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ADifferentProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();

            List<Long> numbers = Arrays.stream(line.split(" ")).mapToLong(Long::valueOf).boxed().collect(Collectors.toList());
            System.out.println(Math.abs(numbers.get(0) - numbers.get(1)));
        }

        scanner.close();
    }
}
