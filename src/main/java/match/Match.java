package match;

import game.Board;
import players.Player;
import signs.SignManager;

public interface Match {

    public void swapTurn();

    /*
    Getters
     */
    public Player getFirst();

    public Player getSecond();

    public Player getPlayer1();

    public Player getPlayer2();

    public String getSign();

    public Player getActivePlayer();

    public Player getDeactivePlayer();

    public Board getBoard();

    public Player getWinner();

    public Player getOposingPlayer(Player player);

    public boolean hasMatchFinished();

    /*
    Setters
     */
    public void setPlayer1(Player player1);

    public void setPlayer2(Player player2);

    public void setSignManger(SignManager signManager);

    public void setBoard(Board board);

    public void setWinner(Player player);

    public void setMatchFinished(boolean matchFinished);

}
