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

        showBoard();

        getInput(playerTurn);

        System.out.println("You win!!!");

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
                showBoard();
                someoneWon = checkWinner("-X-");
                playerTurn = "Player 2";
            } else if (playerTurn.equalsIgnoreCase("player 2")) {
                if (board[rowIndex][columnIndex].equalsIgnoreCase("---")) {
                    board[rowIndex][columnIndex] = "-O-";
                } else {
                    System.out.println("That space is taken. Try again");
                    getInput(playerTurn);
                }
                showBoard();
                someoneWon = checkWinner("-O-");
                playerTurn = "Player 1";
            }
        } while (!someoneWon);

    }

    public static boolean checkWinner(String playerChar){
        boolean returnValue = false;
        for(int i = 1; i <= 3; i++){
            if(board[1][i].equalsIgnoreCase(playerChar) && board[2][i].equalsIgnoreCase(playerChar) && board[3][i].equalsIgnoreCase(playerChar)){
                returnValue = true;
            } else if(board[i][1].equalsIgnoreCase(playerChar) && board[i][2].equalsIgnoreCase(playerChar) && board[i][3].equalsIgnoreCase(playerChar)){
                returnValue = true;
            } else if(board[1][1].equalsIgnoreCase(playerChar) && board[2][2].equalsIgnoreCase(playerChar) && board[3][3].equalsIgnoreCase(playerChar)){
                returnValue = true;
            } else if(board[1][3].equalsIgnoreCase(playerChar) && board[2][2].equalsIgnoreCase(playerChar) && board[3][1].equalsIgnoreCase(playerChar)){
                returnValue = true;
            }
        }
        return returnValue;
    }

}
