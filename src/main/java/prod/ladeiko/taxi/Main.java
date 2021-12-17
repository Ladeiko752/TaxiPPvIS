package prod.ladeiko.taxi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import prod.ladeiko.taxi.View.AuthorizationUI;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        AuthorizationUI authorizationUI = new AuthorizationUI();

        Group group = new Group(authorizationUI.getFlowPane());
        Scene scene = new Scene(group);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}