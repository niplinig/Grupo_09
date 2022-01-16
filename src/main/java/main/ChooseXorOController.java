package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import match.MatchPvPC;
import signs.SignManager;

public class ChooseXorOController implements Initializable {

    @FXML
    private Button bttn1;
    @FXML
    private Button bttn2;
    @FXML
    private Label lblBack;
    @FXML
    private Text txtTitle;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        App.getMatch().setSignManger(new SignManager());

        if (App.getMatch() instanceof MatchPvPC) {
            txtTitle.setText("Choose " + App.getMatch().getPlayer1().getName() + " sign");
            bttn1.setText(App.getMatch().getSign());
            bttn2.setText(App.getMatch().getSign());
        } else {
            txtTitle.setText("Choose " + App.getMatch().getFirst().getName() + " sign");
            bttn1.setText(App.getMatch().getSign());
            bttn2.setText(App.getMatch().getSign());
        }
    }

    @FXML
    private void bttn1Clicked(MouseEvent event) throws IOException {
        if (App.getMatch() instanceof MatchPvPC) {
            App.getMatch().getPlayer1().setSign(bttn1.getText());
            App.getMatch().getPlayer2().setSign(bttn2.getText());
            App.setRoot("game");
        } else {
            App.getMatch().getFirst().setSign(bttn1.getText());
            App.getMatch().getSecond().setSign(bttn2.getText());
            App.setRoot("game");
        }
    }

    @FXML
    private void bttn2Clicked(MouseEvent event) throws IOException {
        if (App.getMatch() instanceof MatchPvPC) {
            App.getMatch().getPlayer1().setSign(bttn2.getText());
            App.getMatch().getPlayer2().setSign(bttn1.getText());
            App.setRoot("game");
        } else {
            App.getMatch().getFirst().setSign(bttn2.getText());
            App.getMatch().getSecond().setSign(bttn1.getText());
            App.setRoot("game");
        }
    }

    @FXML
    private void backClicked(MouseEvent event) throws IOException {
        App.setRoot("chooseWhoStarts");
    }

}
