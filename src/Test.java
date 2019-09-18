import java.util.Scanner;

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

        System.out.println("Enter a word to pig latinify");
        String word = input.nextLine();
        char firstLetter = word.charAt(0);
        if (("" + firstLetter).equalsIgnoreCase("a") || ("" + firstLetter).equalsIgnoreCase("e") || ("" + firstLetter).equalsIgnoreCase("i") || ("" + firstLetter).equalsIgnoreCase("o") || ("" + firstLetter).equalsIgnoreCase("u")){
            word = word + "ay";
            System.out.println(word);
        } else {
            word = word.substring(1) + firstLetter + "ay";
            System.out.println(word);
        }

    }

}
