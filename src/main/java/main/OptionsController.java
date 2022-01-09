package main;

import fashion.Theme;
import fashion.ThemeManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;

public class OptionsController implements Initializable {

    @FXML
    private ComboBox<Theme> cbThemes;
    @FXML
    private Label lblBack;
    @FXML
    private Button bttnApply;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ThemeManager themeManager = new ThemeManager();
        cbThemes.getItems().addAll(themeManager.getThemes());
    }

    @FXML
    private void backClicked(MouseEvent event) throws IOException {
        App.setRoot("base");
    }

    @FXML
    private void applyClicked(MouseEvent event) {
        App.getScene().getStylesheets().clear();
        String themeSelected = getClass().getResource("/styles/" + cbThemes.getValue().getUrl()).toExternalForm();
        App.getScene().getStylesheets().add(themeSelected);
    }


}
