package players;

import java.util.LinkedList;

public interface Player {

    public boolean equals(Player player);

    public void makeMove();

    /*
    Getters
     */
    public String getName();

    public String getSign();

    public boolean isFirst();

    public String getInfo();

    public boolean isActive();

    public boolean hasWin();

    /*
    Setters
     */
    public void setName(String name);

    public void setSign(String sign);

    public void setFirst(boolean first);

    public void setActive(boolean active);

    public void setWin(boolean win);
}
