package difficulty_1.difficulty_1_5.oddManOut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddManOut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> guests;

        int count = scanner.nextInt();

        for(int i = 0; i < count; i++) {
            int nrGuests = scanner.nextInt();
            guests = new ArrayList<>();

            for(int j = 0; j < nrGuests; j++) {
                int invitationCode = scanner.nextInt();

                if(guests.contains(invitationCode)) {
                    guests.remove((Integer) invitationCode);
                } else {
                    guests.add(invitationCode);
                }
            }
            System.out.println("Case #" + (i+1) + ": " + guests.get(0));
        }
    }
}
