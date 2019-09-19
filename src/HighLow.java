import java.lang.Math;

public class HighLow {

    public static void main(String[] args) {

        System.out.println("I'm thinking of a number between 1 and 100. Guess what it is. You have 10 guesses.");
        int rand = (int)(Math.random() * 99) + 1;
        playTheGame(rand, 0);

    }

    public static void playTheGame(int rand, int guesses){
        int playerNumber = MethodsExercises.getInteger(1, 100);
        guesses += 1;
        if(guesses == 10){
            System.out.println("YOU LOSE!!");
        }else if(playerNumber > rand){
            System.out.println("LOWER!");
            System.out.println("You have guessed " + guesses + " times");
            playTheGame(rand, guesses);
        }else if (playerNumber < rand){
            System.out.println("HIGHER!");
            System.out.println("You have guessed " + guesses + " times");
            playTheGame(rand, guesses);
        }else if (playerNumber == rand){
            System.out.println("GOOD GUESS!");
            System.out.println("You have guessed " + guesses + " times");
        }
    }

}
