package main;

import match.MatchEvE;
import match.MatchPvE;
import match.MatchPvP;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ChooseModeController implements Initializable {

    @FXML
    private Button bttnPvP;
    @FXML
    private Button bttnPvE;
    @FXML
    private Button bttnEvE;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void bttnPvPClicked(MouseEvent event) throws IOException {
        App.match = new MatchPvP();
        App.setRoot("chooseWhoStarts");
    }

    @FXML
    private void bttnPvEClicked(MouseEvent event) throws IOException {
        App.match = new MatchPvE();
        App.setRoot("chooseWhoStarts");
    }

    @FXML
    private void bttnEvEClicked(MouseEvent event) throws IOException {
        App.match = new MatchEvE();
        App.setRoot("chooseWhoStarts");
    }

}
