import util.Input;

public class TicTacToeBonus {

    public static String[][] board = {
            {"", "A", "B", "C"},
            {"1", "---", "---", "---"},
            {"2", "---", "---", "---"},
            {"3", "---", "---", "---"}
    };

    public static void main(String[] args) {

        String playerTurn = "Player 1";

        String winner;

        showBoard();

        getInput(playerTurn);

    }

    public static void showBoard(){
        System.out.format("%-3s %-3s %-3s %-3s\n", board[0][0], board[0][1], board[0][2], board[0][3]);
        System.out.format("%-3s %-3s %-3s %-3s\n", board[1][0], board[1][1], board[1][2], board[1][3]);
        System.out.format("%-3s %-3s %-3s %-3s\n", board[2][0], board[2][1], board[2][2], board[2][3]);
        System.out.format("%-3s %-3s %-3s %-3s\n", board[3][0], board[3][1], board[3][2], board[3][3]);
    }

    public static void getInput(String playerTurn){
        boolean someoneWon = false;
        Input thisInput = new Input();
        int turns = 0;
        do {
            int columnIndex = 0;
            System.out.format("Choose where to play %s by choosing a letter for column and a number for row", playerTurn);
            System.out.println("Choose a column. A/B/C");
            String columnSelection = thisInput.getString();
            if (columnSelection.equalsIgnoreCase("a")) {
                columnIndex = 1;
            } else if (columnSelection.equalsIgnoreCase("b")) {
                columnIndex = 2;
            } else if (columnSelection.equalsIgnoreCase("c")) {
                columnIndex = 3;
            } else {
                System.out.println("That isn't an option. Try again");
                getInput(playerTurn);
            }

            System.out.println("Choose a row. 1/2/3");
            int rowIndex = thisInput.getInt(1, 3);

            if (playerTurn.equalsIgnoreCase("player 1")) {
                if (board[rowIndex][columnIndex].equalsIgnoreCase("---")) {
                    board[rowIndex][columnIndex] = "-X-";
                } else {
                    System.out.println("That space is taken. Try again");
                    getInput(playerTurn);
                }
                someoneWon = checkWinner("-X-");
                showBoard();
                playerTurn = "Player 2";
            } else if (playerTurn.equalsIgnoreCase("player 2")) {
                if (board[rowIndex][columnIndex].equalsIgnoreCase("---")) {
                    board[rowIndex][columnIndex] = "-O-";
                } else {
                    System.out.println("That space is taken. Try again");
                    getInput(playerTurn);
                }
                someoneWon = checkWinner("-O-");
                showBoard();
                playerTurn = "Player 1";
            }
            turns ++;
        } while (!someoneWon && turns < 9);

        if(turns == 9){
            System.out.println("Cat game. Nobody wins.");
        } else if(playerTurn.equalsIgnoreCase("Player 2")){
            System.out.println("You win Player 1");
        } else if(playerTurn.equalsIgnoreCase("Player 1")){
            System.out.println("You win Player 2");
        }

    }

    public static boolean checkWinner(String playerChar){
        boolean returnValue = false;
        String newChar = new String();
        if(playerChar.equalsIgnoreCase("-X-")){
            newChar = "*X*";
        }else if(playerChar.equalsIgnoreCase("-O-")){
            newChar = "*O*";
        }

        for(int i = 1; i <= 3; i++){
            if(board[1][i].equalsIgnoreCase(playerChar) && board[2][i].equalsIgnoreCase(playerChar) && board[3][i].equalsIgnoreCase(playerChar)){
                board[1][i] = newChar;
                board[2][i] = newChar;
                board[3][i] = newChar;
                returnValue = true;
            } else if(board[i][1].equalsIgnoreCase(playerChar) && board[i][2].equalsIgnoreCase(playerChar) && board[i][3].equalsIgnoreCase(playerChar)){
                board[i][1] = newChar;
                board[i][2] = newChar;
                board[i][3] = newChar;
                returnValue = true;
            } else if(board[1][1].equalsIgnoreCase(playerChar) && board[2][2].equalsIgnoreCase(playerChar) && board[3][3].equalsIgnoreCase(playerChar)){
                board[1][1] = newChar;
                board[2][2] = newChar;
                board[3][3] = newChar;
                returnValue = true;
            } else if(board[1][3].equalsIgnoreCase(playerChar) && board[2][2].equalsIgnoreCase(playerChar) && board[3][1].equalsIgnoreCase(playerChar)){
                board[1][3] = newChar;
                board[2][2] = newChar;
                board[3][1] = newChar;
                returnValue = true;
            }
        }
        return returnValue;
    }

}
