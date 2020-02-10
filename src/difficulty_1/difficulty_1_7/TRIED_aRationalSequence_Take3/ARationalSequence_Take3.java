package difficulty_1.difficulty_1_7.TRIED_aRationalSequence_Take3;

import java.util.LinkedList;
import java.util.Scanner;

public class ARationalSequence_Take3 {

    private class Rational {
        int p;
        int q;

        Rational(int p, int q) {
            this.p = p;
            this.q = q;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for(int i = 0; i < count; i++) {
            int currentNr = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println(currentNr + " " + bfs(n));
        }
    }

    private static String bfs(int n) {
        LinkedList<Rational> queue = new LinkedList<>();

        ARationalSequence_Take3 sequence = new ARationalSequence_Take3();
        queue.add(sequence.new Rational(1, 1));

        int cnt = 0;
        while(!queue.isEmpty()) {
            cnt++;

            Rational r = queue.poll();

            if(cnt == n) return r.p + "/" + r.q;

            queue.add(sequence.new Rational(r.p, r.p + r.q));
            queue.add(sequence.new Rational(r.p + r.q, r.q));
        }

        return "";
    }
}
