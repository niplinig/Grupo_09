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
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;

public class OptionsController implements Initializable {

    @FXML
    private ComboBox<Theme> cbThemes;
    @FXML
    private Button bttnMain;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ThemeManager themeManager = new ThemeManager();
        cbThemes.getItems().addAll(themeManager.getThemes());
    }

    @FXML
    private void cbThemesSelected(ContextMenuEvent event) {
        String themeSelected = getClass().getResource("/style/" + cbThemes.getValue().getUrl()).toExternalForm();
        App.getScene().getStylesheets().add(themeSelected);
    }

    @FXML
    private void mainClicked(MouseEvent event) throws IOException {
        App.setRoot("base");
    }

}
