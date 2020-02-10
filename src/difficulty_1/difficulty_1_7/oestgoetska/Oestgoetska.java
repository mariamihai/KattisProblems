package difficulty_1.difficulty_1_7.oestgoetska;

import java.util.Scanner;

public class Oestgoetska {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double countWords = 0;
        double countAEs = 0;

        String[] line = scanner.nextLine().split(" ");
        for(int i = 0; i < line.length; i++) {
            countWords++;
            countAEs += line[i].contains("ae") ? 1 : 0;
        }

        if(countAEs >= (countWords * 2 / 5)) System.out.println("dae ae ju traeligt va");
        else System.out.println("haer talar vi rikssvenska");
    }
}
