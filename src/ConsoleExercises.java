import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.println("Enter an integer:");
        int newInt = input.nextInt();
        System.out.println("You entered " + newInt);
        System.out.println("Enter three words:");
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();
        System.out.println(wordOne + " " + wordTwo + " " + wordThree);
        System.out.println("Enter a sentence:");
        String userSentence = input.next();
        System.out.println("You entered: " + userSentence);
        System.out.println("Enter the room's length followed by width followed by height:");
        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("The area of the room is " + (length * width) + " and the perimeter is " + (width + width + length + length) + " and the volume is " + (width * height * length) + ".");


    }

}
