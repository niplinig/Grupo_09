package match;

import game.Board;
import players.Player;
import signs.SignManager;
import turns.TurnManager;

public abstract class Match {

    protected Player player1;
    protected Player player2;
    protected SignManager signManager;
    protected Board board;
    protected boolean matchFinished;
    protected TurnManager turnManager;

    public Match() {
        board = new Board();
        signManager = new SignManager();
        turnManager = new TurnManager();
    }

    public void swapTurn() {
        if (getActivePlayer().equals(player1)) {
            player1.setActive(false);
            player2.setActive(true);
        } else {
            player1.setActive(true);
            player2.setActive(false);
        }
    }

    public void addTurn() {
        turnManager.addTurn(player1, board);
    }

    /*
    Getters
     */
    public Player getFirst() {
        return (player1.isFirst()) ? player1 : player2;
    }

    public Player getSecond() {
        return (player1.isFirst()) ? player2 : player1;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public String getSign() {
        return signManager.getSign();
    }

    public Player getActivePlayer() {
        return (player1.isActive()) ? player1 : player2;
    }

    public Player getDeactivePlayer() {
        return (player1.isActive()) ? player2 : player1;
    }

    public Board getBoard() {
        return board;
    }

    public Player getWinner() {
        if (player1.hasWin()) {
            return player1;
        }
        if (player2.hasWin()) {
            return player2;
        }
        return null;
    }

    public Player getOposingPlayer(Player player) {
        return (player1.equals(player)) ? player2 : player1;
    }

    public boolean hasMatchFinished() {
        return matchFinished;
    }

    /*
    Setters
     */
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void setSignManger(SignManager signManager) {
        this.signManager = signManager;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setWinner(Player player) {
        player.setWin(true);
    }

    public void setMatchFinished(boolean matchFinished) {
        this.matchFinished = matchFinished;
    }

}
