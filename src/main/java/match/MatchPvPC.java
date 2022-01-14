package match;

import game.Board;
import players.ComputerPlayer;
import players.HumanPlayer;
import players.Player;
import signs.SignManager;

public class MatchPvPC implements Match {

    private Player player1;
    private Player player2;
    private SignManager signManager;
    private Board board;
    private boolean matchFinished;

    public MatchPvPC() {
        board = new Board();
        player1 = new HumanPlayer();
        player2 = new ComputerPlayer();
        signManager = new SignManager();
    }

    @Override
    public void swapTurn() {
        if (getActivePlayer().equals(player1)) {
            player1.setActive(false);
            player2.setActive(true);
        } else {
            player1.setActive(true);
            player2.setActive(false);
        }
    }

    /*
    Getters
     */
    @Override
    public Player getFirst() {
        return (player1.isFirst()) ? player1 : player2;
    }

    @Override
    public Player getSecond() {
        return (player1.isFirst()) ? player2 : player1;
    }

    @Override
    public Player getPlayer1() {
        return player1;
    }

    @Override
    public Player getPlayer2() {
        return player2;
    }

    @Override
    public String getSign() {
        return signManager.getSign();
    }

    @Override
    public Player getActivePlayer() {
        return (player1.isActive()) ? player1 : player2;
    }

    @Override
    public Player getDeactivePlayer() {
        return (player1.isActive()) ? player2 : player1;
    }

    @Override
    public Board getBoard() {
        return board;
    }

    @Override
    public Player getWinner() {
        if (player1.hasWin()) {
            return player1;
        }
        if (player2.hasWin()) {
            return player2;
        }
        return null;
    }

    @Override
    public Player getOposingPlayer(Player player) {
        return (player1.equals(player)) ? player2 : player1;
    }

    @Override
    public boolean hasMatchFinished() {
        return matchFinished;
    }

    /*
    Setters
     */
    @Override
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    @Override
    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    @Override
    public void setSignManger(SignManager signManager) {
        this.signManager = signManager;
    }

    @Override
    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public void setWinner(Player player) {
        player.setWin(true);
    }

    @Override
    public void setMatchFinished(boolean matchFinished) {
        this.matchFinished = matchFinished;
    }

}
