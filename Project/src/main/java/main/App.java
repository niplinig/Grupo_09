package main;

import TDAs.Board;
import TDAs.Tree;
import match.Match;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import players.ComputerPlayer;
import players.HumanPlayer;
import players.Player;

public class App extends Application {

    private static Scene scene;
    public static Match match;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("base"));
        stage.setScene(scene);
        stage.show();
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
        Player deactivePlayer = new ComputerPlayer("me", "O");
        Player activePlayer = new HumanPlayer("me", "X");
        Board board1d = new Board();
        board1d.getTopLeft().placeMark(activePlayer);

        Tree<Board> tree = board1d.calculateMinOfGrantChilds(deactivePlayer, activePlayer);
        System.out.println(tree.getRootContent());
        for (Tree<Board> tree1 : tree.getChildren()) {
            System.out.println("");
            System.out.println("Father");
            System.out.println("Utility Father: " + tree1.getRootContent().getUtility());
            System.out.println(tree1.getRootContent());
            System.out.println("==== Inicio Nietos =====");
            for (Tree<Board> tree2 : tree1.getChildren()) {
                System.out.println("Utility: " + tree2.getRootContent().getUtility());
                System.out.println(tree2.getRootContent());
            }
            System.out.println("==== Fin Nietos =====");
        }
        System.out.println("");
        System.out.println("Escogido");
        System.out.println(board1d.calculateMaxOfChilds(deactivePlayer, activePlayer));
    }
}
