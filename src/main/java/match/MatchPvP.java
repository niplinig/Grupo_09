package match;

import players.HumanPlayer;

public class MatchPvP extends Match {

    public MatchPvP() {
        super();
        player1 = new HumanPlayer();
        player2 = new HumanPlayer();
    }

}
