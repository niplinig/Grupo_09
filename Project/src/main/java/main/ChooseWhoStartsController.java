package main;

import match.MatchPCvPC;
import match.MatchPvPC;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ChooseWhoStartsController implements Initializable {

    @FXML
    private Label lblBack;
    @FXML
    private Button bttnPlayer1;
    @FXML
    private Button bttnPlayer2;

    private final boolean isMatchEvE = App.match instanceof MatchPCvPC;
    private final boolean isMatchPvE = App.match instanceof MatchPvPC;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (isMatchEvE) {
            bttnPlayer1.setText("PC 1");
            bttnPlayer2.setText("PC 2");
        } else if (isMatchPvE) {
            bttnPlayer1.setText("Player");
            bttnPlayer2.setText("PC");
        } else {
            bttnPlayer1.setText("Player 1");
            bttnPlayer2.setText("Player 2");
        }
    }

    @FXML
    private void backClicked(MouseEvent event) throws IOException {
        App.setRoot("chooseMode");
    }

    @FXML
    private void bttnPlayer1Clicked(MouseEvent event) throws IOException {
        App.match.getPlayer1().setName(bttnPlayer1.getText());
        App.match.getPlayer2().setName(bttnPlayer2.getText());
        App.match.getPlayer1().setFirst(true);
        App.match.getPlayer2().setFirst(false);
        App.setRoot("chooseXorO");
    }

    @FXML
    private void bttnPlayer2Clicked(MouseEvent event) throws IOException {
        App.match.getPlayer1().setName(bttnPlayer1.getText());
        App.match.getPlayer2().setName(bttnPlayer2.getText());
        App.match.getPlayer2().setFirst(true);
        App.match.getPlayer1().setFirst(false);
        App.setRoot("chooseXorO");
    }

}
