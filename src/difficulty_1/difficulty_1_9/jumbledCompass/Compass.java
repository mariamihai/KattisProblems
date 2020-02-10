package difficulty_1.difficulty_1_9.jumbledCompass;

public class Compass {

    public static void main(String[] args) {
        run(315, 45);
        System.out.println("=>   " + 90 + "\n");

        run(180, 270);
        System.out.println("=>  " +  90 + "\n");

        run(45, 270);
        System.out.println("=>   " + (-135) + "\n");

        /** My examples **/
        System.out.println("My examples:");

        run(350, 10);
        System.out.println("=>   " + 20 + "\n");

        run(120, 110);
        System.out.println("=>   " + (-10) + "\n");

        run(180, 270);
        System.out.println("=>   " + 90 + "\n");

        run(45, 50);
        System.out.println("=>   " + 5 + "\n");

        run(90, 270);
        System.out.println("=>   " + 180 + "\n");

        run(270, 90);
        System.out.println("=>   " + 180 + "\n");
    }

    public static void run(int current, int expected) {
        int first, second;

        if(current > expected) { // spins clockwise
            first = (360 - current) + expected;
            second = expected - current;
        } else { // spins counterclockwise
            first = -1 * ((360 - expected) + current);
            second = -1 * (current - expected);
        }

        int firstAbs = Math.abs(first);
        int secondAbs = Math.abs(second);

        // should this be == 180 ? nu poate fi 90 si -90 in acelasi timp, doar 180 si -180
        if(firstAbs == secondAbs) {
            System.out.println(firstAbs);
        }else if (firstAbs > secondAbs) {
            System.out.println(second);
        } else {
            System.out.println(first);
        }
    }
}
