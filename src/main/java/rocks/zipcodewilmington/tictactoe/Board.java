package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;

    public Board(Character[][] user) {
        board = user;
    }


    public Boolean isInFavorOfX() {
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            return true;
        } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            return true;
        } else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            return true;
        } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            return true;
        } else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            return true;
        } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            return true;
        } else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            return true;
        } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            return true;
        } else {
            return false;
        }

    }


    public Boolean isInFavorOfO() {

        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
            return true;
        } else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
            return true;
        } else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
            return true;
        } else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
            return true;
        } else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
            return true;
        } else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            return true;
        } else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            return true;
        } else if (board[0][2] == 'O' && board[1][1] == 'O' && board[1][0] == 'O') {
            return true;
        } else {
            return false;
        }


    }

    public Boolean isTie() {
        if (isInFavorOfX() || isInFavorOfO()) {
            return false;
        } else {
            return true;
        }
    }

    public String getWinner() {

        String answer = "";

        if (isInFavorOfX()) {
            answer = "X";
        } else if (isInFavorOfO()) {
            answer = "O";
        }
        return answer;
    }


}
