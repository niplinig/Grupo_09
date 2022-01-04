package players;

public class HumanPlayer implements Player {

    private String name, sign;
    private boolean first, active, win = false;

    public HumanPlayer() {
        this(null, null);
    }

    public HumanPlayer(String name) {
        this(name, null);
    }

    public HumanPlayer(String name, String sign) {
        this.name = name;
        this.sign = sign;
    }

    @Override
    public boolean equals(Player player) {
        return this.getSign().equals(player.getSign());
    }

    @Override
    public boolean hasWin() {
        return win;
    }

    @Override
    public void makeMove() {
    }

    /*
    Getters
     */
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSign() {
        return sign;
    }

    @Override
    public boolean isFirst() {
        return first;
    }

    @Override
    public String getInfo() {
        return name + ": " + sign;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    /*
    Setters
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public void setFirst(boolean first) {
        this.first = first;
    }

    @Override
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void setWin(boolean win) {
        this.win = win;
    }

}
