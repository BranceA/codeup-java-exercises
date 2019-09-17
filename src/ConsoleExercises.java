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
        System.out.println("Enter word one:");
        String wordOne = input.next();
        System.out.println("Enter word two:");
        String wordTwo = input.next();
        System.out.println("Enter word three:");
        String wordThree = input.next();
        System.out.println(wordOne + " " + wordTwo + " " + wordThree);
        System.out.println("Enter a sentence:");
        String userSentence = input.nextLine();
        System.out.println(userSentence);
        System.out.println("Enter the room's length:");
        double length = Double.parseDouble(input.nextLine());
        System.out.println("Enter the room's width:");
        double width = Double.parseDouble(input.nextLine());
        System.out.println("Enter the room's height:");
        double height = Double.parseDouble((input.nextLine()));
        System.out.println("The area of the room is " + (length * width) + " and the perimeter is " + (width + width + length + length) + " and the volume is " + (width * height * length) + ".");


    }

}
