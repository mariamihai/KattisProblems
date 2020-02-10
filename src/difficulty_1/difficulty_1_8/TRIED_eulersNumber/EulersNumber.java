package difficulty_1.difficulty_1_8.TRIED_eulersNumber;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class EulersNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if(n == 0) System.out.println(1);
        else {
            BigDecimal ONE = new BigDecimal(1.00);
            BigDecimal e = new BigDecimal(1.00);
            int prod = 1;

            for (int i = 1; i <= n; i++) {
                prod *= i;
                e = e.add(ONE.divide(new BigDecimal(prod), 100, RoundingMode.HALF_EVEN));
            }

            System.out.println(e);
        }
    }
}
