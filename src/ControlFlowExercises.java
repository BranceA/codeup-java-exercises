import java.util.Scanner;

public class ControlFlowExercises {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            String gradeLetter = "";
            System.out.println("ENTER YOUR GRADE!!!");
            byte gradeInput = input.nextByte();
            if (gradeInput >= 90 && gradeInput <= 100) {
                gradeLetter = "A";
            } else if (gradeInput >= 80 && gradeInput <= 89) {
                gradeLetter = "B";
            } else if (gradeInput >= 70 && gradeInput <= 79) {
                gradeLetter = "C";
            } else if (gradeInput >= 60 && gradeInput <= 69) {
                gradeLetter = "D";
            } else if (gradeInput < 60) {
                System.out.println("You fail my dude");
            }

            if ((gradeInput % 10 == 9) || (gradeInput == 100)) {
                gradeLetter += "+";
            } else if (gradeInput % 10 == 0) {
                gradeLetter += "-";
            }

            System.out.println(gradeLetter);

            System.out.println("Keep going?");
            keepGoing = input.nextBoolean();
//        int x = 100;
//
//        for(byte y = 1; y < 2; y++) {
//            do {
//                System.out.println(x);
//                x -= 5;
//
//            } while (x >= -10);
//        }
        }
    }

}
