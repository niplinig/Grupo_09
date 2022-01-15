package match;

import players.ComputerPlayer;

public class MatchPCvPC extends Match {

    public MatchPCvPC() {
        super();
        player1 = new ComputerPlayer();
        player2 = new ComputerPlayer();
    }

}
