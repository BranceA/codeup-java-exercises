import java.util.Scanner;

public class HangmanBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word Player 1");
        String wordToGuess = input.nextLine().toLowerCase();
        String displayWord = "";
        boolean didWin = false;
        boolean didLose = false;
        byte wrongGuesses = 0;
        String guessedLetters = "";
        for (byte i = 0; i < wordToGuess.length(); i++) {
            displayWord += '*';
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nBegin");

        while (!didWin && !didLose){
            switch (wrongGuesses) {
                case 0:
                    System.out.println("|-----------| \n"+
                            "|           |\n"+
                            "|            \n"+
                            "|\n"+
                            "|\n"+
                            "____________");
                    break;
                case 1:
                    System.out.println("|-----------|\n" +
                            "|           |\n" +
                            "|           O\n" +
                            "|\n" +
                            "|\n" +
                            "____________");
                    break;
                case 2:
                    System.out.println("|-----------|\n" +
                            "|           |\n" +
                            "|           O\n" +
                            "|           |\n" +
                            "|\n" +
                            "____________");
                    break;
                case 3:
                    System.out.println("|-----------|\n" +
                            "|           |\n" +
                            "|           O\n" +
                            "|          -|-\n" +
                            "|\n" +
                            "____________");
            }
            System.out.println("Guess this word: " + displayWord);
            System.out.println("So far you have guessed: " + guessedLetters);
            System.out.println("Would you like to guess a letter or word? l/w");
            String letterOrWord = input.nextLine();
            if (letterOrWord.equalsIgnoreCase("l")) {
                System.out.println("Enter a letter");
                char guessedLetter = input.nextLine().charAt(0);
                guessedLetters += guessedLetter + " ";
                if (wordToGuess.indexOf(guessedLetter) > -1) {
                    for (byte i = 0; i < wordToGuess.length(); i++) {
                        if (wordToGuess.charAt(i) == guessedLetter) {
                            displayWord = displayWord.substring(0, i)+ guessedLetter + displayWord.substring(i + 1);
                        }
                    }
                } else {
                    System.out.println("That letter isn't there.");
                    wrongGuesses +=1;
                }
            } else if (letterOrWord.equalsIgnoreCase("w")) {
                System.out.println("Guess the word");
                String guessedWord = input.nextLine();
                if (guessedWord.equalsIgnoreCase(wordToGuess)) {
                    displayWord = guessedWord;
                } else {
                    wrongGuesses += 1;
                    System.out.println("That isn't the word.");
                }
            }

            if (displayWord.equalsIgnoreCase(wordToGuess)) {
                didWin = true;
                System.out.println("YOU WIN!!!");
            }

            if (wrongGuesses == 4) {
                didLose = true;
                System.out.println("You lose. Good day.");
                System.out.println("|-----------|\n" +
                        "|           |\n" +
                        "|           O\n" +
                        "|          -|-\n" +
                        "|           ||\n" +
                        "____________");

            }

        }



    }

}
