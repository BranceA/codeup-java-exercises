import java.util.Scanner;
import util.Input;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        String word = "test";
//        char firstChar = word.charAt(0);
//        String firstLetter = "" + firstChar;
//        System.out.println(firstLetter);
//
//        String search = "tiny cats looking cute";
//        search = search.replace("cats", "dogs");
//        System.out.println(search);

//        System.out.println("Enter a word to pig latinify");
//        String word = input.nextLine();
//        char firstLetter = word.charAt(0);
//        if (("" + firstLetter).equalsIgnoreCase("a") || ("" + firstLetter).equalsIgnoreCase("e") || ("" + firstLetter).equalsIgnoreCase("i") || ("" + firstLetter).equalsIgnoreCase("o") || ("" + firstLetter).equalsIgnoreCase("u")){
//            word = word + "ay";
//            System.out.println(word);
//        } else {
//            word = word.substring(1) + firstLetter + "ay";
//            System.out.println(word);
//        }

//        countToHundred(1);

//        test();

        fizzBuzz("");

//        Person dude = new Person("Chuck");

//        Input thisInput = new Input();

//        String testThisOut = thisInput.getString();
//        System.out.println(testThisOut);
//        boolean moreTesting = thisInput.yesNo();
//        System.out.println(moreTesting);
//        int testingIntMethod = thisInput.getInt(1, 10);
//        System.out.println(testingIntMethod);
//        System.out.println(thisInput.getInt());

//        System.out.println(thisInput.getDouble());
//        System.out.println(thisInput.getDouble(3, 9));

//        names[0] = "Brance";
//        names[1] = "Alexander";
//        names[2] = "Chris";
//        names[3] = "Brunch";
//
//        System.out.println(names[2]);
//
//        for(String name : names){
//            System.out.println(name.equalsIgnoreCase("chris"));
//        }

    }

    static String[] names = new String[4];

    public static void test() {
        int x = 5 * 4 % 3;
        System.out.println(x);
    }


    public static int countToHundred(int i){
        System.out.println(i);
        i++;
        if(i == 100){
            return 0;
        }
        return countToHundred(i);
    }

    public static void fizzBuzz(String currentOutput){

        if(((currentOutput.split("\r\n|\r|\n").length) % 3 != 0) && ((currentOutput.split("\r\n|\r|\n").length) % 5 != 0)) {
            currentOutput += (currentOutput.split("\r\n|\r|\n").length) + "\n";
            fizzBuzz(currentOutput);
            return;
        }

        if((currentOutput.split("\r\n|\r|\n").length) % 3 == 0){
            currentOutput += "Fizz";
        }

        if((((currentOutput.split("\r\n|\r|\n").length) % 5 == 0) && (currentOutput.substring(currentOutput.length() - 1).equalsIgnoreCase("\n"))) || ((((currentOutput.split("\r\n|\r|\n").length) % 5 == 1)) && ((currentOutput.substring(currentOutput.length() - 1).equalsIgnoreCase("z"))))){
            currentOutput += "Buzz";
        }

        if((currentOutput.split("\r\n|\r|\n").length) <= 100) {
            currentOutput += "\n";
            fizzBuzz(currentOutput);
        }

        if ((currentOutput.split("\r\n|\r|\n").length) == 101) {
            currentOutput = currentOutput.substring(2);
            System.out.println(currentOutput);
        }

    }

}
