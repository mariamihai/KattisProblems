package difficulty_1.difficulty_1_5.ptice;

import java.util.Scanner;

public class Ptice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String answers = scanner.next();

        int adrian = 0;
        int bruno = 0;
        int goran = 0;

        int total = 0;

        for(int i = 0; i < count; i++) {
            char ch = answers.charAt(0);
            boolean correctAnswer = false;

            if(ch == 'A') {
                if(i % 3 == 0) { adrian++; correctAnswer = true;}
                if(i % 4 == 1) { bruno++; correctAnswer = true; }
                if(i % 6 == 2 || i % 6 == 3)
                               { goran++; correctAnswer = true; }
            }

            if(ch == 'B') {
                if(i % 3 == 1) { adrian++; correctAnswer = true;}
                if(i % 2 == 0) { bruno++; correctAnswer = true; }
                if(i % 6 == 4 || i % 6 == 5)
                               { goran++; correctAnswer = true; }

            }

            if(ch == 'C') {
                if(i % 3 == 2) { adrian++; correctAnswer = true;}
                if(i % 4 == 3) { bruno++; correctAnswer = true; }
                if(i % 6 == 0 || i % 6 == 1)
                               { goran++; correctAnswer = true; }
            }

            if(correctAnswer) total++;
        }

        int max = Math.max(adrian, Math.max(bruno, goran));

        System.out.println(max);
        if(max == adrian) System.out.println("Adrian");
        if(max == bruno) System.out.println("Bruno");
        if(max == goran) System.out.println("Goran");
    }

}
