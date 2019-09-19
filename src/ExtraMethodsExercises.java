import java.util.Scanner;

public class ExtraMethodsExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(countVowels("test"));
        System.out.println(countCapLetters("TeStInG"));


    }

    public static int countAs(String word){
        int count = 0;
        for (int i=0 ; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'a'){
                count ++;
            }
        }
        return count;
    }

    public static int countEs(String word){
        int count = 0;
        for (int i=0 ; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'e'){
                count ++;
            }
        }
        return count;
    }

    public static int countIs(String word){
        int count = 0;
        for (int i=0 ; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'i'){
                count ++;
            }
        }
        return count;
    }

    public static int countOs(String word){
        int count = 0;
        for (int i=0 ; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'o'){
                count ++;
            }
        }
        return count;
    }

    public static int countUs(String word){
        int count = 0;
        for (int i=0 ; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'u'){
                count ++;
            }
        }
        return count;
    }

    public static String countVowels(String word){
        int numberOfAs = countAs(word);
        int numberOfEs = countEs(word);
        int numberOfIs = countIs(word);
        int numberOfOs = countOs(word);
        int numberOfUs = countUs(word);

        return "|======== VOWEL COUNT ========|\n| A's | E's | I's | O's | U's |\n| " + numberOfAs + "   | " + numberOfEs + "   | " + numberOfIs + "   | " + numberOfOs + "   | " + numberOfUs + "   |\n|=============================|";
    }

    public static int countCapLetters(String word){
        int count = 0;
        for (int i=0 ; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == Character.toUpperCase(ch)){
                count ++;
            }
        }
        return count;
    }



}
