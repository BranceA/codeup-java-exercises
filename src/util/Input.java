package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
}

    public boolean yesNo(){
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("true") || answer.equalsIgnoreCase("yay verily")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        String userInput = scanner.nextLine();
        int userInt;
        if(userInput.matches(".*\\d.*")){
            userInt = Integer.parseInt(userInput);
        } else {
            System.out.println("That's an invalid input. Try again.");
            return getInt(min, max);
        }
        if (userInt < min || userInt > max){
            System.out.println("That's an invalid range. Try again.");
            return getInt(min, max);
        }else {
            return userInt;
        }

    }

    public int getInt() {
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        } else {
            System.out.println("That isn't an integer. Try again.");
            return getInt();
        }

    }

    public double getDouble(double min, double max) {
        System.out.print("Enter a double between " + min + " and " + max + ": ");
        double userInput;
        if(scanner.hasNextDouble()){
            userInput = scanner.nextDouble();
        } else {
            System.out.println("That's an invalid input. Try again.");
            return getDouble(min, max);
        }
        if (userInput < min || userInput > max){
            System.out.println("That's an invalid range. Try again.");
            return getDouble(min, max);
        }else {
            return userInput;
        }
    }

    public double getDouble() {
        if(scanner.hasNextDouble()){
            return scanner.nextDouble();
        } else {
            System.out.println("That isn't a double. Try again.");
            return getDouble();
        }
    }

}

//    String getString()
//    boolean yesNo()
//    int getInt(int min, int max)
//    int getInt()
//    double getDouble(double min, double max)
//    double getDouble()