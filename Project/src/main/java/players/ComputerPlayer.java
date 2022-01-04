package players;

import TDAs.Board;
import game.Square;
import java.io.IOException;
import main.App;
import match.Match;

public class ComputerPlayer implements Player {

    private String name, sign;
    private boolean first, active, win = false;

    public ComputerPlayer() {
        this(null, null);
    }

    public ComputerPlayer(String name) {
        this(name, null);
    }

    public ComputerPlayer(String name, String sign) {
        this.name = name;
        this.sign = sign;
    }

    @Override
    public boolean equals(Player player) {
        return this.getSign().equals(player.getSign());
    }

    @Override
    public void makeMove() {
        Board board = App.match.getBoard();
        Square square = board.getMinimaxSquare(this, App.match.getOposingPlayer(this));
        if (square != null) {
            square.placeMark(this);
            square.checkWin(board, this);
            square.checkDraw(board);
            App.match.swapTurn();
        }
    }

    /*
    Getters
     */
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSign() {
        return sign;
    }

    @Override
    public boolean isFirst() {
        return first;
    }

    @Override
    public String getInfo() {
        return name + ": " + sign;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public boolean hasWin() {
        return win;
    }

    /*
    Setters
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public void setFirst(boolean first) {
        this.first = first;
    }

    @Override
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void setWin(boolean win) {
        this.win = win;
    }

}
