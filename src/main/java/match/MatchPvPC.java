package match;

import players.ComputerPlayer;
import players.HumanPlayer;

public class MatchPvPC extends Match {

    public MatchPvPC() {
        super();
        player1 = new HumanPlayer();
        player2 = new ComputerPlayer();
    }

}
