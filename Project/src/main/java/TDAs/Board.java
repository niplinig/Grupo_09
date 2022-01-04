package TDAs;

import game.Square;
import players.Player;

public class Board {

    protected int utility;
    protected Square[] array;
    protected Square topLeft;
    protected Square top;
    protected Square topRight;
    protected Square left;
    protected Square center;
    protected Square right;
    protected Square bottomLeft;
    protected Square bottom;
    protected Square bottomRight;

    public Board() {
        array = new Square[9];
        topLeft = new Square();
        top = new Square();
        topRight = new Square();
        left = new Square();
        center = new Square();
        right = new Square();
        bottomLeft = new Square();
        bottom = new Square();
        bottomRight = new Square();

        array[0] = topLeft;
        array[1] = top;
        array[2] = topRight;
        array[3] = left;
        array[4] = center;
        array[5] = right;
        array[6] = bottomLeft;
        array[7] = bottom;
        array[8] = bottomRight;
    }

    public boolean isBoardFull() {
        for (Square square : array) {
            if (square.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean isRow1Fill(Player player) {
        String playerSign = player.getSign();

        boolean topLeftIsFill = topLeft.getText().equals(playerSign);
        boolean topIsFill = top.getText().equals(playerSign);
        boolean topRightIsFill = topRight.getText().equals(playerSign);

        return topLeftIsFill && topIsFill && topRightIsFill;
    }

    public boolean isRow2Fill(Player player) {
        String playerSign = player.getSign();

        boolean leftIsFill = left.getText().equals(playerSign);
        boolean centerIsFill = center.getText().equals(playerSign);
        boolean rightIsFill = right.getText().equals(playerSign);

        return leftIsFill && centerIsFill && rightIsFill;
    }

    public boolean isRow3Fill(Player player) {
        String playerSign = player.getSign();

        boolean bottomLeftIsFill = bottomLeft.getText().equals(playerSign);
        boolean bottomIsFill = bottom.getText().equals(playerSign);
        boolean bottomRightIsFill = bottomRight.getText().equals(playerSign);

        return bottomLeftIsFill && bottomIsFill && bottomRightIsFill;
    }

    public boolean isColumn1Fill(Player player) {
        String playerSign = player.getSign();

        boolean topLeftIsFill = topLeft.getText().equals(playerSign);
        boolean leftIsFill = left.getText().equals(playerSign);
        boolean bottomLeftIsFill = bottomLeft.getText().equals(playerSign);

        return topLeftIsFill && leftIsFill && bottomLeftIsFill;
    }

    public boolean isColumn2Fill(Player player) {
        String playerSign = player.getSign();

        boolean topIsFill = top.getText().equals(playerSign);
        boolean centerIsFill = center.getText().equals(playerSign);
        boolean bottomIsFill = bottom.getText().equals(playerSign);

        return topIsFill && centerIsFill && bottomIsFill;
    }

    public boolean isColumn3Fill(Player player) {
        String playerSign = player.getSign();

        boolean topRightIsFill = topRight.getText().equals(playerSign);
        boolean rightIsFill = right.getText().equals(playerSign);
        boolean bottomRightIsFill = bottomRight.getText().equals(playerSign);

        return topRightIsFill && rightIsFill && bottomRightIsFill;
    }

    public boolean isDiagonal1Fill(Player player) {
        String playerSign = player.getSign();

        boolean topLeftIsFill = topLeft.getText().equals(playerSign);
        boolean centerIsFill = center.getText().equals(playerSign);
        boolean bottomRightIsFill = bottomRight.getText().equals(playerSign);

        return topLeftIsFill && centerIsFill && bottomRightIsFill;
    }

    public boolean isDiagonal2Fill(Player player) {
        String playerSign = player.getSign();

        boolean topRightIsFill = topRight.getText().equals(playerSign);
        boolean centerIsFill = center.getText().equals(playerSign);
        boolean bottomLeftIsFill = bottomLeft.getText().equals(playerSign);

        return topRightIsFill && centerIsFill && bottomLeftIsFill;
    }

    public boolean hasPlayerWin(Player player) {
        if (isRow1Fill(player) || isRow2Fill(player) || isRow3Fill(player)) {
            return true;
        }
        if (isColumn1Fill(player) || isColumn2Fill(player) || isColumn3Fill(player)) {
            return true;
        }
        if (isDiagonal1Fill(player) || isDiagonal2Fill(player)) {
            return true;
        }
        return false;
    }

    public boolean isRow1BlankOrFill(Player player) {
        String playerSign = player.getSign();

        boolean topLeftIsBlankOrFill = topLeft.getText().isBlank() || topLeft.getText().equals(playerSign);
        boolean topIsBlankOrFill = top.getText().isBlank() || top.getText().equals(playerSign);
        boolean topRightIsBlankOrFill = topRight.getText().isBlank() || topRight.getText().equals(playerSign);

        return topLeftIsBlankOrFill && topIsBlankOrFill && topRightIsBlankOrFill;
    }

    public boolean isRow2BlankOrFill(Player player) {
        String playerSign = player.getSign();

        boolean leftIsBlankOrFill = left.getText().isBlank() || left.getText().equals(playerSign);
        boolean centerIsBlankOrFill = center.getText().isBlank() || center.getText().equals(playerSign);
        boolean rightIsBlankOrFill = right.getText().isBlank() || right.getText().equals(playerSign);

        return leftIsBlankOrFill && centerIsBlankOrFill && rightIsBlankOrFill;
    }

    public boolean isRow3BlankOrFill(Player player) {
        String playerSign = player.getSign();

        boolean bottomLeftIsBlankOrFill = bottomLeft.getText().isBlank() || bottomLeft.getText().equals(playerSign);
        boolean bottomIsBlankOrFill = bottom.getText().isBlank() || bottom.getText().equals(playerSign);
        boolean bottomRightIsBlankOrFill = bottomRight.getText().isBlank() || bottomRight.getText().equals(playerSign);

        return bottomLeftIsBlankOrFill && bottomIsBlankOrFill && bottomRightIsBlankOrFill;
    }

    public boolean isColumn1BlankOrFill(Player player) {
        String playerSign = player.getSign();

        boolean topLeftIsBlankOrFill = topLeft.getText().isBlank() || topLeft.getText().equals(playerSign);
        boolean leftIsBlankOrFill = left.getText().isBlank() || left.getText().equals(playerSign);
        boolean bottomLeftIsBlankOrFill = bottomLeft.getText().isBlank() || bottomLeft.getText().equals(playerSign);

        return topLeftIsBlankOrFill && leftIsBlankOrFill && bottomLeftIsBlankOrFill;
    }

    public boolean isColumn2BlankOrFill(Player player) {
        String playerSign = player.getSign();

        boolean topIsBlankOrFill = top.getText().isBlank() || top.getText().equals(playerSign);
        boolean centerIsBlankOrFill = center.getText().isBlank() || center.getText().equals(playerSign);
        boolean bottomIsBlankOrFill = bottom.getText().isBlank() || bottom.getText().equals(playerSign);

        return topIsBlankOrFill && centerIsBlankOrFill && bottomIsBlankOrFill;
    }

    public boolean isColumn3BlankOrFill(Player player) {
        String playerSign = player.getSign();

        boolean topRightIsBlankOrFill = topRight.getText().isBlank() || topRight.getText().equals(playerSign);
        boolean rightIsBlankOrFill = right.getText().isBlank() || right.getText().equals(playerSign);
        boolean bottomRightIsBlankOrFill = bottomRight.getText().isBlank() || bottomRight.getText().equals(playerSign);

        return topRightIsBlankOrFill && rightIsBlankOrFill && bottomRightIsBlankOrFill;
    }

    public boolean isDiagonal1BlankOrFill(Player player) {
        String playerSign = player.getSign();

        boolean topLeftIsBlankOrFill = topLeft.getText().isBlank() || topLeft.getText().equals(playerSign);
        boolean centerIsBlankOrFill = center.getText().isBlank() || center.getText().equals(playerSign);
        boolean bottomRightIsBlankOrFill = bottomRight.getText().isBlank() || bottomRight.getText().equals(playerSign);

        return topLeftIsBlankOrFill && centerIsBlankOrFill && bottomRightIsBlankOrFill;
    }

    public boolean isDiagonal2BlankOrFill(Player player) {
        String playerSign = player.getSign();

        boolean topRightIsBlankOrFill = topRight.getText().isBlank() || topRight.getText().equals(playerSign);
        boolean centerIsBlankOrFill = center.getText().isBlank() || center.getText().equals(playerSign);
        boolean bottomLeftIsBlankOrFill = bottomLeft.getText().isBlank() || bottomLeft.getText().equals(playerSign);

        return topRightIsBlankOrFill && centerIsBlankOrFill && bottomLeftIsBlankOrFill;
    }

    public int getPlayerUtility(Player player) {
        int playerUtility = 0;
        if (isRow1BlankOrFill(player)) {
            playerUtility++;
        }
        if (isRow2BlankOrFill(player)) {
            playerUtility++;
        }
        if (isRow3BlankOrFill(player)) {
            playerUtility++;
        }
        if (isColumn1BlankOrFill(player)) {
            playerUtility++;
        }
        if (isColumn2BlankOrFill(player)) {
            playerUtility++;
        }
        if (isColumn3BlankOrFill(player)) {
            playerUtility++;
        }
        if (isDiagonal1BlankOrFill(player)) {
            playerUtility++;
        }
        if (isDiagonal2BlankOrFill(player)) {
            playerUtility++;
        }
        return playerUtility;
    }

    public void calculateBoardUtility(Player activePlayer, Player deactivePlayer) {
        int result = getPlayerUtility(activePlayer) - getPlayerUtility(deactivePlayer);
//        utility = Math.abs(result);
        utility = result;
    }

    /*
    Paso 1
     */
    public Tree<Board> getTreeOfWhiteSpaces() {
        Tree<Board> tree = new Tree<>();
        tree.setRoot(this.getCopy());
        for (int i = 0; i < array.length; i++) {
            Board board = tree.getRootContent().getCopy();
            Square square = array[i];
            if (square.isEmpty()) {
                tree.addChild(board);
            }
        }
        if (tree.getChildren().isEmpty()) {
            return null;
        }
        return tree;
    }

    public Board getCopy() {
        Board board1D = new Board();
        for (int i = 0; i < array.length; i++) {
            board1D.array[i].setText(array[i].getText());
            if (array[i].isDisable()) {
                board1D.array[i].setDisable(true);
            }
        }
        return board1D;
    }

    public Tree<Board> generateStates(Player activePlayer) {
        Tree<Board> firstStates = getTreeOfWhiteSpaces();
        if (firstStates == null) {
            return null;
        }
        int position = 0;
        for (Tree<Board> tree : firstStates.getChildren()) {
            Board board = tree.getRootContent();
            for (int i = 0; i < board.array.length; i++) {
                if (board.array[position].isEmpty()) {
                    board.array[position].placeMark(activePlayer);
                    position++;
                    break;
                }
                position++;
            }
        }
        return firstStates;
    }

    public Tree<Board> generateSecondStates(Player activePlayer, Player deactivePlayer) {
        Tree<Board> secondStates = generateStates(activePlayer);
        if (secondStates == null) {
            return null;
        }
        for (Tree<Board> child : secondStates.getChildren()) {
            Tree<Board> tree = child.getRootContent().generateStates(deactivePlayer);
            for (Tree<Board> grantChild : tree.getChildren()) {
                grantChild.getRootContent().calculateBoardUtility(activePlayer, deactivePlayer);
                child.addChild(grantChild);
            }
        }
        return secondStates;
    }

    public Tree<Board> calculateMinOfGrantChilds(Player activePlayer, Player deactivePlayer) {
        Tree<Board> treeWithMins = generateSecondStates(activePlayer, deactivePlayer);
        if (treeWithMins == null) {
            return null;
        }
        for (Tree<Board> child : treeWithMins.getChildren()) {
            Board minBoard = child.getChildren().getFirst().getRootContent();
            for (Tree<Board> grantChild : child.getChildren()) {
                Board grantChildBoard = grantChild.getRootContent();
                if (grantChildBoard.utility < minBoard.utility) {
                    minBoard = grantChildBoard;
                }
            }
            child.getRootContent().setUtility(minBoard.utility);
        }
        return treeWithMins;
    }

    public Board calculateMaxOfChilds(Player activePlayer, Player deactivePlayer) {
        Tree<Board> treeWithMins = calculateMinOfGrantChilds(activePlayer, deactivePlayer);
        if (treeWithMins == null) {
            return null;
        }
        Board maxBoard = treeWithMins.getChildren().getFirst().getRootContent();
        for (Tree<Board> child : treeWithMins.getChildren()) {
            Board childBoard = child.getRootContent();
            if (childBoard.utility > maxBoard.utility) {
                maxBoard = childBoard;
            }
        }
        return maxBoard;
    }

    public Square getMinimaxSquare(Player activePlayer, Player deactivePlayer) {
        Board maxBoard = calculateMaxOfChilds(activePlayer, deactivePlayer);
        if (maxBoard == null) {
            return null;
        }
        for (int i = 0; i < maxBoard.array.length; i++) {
            Square maxBoardSquare = maxBoard.array[i];
            Square actualBoardSquare = array[i];
            if (!maxBoardSquare.equalsByText(actualBoardSquare) && !actualBoardSquare.isDisable()) {
                return actualBoardSquare;
            }
        }
        return null;
    }

    /*
    Paso 2
     */
    @Override
    public String toString() {
        String boardInText = "";
        String topLeftText = topLeft.getText();
        String topText = top.getText();
        String topRightText = topRight.getText();
        String leftText = left.getText();
        String centerText = center.getText();
        String rightText = right.getText();
        String bottomLeftText = bottomLeft.getText();
        String bottomText = bottom.getText();
        String bottomRightText = bottomRight.getText();

        if (topLeftText.isBlank()) {
            topLeftText = " ";
        }
        if (topText.isBlank()) {
            topText = " ";
        }
        if (topRightText.isBlank()) {
            topRightText = " ";
        }
        if (leftText.isBlank()) {
            leftText = " ";
        }
        if (centerText.isBlank()) {
            centerText = " ";
        }
        if (rightText.isBlank()) {
            rightText = " ";
        }
        if (bottomLeftText.isBlank()) {
            bottomLeftText = " ";
        }
        if (bottomText.isBlank()) {
            bottomText = " ";
        }
        if (bottomRightText.isBlank()) {
            bottomRightText = " ";
        }
        boardInText += topLeftText + "|";
        boardInText += topText + "|";
        boardInText += topRightText + "\n";
        boardInText += leftText + "|";
        boardInText += centerText + "|";
        boardInText += rightText + "\n";
        boardInText += bottomLeftText + "|";
        boardInText += bottomText + "|";
        boardInText += bottomRightText + "\n";
        return boardInText;
    }

    /*
    Getters
     */
    public int getUtility() {
        return utility;
    }

    public Square getTopLeft() {
        return topLeft;
    }

    public Square getTop() {
        return top;
    }

    public Square getTopRight() {
        return topRight;
    }

    public Square getLeft() {
        return left;
    }

    public Square getCenter() {
        return center;
    }

    public Square getRight() {
        return right;
    }

    public Square getBottomLeft() {
        return bottomLeft;
    }

    public Square getBottom() {
        return bottom;
    }

    public Square getBottomRight() {
        return bottomRight;
    }

    public Square getSquare(int x, int y) {
        if (x == 0) {
            if (y == 0) {
                return topLeft;
            }
            if (y == 1) {
                return top;
            }
            if (y == 2) {
                return topRight;
            }
        }
        if (x == 1) {
            if (y == 0) {
                return left;
            }
            if (y == 1) {
                return center;
            }
            if (y == 2) {
                return right;
            }
        }
        if (x == 2) {
            if (y == 0) {
                return bottomLeft;
            }
            if (y == 1) {
                return bottom;
            }
        }
        return bottomRight;
    }

    /*
    Setters
     */
    public void setUtility(int utility) {
        this.utility = utility;
    }

}
