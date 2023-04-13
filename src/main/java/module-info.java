module preislerdev.txt2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens preislerdev.txt2 to javafx.fxml;
    exports preislerdev.txt2;
}