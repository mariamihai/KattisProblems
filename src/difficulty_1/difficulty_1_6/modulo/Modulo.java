package difficulty_1.difficulty_1_6.modulo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Modulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> modulos = new HashSet<>();

        int modulo = 42;
        for(int i = 0; i < 10; i++) {
            int nr = scanner.nextInt();

            modulos.add(nr % modulo);
        }

        System.out.println(modulos.size());
    }
}
