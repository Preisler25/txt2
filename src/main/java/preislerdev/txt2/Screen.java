package preislerdev.txt2;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Screen {
    private Stage stage;
    private Scene scene;

    public Screen(Stage stage) {
        this.stage = stage;
    }
    public void setScene(Scene scene) {
        stage.setScene(scene);
        stage.show();
    }
}
