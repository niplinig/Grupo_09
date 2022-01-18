package players;

import game.Board;
import game.Square;
import main.App;

public class ComputerPlayer extends Player {
    @Override
    public void makeMove() {
        Board board = App.getMatch().getBoard();
        Square square = board.getMinimaxSquare(this, App.getMatch().getOposingPlayer(this));
        if (square != null) {
            square.placeMark(this);
            square.checkWin(board, this);
            square.checkDraw(board);
            App.getMatch().swapTurn();
        }
    }
}
