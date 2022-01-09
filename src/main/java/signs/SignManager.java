package signs;

import java.util.Deque;
import java.util.LinkedList;

public class SignManager {

    LinkedList<String> signQueue = new LinkedList<>();

    public SignManager() {
        signQueue.add("X");
        signQueue.add("O");
    }

    public SignManager(String firstSign, String secondSign) {
        signQueue.add(firstSign);
        signQueue.add(secondSign);
    }

    public String getSign() {
        return signQueue.removeFirst();
    }

}
