package main;

import match.MatchPCvPC;
import match.MatchPvPC;
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
    private Button bttnPvPC;
    @FXML
    private Button bttnPCvPC;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void bttnPvPClicked(MouseEvent event) throws IOException {
        App.setMatch(new MatchPvP());
        App.setRoot("chooseWhoStarts");
    }

    @FXML
    private void bttnPvPCClicked(MouseEvent event) throws IOException {
        App.setMatch(new MatchPvPC());
        App.setRoot("chooseWhoStarts");
    }

    @FXML
    private void bttnPCvPCClicked(MouseEvent event) throws IOException {
        App.setMatch(new MatchPCvPC());
        App.setRoot("chooseWhoStarts");
    }

}
