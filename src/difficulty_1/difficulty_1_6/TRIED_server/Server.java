package difficulty_1.difficulty_1_6.TRIED_server;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrTasks = scanner.nextInt();
        int totalTime = scanner.nextInt();

        int count = 0;
        for(int i = 0; i < nrTasks; i++) {
            int nr = scanner.nextInt();
            count += nr;

            if(count > totalTime) {
                System.out.println(i);
                break;
            }
        }
    }
}
