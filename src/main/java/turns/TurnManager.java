package turns;

import java.util.LinkedList;

public class TurnManager {

    protected int totalTurns;
    protected LinkedList<Turn> turns;

    public TurnManager() {
        turns = new LinkedList<>();
    }

}
