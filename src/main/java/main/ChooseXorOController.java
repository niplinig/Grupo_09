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
        App.match.setSignManger(new SignManager());
        txtTitle.setText("Choose " + App.match.getFirst().getName() + " sign");
        bttn1.setText(App.match.getSign());
        bttn2.setText(App.match.getSign());
    }

    @FXML
    private void bttn1Clicked(MouseEvent event) throws IOException {
        App.match.getFirst().setSign(bttn1.getText());
        App.match.getSecond().setSign(bttn2.getText());
        App.setRoot("game");
    }

    @FXML
    private void bttn2Clicked(MouseEvent event) throws IOException {
        App.match.getFirst().setSign(bttn2.getText());
        App.match.getSecond().setSign(bttn1.getText());
        App.setRoot("game");
    }

    @FXML
    private void backClicked(MouseEvent event) throws IOException {
        App.setRoot("chooseWhoStarts");
    }

}
