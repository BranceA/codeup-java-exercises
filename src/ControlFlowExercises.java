import java.util.Scanner;

public class ControlFlowExercises {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER!!!");
        boolean keepGoing = true;
        int inputNumber = input.nextInt();
        int i = 1;
        while (keepGoing && i <= inputNumber) {
            System.out.println(i + ": Squared is: " + (i * i) + " Cubed is: " + (i * i * i));
            i++;
            System.out.println("Continue?");
            keepGoing = input.nextBoolean();
        }

    }

}
