package main;

import game.Square;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import players.Player;

public class GameOverController implements Initializable {

    @FXML
    private Text txtWin;
    @FXML
    private Button bttnPlayAgain;
    @FXML
    private VBox vBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Player winner = App.getMatch().getWinner();
        if (winner != null) {
            txtWin.setText(winner.getInfo() + " Wins");
        } else {
            txtWin.setText("Draw");
        }
        vBox.getChildren().add(createGridPane());
    }

    public GridPane createGridPane() {
        GridPane grid = new GridPane();
        grid.setGridLinesVisible(true);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Square square = App.getMatch().getBoard().getSquare(i, j);
                square.setDisable(true);
                grid.add(square, j, i);
            }
        }
        return grid;
    }

    @FXML
    private void bttnPlayAgainClicked(MouseEvent event) throws IOException {
        App.setRoot("base");
    }

}
