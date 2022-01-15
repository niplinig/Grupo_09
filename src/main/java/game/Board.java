package game;

import TDAs.Tree;
import game.Square;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import players.Player;

public class Board {

    protected int utility;
    protected Square[] squares;

    public Board() {
        squares = new Square[9];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square();
        }
    }

    public boolean isBoardFull() {
        for (Square square : squares) {
            if (square.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    protected boolean isRow1Fill(Player player) {
        boolean topLeftIsFill = squares[0].equalsByText(player);
        boolean topIsFill = squares[1].equalsByText(player);
        boolean topRightIsFill = squares[2].equalsByText(player);
        return topLeftIsFill && topIsFill && topRightIsFill;
    }

    protected boolean isRow2Fill(Player player) {
        boolean leftIsFill = squares[3].equalsByText(player);
        boolean centerIsFill = squares[4].equalsByText(player);
        boolean rightIsFill = squares[5].equalsByText(player);
        return leftIsFill && centerIsFill && rightIsFill;
    }

    protected boolean isRow3Fill(Player player) {
        boolean bottomLeftIsFill = squares[6].equalsByText(player);
        boolean bottomIsFill = squares[7].equalsByText(player);
        boolean bottomRightIsFill = squares[8].equalsByText(player);
        return bottomLeftIsFill && bottomIsFill && bottomRightIsFill;
    }

    protected boolean isColumn1Fill(Player player) {
        boolean topLeftIsFill = squares[0].equalsByText(player);
        boolean leftIsFill = squares[3].equalsByText(player);
        boolean bottomLeftIsFill = squares[6].equalsByText(player);
        return topLeftIsFill && leftIsFill && bottomLeftIsFill;
    }

    protected boolean isColumn2Fill(Player player) {
        boolean topIsFill = squares[1].equalsByText(player);
        boolean centerIsFill = squares[4].equalsByText(player);
        boolean bottomIsFill = squares[7].equalsByText(player);
        return topIsFill && centerIsFill && bottomIsFill;
    }

    protected boolean isColumn3Fill(Player player) {
        boolean topRightIsFill = squares[2].equalsByText(player);
        boolean rightIsFill = squares[5].equalsByText(player);
        boolean bottomRightIsFill = squares[8].equalsByText(player);
        return topRightIsFill && rightIsFill && bottomRightIsFill;
    }

    protected boolean isDiagonal1Fill(Player player) {
        boolean topLeftIsFill = squares[0].equalsByText(player);
        boolean centerIsFill = squares[4].equalsByText(player);
        boolean bottomRightIsFill = squares[8].equalsByText(player);
        return topLeftIsFill && centerIsFill && bottomRightIsFill;
    }

    protected boolean isDiagonal2Fill(Player player) {
        boolean topRightIsFill = squares[2].equalsByText(player);
        boolean centerIsFill = squares[4].equalsByText(player);
        boolean bottomLeftIsFill = squares[6].equalsByText(player);
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

    protected boolean isRow1BlankOrFill(Player player) {
        boolean topLeftIsBlankOrFill = squares[0].isBlankOrFill(player);
        boolean topIsBlankOrFill = squares[1].isBlankOrFill(player);
        boolean topRightIsBlankOrFill = squares[2].isBlankOrFill(player);
        return topLeftIsBlankOrFill && topIsBlankOrFill && topRightIsBlankOrFill;
    }

    protected boolean isRow2BlankOrFill(Player player) {
        boolean leftIsBlankOrFill = squares[3].isBlankOrFill(player);
        boolean centerIsBlankOrFill = squares[4].isBlankOrFill(player);
        boolean rightIsBlankOrFill = squares[5].isBlankOrFill(player);
        return leftIsBlankOrFill && centerIsBlankOrFill && rightIsBlankOrFill;
    }

    protected boolean isRow3BlankOrFill(Player player) {
        boolean bottomLeftIsBlankOrFill = squares[6].isBlankOrFill(player);
        boolean bottomIsBlankOrFill = squares[7].isBlankOrFill(player);
        boolean bottomRightIsBlankOrFill = squares[8].isBlankOrFill(player);
        return bottomLeftIsBlankOrFill && bottomIsBlankOrFill && bottomRightIsBlankOrFill;
    }

    protected boolean isColumn1BlankOrFill(Player player) {
        boolean topLeftIsBlankOrFill = squares[0].isBlankOrFill(player);
        boolean leftIsBlankOrFill = squares[3].isBlankOrFill(player);
        boolean bottomLeftIsBlankOrFill = squares[6].isBlankOrFill(player);
        return topLeftIsBlankOrFill && leftIsBlankOrFill && bottomLeftIsBlankOrFill;
    }

    protected boolean isColumn2BlankOrFill(Player player) {
        boolean topIsBlankOrFill = squares[1].isBlankOrFill(player);
        boolean centerIsBlankOrFill = squares[4].isBlankOrFill(player);
        boolean bottomIsBlankOrFill = squares[7].isBlankOrFill(player);
        return topIsBlankOrFill && centerIsBlankOrFill && bottomIsBlankOrFill;
    }

    protected boolean isColumn3BlankOrFill(Player player) {
        boolean topRightIsBlankOrFill = squares[2].isBlankOrFill(player);
        boolean rightIsBlankOrFill = squares[5].isBlankOrFill(player);
        boolean bottomRightIsBlankOrFill = squares[8].isBlankOrFill(player);
        return topRightIsBlankOrFill && rightIsBlankOrFill && bottomRightIsBlankOrFill;
    }

    protected boolean isDiagonal1BlankOrFill(Player player) {
        boolean topLeftIsBlankOrFill = squares[0].isBlankOrFill(player);
        boolean centerIsBlankOrFill = squares[4].isBlankOrFill(player);
        boolean bottomRightIsBlankOrFill = squares[8].isBlankOrFill(player);
        return topLeftIsBlankOrFill && centerIsBlankOrFill && bottomRightIsBlankOrFill;
    }

    protected boolean isDiagonal2BlankOrFill(Player player) {
        boolean topRightIsBlankOrFill = squares[2].isBlankOrFill(player);
        boolean centerIsBlankOrFill = squares[4].isBlankOrFill(player);
        boolean bottomLeftIsBlankOrFill = squares[6].isBlankOrFill(player);
        return topRightIsBlankOrFill && centerIsBlankOrFill && bottomLeftIsBlankOrFill;
    }

    protected int getRowsUtility(Player player) {
        int result = 0;
        if (isRow1BlankOrFill(player)) {
            result++;
        }
        if (isRow2BlankOrFill(player)) {
            result++;
        }
        if (isRow3BlankOrFill(player)) {
            result++;
        }
        return result;
    }

    protected int getColumnsUtility(Player player) {
        int result = 0;
        if (isColumn1BlankOrFill(player)) {
            result++;
        }
        if (isColumn2BlankOrFill(player)) {
            result++;
        }
        if (isColumn3BlankOrFill(player)) {
            result++;
        }
        return result;
    }

    protected int getDiagonalsUtility(Player player) {
        int result = 0;
        if (isDiagonal1BlankOrFill(player)) {
            result++;
        }
        if (isDiagonal2BlankOrFill(player)) {
            result++;
        }
        return result;
    }

    public int getPlayerUtility(Player player) {
        return getRowsUtility(player) + getColumnsUtility(player) + getDiagonalsUtility(player);
    }

    public void calculateBoardUtility(Player activePlayer, Player deactivePlayer) {
        int result = getPlayerUtility(activePlayer) - getPlayerUtility(deactivePlayer);
        utility = result;
    }

    /*
    Paso 1
     */
    public Tree<Board> getTreeOfWhiteSpaces() {
        Tree<Board> tree = new Tree<>();
        tree.setRoot(this.getCopy());
        for (int i = 0; i < squares.length; i++) {
            Board board = tree.getRootContent().getCopy();
            Square square = squares[i];
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
        for (int i = 0; i < squares.length; i++) {
            board1D.squares[i].setText(squares[i].getText());
            if (squares[i].isDisable()) {
                board1D.squares[i].setDisable(true);
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
        for (Tree<Board> child : firstStates.getChildren()) {
            Board board = child.getRootContent();
            for (int i = 0; i < board.squares.length; i++) {
                if (board.squares[position].isEmpty()) {
                    board.squares[position].placeMark(activePlayer);
                    position++;
                    break;
                }
                position++;
            }
        }
        return firstStates;
    }

    /*
    Paso 2
     */
    public Tree<Board> generateSecondStates(Player activePlayer, Player deactivePlayer) {
        Tree<Board> secondStates = generateStates(activePlayer);
        if (secondStates == null) {
            return null;
        }
        for (Tree<Board> child : secondStates.getChildren()) {
            Tree<Board> tree = child.getRootContent().generateStates(deactivePlayer);
            if (tree == null) {
                return secondStates;
            }
            for (Tree<Board> grantChild : tree.getChildren()) {
                grantChild.getRootContent().calculateBoardUtility(activePlayer, deactivePlayer);
                child.addChild(grantChild);
            }
        }
        return secondStates;
    }

    /*
    Paso 3
     */
    public Tree<Board> calculateMinOfGrantChilds(Player activePlayer, Player deactivePlayer) {
        Tree<Board> treeWithMins = generateSecondStates(activePlayer, deactivePlayer);
        if (treeWithMins == null) {
            return null;
        }
        if (treeWithMins.getChildren().size() == 1) {
            return treeWithMins;
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

    /*
    Paso 4
     */
    public Board calculateMaxOfChilds(Player activePlayer, Player deactivePlayer) {
        Tree<Board> treeWithMins = calculateMinOfGrantChilds(activePlayer, deactivePlayer);
        LinkedList<Board> sameUtilityBoards = new LinkedList<>();
        if (treeWithMins == null) {
            return null;
        }
        if (treeWithMins.getChildren().size() == 1) {
            return treeWithMins.getChildren().getLast().getRootContent();
        }
        Board maxBoard = treeWithMins.getChildren().getFirst().getRootContent();
        for (Tree<Board> child : treeWithMins.getChildren()) {
            Board childBoard = child.getRootContent();
            if (childBoard.utility > maxBoard.utility) {
                maxBoard = childBoard;
            } else if (childBoard.utility == maxBoard.utility) {
                sameUtilityBoards.add(childBoard);
            }
        }
        sameUtilityBoards.add(maxBoard);
        Random random = new Random();
        int rdnumber = random.nextInt(sameUtilityBoards.size());
        return sameUtilityBoards.get(rdnumber);
    }

    public Square getMinimaxSquare(Player activePlayer, Player deactivePlayer) {
        Board maxBoard = calculateMaxOfChilds(activePlayer, deactivePlayer);
        if (maxBoard == null) {
            return null;
        }
        for (int i = 0; i < maxBoard.squares.length; i++) {
            Square maxBoardSquare = maxBoard.squares[i];
            Square actualBoardSquare = squares[i];
            if (!maxBoardSquare.equalsByText(actualBoardSquare) && !actualBoardSquare.isDisable()) {
                return actualBoardSquare;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String boardInText = "";
        String topLeftText = squares[0].getText();
        String topText = squares[1].getText();
        String topRightText = squares[2].getText();
        String leftText = squares[3].getText();
        String centerText = squares[4].getText();
        String rightText = squares[5].getText();
        String bottomLeftText = squares[6].getText();
        String bottomText = squares[7].getText();
        String bottomRightText = squares[8].getText();

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
    private Comparator<Board> getComparator() {
        Comparator<Board> comparator = (Board b1, Board b2) -> {
            return b1.getUtility() - b2.getUtility();
        };
        return comparator;
    }

    public int getUtility() {
        return utility;
    }

    public Square getSquare(int x, int y) {
        if (x == 0 && y < 3) {
            return squares[y];
        }
        if (x == 1 && y < 3) {
            return squares[y + 3];
        }
        if (x == 2 && y < 3) {
            return squares[y + 6];
        }
        return null;
    }

    public Square getEmptySquare() {
        for (Square square : squares) {
            if (square.isEmpty()) {
                return square;
            }
        }
        return null;
    }

    /*
    Setters
     */
    public void setUtility(int utility) {
        this.utility = utility;
    }

}
