import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String keepTalking = "y";

        while (keepTalking.equalsIgnoreCase("y")) {

            System.out.println("Say something to Bob.");
            String sayThisToBob = input.nextLine();
            if (sayThisToBob.endsWith("?")) {
                System.out.println("Sure");
            } else if (sayThisToBob.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (sayThisToBob.length() == 0) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Keep talking to Bob? Y/N");
            keepTalking = input.nextLine();

        }

    }

}
