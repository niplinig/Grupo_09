package main;

import game.Square;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import match.MatchPCvPC;
import players.ComputerPlayer;

public class GameController implements Initializable {

    @FXML
    private Text player1Sign;
    @FXML
    private Text player2Sign;
    @FXML
    private VBox vBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set the text in the screen
        player1Sign.setText(App.match.getPlayer1().getInfo());
        player2Sign.setText(App.match.getPlayer2().getInfo());

        // Show the board
        vBox.getChildren().add(createGridPane());

        // Set the first player as active
        App.match.getFirst().setActive(true);

        if (App.match.getFirst() instanceof ComputerPlayer) {
            App.match.getFirst().makeMove();
        }

        if (App.match instanceof MatchPCvPC) {
            Thread computerAI = createComputerAI();
            computerAI.setDaemon(true);
            computerAI.start();
        }

    }

    public Thread createComputerAI() {
        Thread computerAI = new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                    Platform.runLater(() -> {
                        App.match.getActivePlayer().makeMove();
                    });
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        return computerAI;
    }

    public GridPane createGridPane() {
        GridPane grid = new GridPane();
        grid.setGridLinesVisible(true);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Square square = App.match.getBoard().getSquare(i, j);
                grid.add(square, j, i);
            }
        }
        return grid;
    }

}
