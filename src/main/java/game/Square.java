package game;

import java.io.IOException;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import main.App;
import match.MatchPCvPC;
import players.ComputerPlayer;
import players.Player;

public class Square extends Label {

    public Square() {
        formatSquare();
        this.addEventHandler(MouseEvent.MOUSE_CLICKED, onClick());
        this.addEventHandler(MouseEvent.MOUSE_ENTERED, onEntered());
        this.addEventHandler(MouseEvent.MOUSE_EXITED, onExited());
    }

    public boolean isPCvPCMatch() {
        return App.match instanceof MatchPCvPC;
    }

    public void formatSquare() {
        this.setAlignment(Pos.CENTER);
        this.setContentDisplay(ContentDisplay.CENTER);
        this.setMaxSize(100.0, 100.0);
        this.setMinSize(100.0, 100.0);
        this.setPrefSize(100.0, 100.0);
        this.setTextAlignment(TextAlignment.CENTER);
        this.setFont(new Font(50.0));
    }

    public void placeMark(Player activePlayer) {
        this.setText(activePlayer.getSign());
        this.setOpacity(1);
        this.setDisable(true);
    }

    public void checkWin(Board board, Player activePlayer) {
        if (board.hasPlayerWin(activePlayer)) {
            App.match.setWinner(activePlayer);
            try {
                App.setRoot("gameOver");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void checkDraw(Board board) {
        if (board.isBoardFull()) {
            try {
                App.setRoot("gameOver");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void click() {
        Board board = App.match.getBoard();
        Player activePlayer = App.match.getActivePlayer();
        placeMark(activePlayer);
        checkWin(board, activePlayer);
        checkDraw(board);
        App.match.swapTurn();
        ifIsComputerNextTurn();
    }

    public void ifIsComputerNextTurn() {
        if (App.match.getActivePlayer() instanceof ComputerPlayer) {
            App.match.getActivePlayer().makeMove();
        }
    }

    public EventHandler<MouseEvent> onClick() {
        return (MouseEvent t) -> {
            if (!this.isDisable() && !isPCvPCMatch()) {
                click();
            }
        };
    }

    public EventHandler<MouseEvent> onEntered() {
        return (MouseEvent t) -> {
            if (!this.isDisable() && !isPCvPCMatch()) {
                this.setText(App.match.getActivePlayer().getSign());
                this.setOpacity(0.5);
            }
        };
    }

    public EventHandler<MouseEvent> onExited() {
        return (MouseEvent t) -> {
            if (!this.isDisable() && !isPCvPCMatch()) {
                this.setText("");
                this.setOpacity(1);
            }
        };
    }

    public boolean isEmpty() {
        return !this.isDisable() && this.getText().isBlank();
    }

    public boolean equalsByText(Square square) {
        return this.getText().equals(square.getText());
    }

    public boolean equalsByText(Player player) {
        return this.getText().equals(player.getSign());
    }

    public boolean isBlankOrFill(Player player) {
        return this.getText().isBlank() || this.equalsByText(player);
    }

}
