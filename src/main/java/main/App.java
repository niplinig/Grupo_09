package main;

import fashion.ThemeManager;
import match.Match;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

    private static Scene scene;
    private static Match match;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("base"));
        stage.setScene(scene);
        stage.show();
        String themeSelected = (getClass().getResource("/styles/default.css").toExternalForm());
        scene.getStylesheets().add(themeSelected);
//        stage.setOnCloseRequest(event -> {
//            System.out.println("Stage is closing");
//        });
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    /*
    Getters
     */
    public static Scene getScene() {
        return scene;
    }

    public static Match getMatch() {
        return match;
    }

    /*
    Setters
     */
    public static void setScene(Scene scene) {
        App.scene = scene;
    }

    public static void setMatch(Match match) {
        App.match = match;
    }

}
