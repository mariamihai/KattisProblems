package difficulty_1.difficulty_1_8.TODO_veci;

import java.util.Scanner;

public class Veci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split("");

        boolean notFound = true;
        int i = str.length - 1;
        while(notFound && i > 0) {
            int last = Integer.parseInt(str[i]);
            int beforeLast = Integer.parseInt(str[i - 1]);
            if(last > beforeLast) {
                notFound = false;
                str[i] = String.valueOf(beforeLast);
                str[i - 1] = String.valueOf(last);
            }
            i--;
        }

        if(!notFound) {
            for(i = 0; i < str.length; i++) {
                System.out.print(str[i]);
            }
        } else System.out.println(0);
    }
}
