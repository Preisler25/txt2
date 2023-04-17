package preislerdev.txt2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Screen {
    private static Stage stage;
    private static Scene scene;

    public static void setStage(Stage stage) {
        Screen.stage = stage;
    }
    public static void startFromLoader(String filename, String stylename) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Txt2App.class.getResource(filename));
        scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(Screen.class.getResource(stylename).toExternalForm());
        stage.setTitle("TXT2");
        stage.getIcons().add(new javafx.scene.image.Image(Objects.requireNonNull(Screen.class.getResourceAsStream("icon.png"))));
        Screen.setScene(scene);
    }

    public static void setScene(Scene scene) {
        stage.setScene(scene);
        stage.show();
    }
}
