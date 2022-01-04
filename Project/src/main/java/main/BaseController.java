package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class BaseController implements Initializable {

    @FXML
    private Button bttnPlay;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void PlayClicked(MouseEvent event) throws IOException {
        App.setRoot("chooseMode");
    }

}
