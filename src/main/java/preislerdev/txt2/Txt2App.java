package preislerdev.txt2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Txt2App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Screen.setStage(stage);
        Screen.startFromLoader("txt2.fxml", "style.css");
    }

    public static void main(String[] args) {
        launch();
    }
}