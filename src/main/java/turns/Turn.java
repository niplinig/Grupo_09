package turns;

import game.Board;
import players.Player;

public class Turn {

    protected int turnNumber;
    protected String playerName;
    protected String playerSign;
    protected Board board;

    public Turn(int turnNumber, Player player, Board board) {
        this.turnNumber = turnNumber;
        this.playerName = player.getName();
        this.playerSign = player.getSign();
        this.board = board;
    }

}
