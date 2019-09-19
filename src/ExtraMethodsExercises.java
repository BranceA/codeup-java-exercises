import java.util.Scanner;
import java.util.*;
import java.io.*;

public class ExtraMethodsExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(isPalindrome("racecar"));

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

    public static String getType(double input){
        return "This be a double";
    }

    public static String getType(int input){
        return "This be an integer";
    }

    public static String getType(char input){
        return "This be a char";
    }

    public static String getType(String input){
        return "This be a string";
    }

    public static String getType(boolean input){
        return "This be a boolean";
    }

    public static void allTheLetters(String word){
        int wordLength = word.length();
        int count = 0;
        System.out.println(word.charAt(count));
        count++;
        if(count < wordLength){
            allTheLetters(word, count);
        }
    }

    public static void allTheLetters(String word, int num){
        int wordLength = word.length();
        int count = num;
        System.out.println(word.charAt(count));
        count++;
        if(count < wordLength){
            allTheLetters(word, count);
        }
    }

    public static boolean isPalindrome(String word){
        String reverseWord = "";
        char[] try1 = word.toCharArray();

        for (int i = try1.length-1; i>=0; i--) {
            reverseWord += try1[i];
        }
        return word.equalsIgnoreCase(reverseWord);
    }



}
