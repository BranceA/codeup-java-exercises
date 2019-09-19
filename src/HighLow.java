import java.lang.Math;

public class HighLow {

    public static void main(String[] args) {

        System.out.println("I'm thinking of a number between 1 and 100. Guess what it is.");
        int rand = (int)(Math.random() * 99) + 1;
        playTheGame(rand);

    }

    public static void playTheGame(int rand){
        int playerNumber = MethodsExercises.getInteger(1, 100);
        if(playerNumber > rand){
            System.out.println("LOWER!");
            playTheGame(rand);
        }else if (playerNumber < rand){
            System.out.println("HIGHER!");
            playTheGame(rand);
        }else if (playerNumber == rand){
            System.out.println("GOOD GUESS!");
        }
    }

}
