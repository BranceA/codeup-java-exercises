import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println(sumOfNums(4, 9));
//        System.out.println(subtractNums(8, 2));
//        System.out.println(iKnowWhatProductMeans(4, 7));
//        System.out.println(divideNums(20, 5));
//        System.out.println(whatIsModulus(10, 3));
//        System.out.println(iDontKnowWhatProductMeans(1, 7));
//        getInteger(1, 10);
        getFactorials();
//        rollDice();

    }

    public static int sumOfNums(int num1, int num2){
        return num1 + num2;
    }

    public static int subtractNums(int num1, int num2){
        return num1 - num2;
    }

    public static int iKnowWhatProductMeans(int num1, int num2){
        return num1 * num2;
    }

    public static int divideNums(int num1, int num2){
        return num1 / num2;
    }

    public static int whatIsModulus(int num1, int num2){
        return num1 % num2;
    }

    public static int iDontKnowWhatProductMeans(int num1, int num2){
        num2 -= 1;
        int product = num1;
        if (num2 == 0){
            return product;
        }else {
            product += num1;
            return iDontKnowWhatProductMeans(num1, num2, product);
        }
    }

    public static int iDontKnowWhatProductMeans(int num1, int num2, int product){
        num2 -= 1;
        if (num2 == 0){
            return product;
        }else {
            product += num1;
            return iDontKnowWhatProductMeans(num1, num2, product);
        }
    }

    public static int getInteger(int min, int max){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput;
        if(input.hasNextInt()){
            userInput = input.nextInt();
        } else {
            System.out.println("Invalid input. Try again bro.");
            return getInteger(min, max);
        }
        if (userInput < min || userInput > max){
            System.out.println("Invalid range. Try again bro.");
            return getInteger(min, max);
        }else {
            return userInput;
        }

    }

    public static String getFactorials(){
        Scanner input = new Scanner(System.in);

        String keepGoing = "y";

        while (keepGoing.equalsIgnoreCase("y")) {

            int userInput = getInteger(1, 10);

            String output = "";

            for (int i = 1; i <= userInput; i++) {
                output += getFactorials(i);
            }
            System.out.println(output);
            System.out.println("Keep Going? Y/N");
            keepGoing = input.nextLine();
        }

        return "";
    }

    public static String getFactorials(int num){
        String output = num + "! = ";
        long fact = 1L;
        for (int i = 1; i <= num; i++){
            output += " X " + i;
            fact *= i;
        }
        if(num == 10){
            output = output.substring(0, 5) + output.substring(8) + " = " + fact +"\n";
        }else{
            output = output.substring(0, 5) + output.substring(7) + " = " + fact +"\n";
        }
        return output;
    }

    public static int rollDice(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides do you want your dice to have?");
        int userInput = getInteger(4, 12);
        int max = userInput;
        int min = 1;
        int range = max - min + 1;

        int rand = (int)(Math.random() * range) + min;
        int rand2 = (int)(Math.random() * range) + min;
        System.out.println("You rolled a " + rand + " and a " + rand2 + " totalling: " + (rand + rand2));
        System.out.println("Would you like to roll again? Y/N");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("y")){
            rollDice();
        }else if (answer.equalsIgnoreCase("n")){
            System.out.println("Later");
        }

        return (rand + rand2);

    }



}
