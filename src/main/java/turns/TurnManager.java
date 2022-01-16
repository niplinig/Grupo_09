package turns;

import game.Board;
import java.util.LinkedList;
import players.Player;

public class TurnManager {

    protected int totalTurns;
    protected LinkedList<Turn> turns;

    public TurnManager() {
        turns = new LinkedList<>();
    }

    public void addTurn(Player player, Board board) {
        Turn newTurn = new Turn(turns.size(), player, board);
        turns.add(newTurn);
    }

}
