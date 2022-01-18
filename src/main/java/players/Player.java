package players;

import game.Board;
import game.Square;
import main.App;

public abstract class Player {

    private String name, sign;
    private boolean first, active, winner = false;

    public Player() {
        this(null, null);
    }

    public Player(String name) {
        this(name, null);
    }

    public Player(String name, String sign) {
        this.name = name;
        this.sign = sign;
    }

    public boolean equals(Player player) {
        return this.getSign().equals(player.getSign());
    }

    public abstract void makeMove();

    /*
    Getters
     */
    public String getName() {
        return name;
    }

    public String getSign() {
        return sign;
    }

    public boolean isFirst() {
        return first;
    }

    public String getInfo() {
        return name + ": " + sign;
    }

    public boolean isActive() {
        return active;
    }

    public boolean hasWin() {
        return winner;
    }

    /*
    Setters
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setWin(boolean win) {
        this.winner = win;
    }
}
