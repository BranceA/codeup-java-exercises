import java.util.Scanner;

public class ControlFlowExercises {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing){
            System.out.println("ENTER YOUR GRADE!!!");
            byte gradeInput = input.nextByte();
            if (gradeInput >= 90 && gradeInput <= 100) {
                System.out.println("You got an A");
            } else if (gradeInput >= 80 && gradeInput <= 89) {
                System.out.println("You got a B");
            } else if (gradeInput >= 70 && gradeInput <= 79) {
                System.out.println("You got a C");
            } else if (gradeInput >= 60 && gradeInput <= 69) {
                System.out.println("You got a D");
            } else if (gradeInput < 60) {
                System.out.println("You fail my dude");
            }

            System.out.println("Keep going?");
            keepGoing = input.nextBoolean();

        }

    }

}
