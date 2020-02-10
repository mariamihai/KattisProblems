package difficulty_1.difficulty_1_6.runLengthEncodingRun;

import java.util.Collections;
import java.util.Scanner;

public class RunLengthEncodingRun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");

        StringBuilder builder = new StringBuilder();
        if("E".equals(line[0])) { // encode
            int count = 1;
            char previousCh = line[1].charAt(0);
            for(int i = 1; i < line[1].length(); i++) {
                char currentCh = line[1].charAt(i);
                if(previousCh == currentCh) {
                    count++;
                } else {
                    builder.append(previousCh).append(count);
                    count = 1;
                    previousCh = currentCh;
                }
            }
            builder.append(previousCh).append(count);
            System.out.println(builder);
        } else { // decode
            for(int i = 0; i < line[1].length(); i += 2) {
                String currentCh = String.valueOf(line[1].charAt(i));
                int nrOfCopies = Integer.parseInt(String.valueOf(line[1].charAt(i+1)));
                builder.append(String.join("", Collections.nCopies(nrOfCopies, currentCh)));
            }
            System.out.println(builder);
        }
    }
}
