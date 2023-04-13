package preislerdev.txt2;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField sizeField;

    @FXML
    private Button setSizeBtn;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private RadioButton setTextI;

    @FXML
    private RadioButton setTextB;

    @FXML
    private RadioButton setTetU;

    @FXML
    private TextArea mainTextArea;

    private String styleColor = "";
    private String styleSize = "";

    @FXML
    protected void setSize() {
        styleSize = "-fx-font-size: " + sizeField.getText().trim() + ";";
        setStyle();
    }

    @FXML
    protected void setColor() {
        styleColor = "-fx-text-fill: #" + colorPicker.getValue().toString().substring(2) + ";";
        setStyle();
    }

    @FXML
    protected void setI() {
        if (setTextI.isSelected()) {
            mainTextArea.getStyleClass().add("italic");
        } else {
            mainTextArea.getStyleClass().remove("italic");
        }
        setStyle();
    }

@FXML
    protected void setB() {
        if (setTextB.isSelected()) {
            mainTextArea.getStyleClass().add("bold");
        } else {
            mainTextArea.getStyleClass().remove("bold");
        }
        setStyle();
    }

    @FXML
    protected void setU() {
        if (setTetU.isSelected()) {
            mainTextArea.getStyleClass().add("underLine");
        } else {
            mainTextArea.getStyleClass().remove("underLine");
        }
        setStyle();
    }


    protected void setStyle() {
        mainTextArea.setStyle(styleColor + styleSize);
        System.out.println(mainTextArea.getStyleClass());
    }
}
