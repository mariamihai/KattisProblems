package difficulty_1.difficulty_1_9.anotherBrickInTheWall;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnotherBrickInTheWall {

    private static String YES = "YES";
    private static String NO  = "NO";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wallHeight = scanner.nextInt();
        int wallWidth = scanner.nextInt();
        int nrOfBricks = scanner.nextInt();
        scanner.nextLine();

        List<Integer> bricks = Arrays.asList(scanner.nextLine().split(" "))
                .stream()
                .mapToInt(Integer::valueOf)
                .boxed()
                .collect(Collectors.toList());

        int rowLength = 0;
        int constructedHeight = 0;

        for(Integer brickLength : bricks) {
            rowLength += brickLength;
            
            if(rowLength == wallWidth) {
                constructedHeight++;
                rowLength = 0;
                if(constructedHeight == wallHeight) {
                    System.out.println(YES);
                }
            } else if(rowLength > wallWidth) {
                System.out.println(NO);
                break;
            }
        }

        scanner.close();
    }
}

