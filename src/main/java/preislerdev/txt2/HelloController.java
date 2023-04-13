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
    private String styleI = "";
    private String styleB = "";
    private String styleU = "";

    @FXML
    protected void setSize() {
        styleSize = "-fx-font-size: " + sizeField.getText().trim() + ";";
        setStyle();
    }

    @FXML
    protected void setColor() {
        styleColor = "-fx-text-fill: " + colorPicker.getValue().toString().substring(2) + ";";
        setStyle();
    }

    @FXML
    protected void setI() {
        if (setTextI.isSelected()) {
            styleI = "-fx-font-style: italic;";
        } else {
            styleI = "";
        }
        setStyle();
    }

@FXML
    protected void setB() {
        if (setTextB.isSelected()) {
            styleB = "-fx-font-weight: bold;";
        } else {
            styleB = "";
        }
        setStyle();
    }

    @FXML
    protected void setU() {
        if (setTetU.isSelected()) {
            styleU = "-fx-underline: true;";
        } else {
            styleU = "";
        }
        setStyle();
    }


    protected void setStyle() {
        System.out.println(styleColor + styleSize + styleI + styleB + styleU);
        mainTextArea.setStyle(styleColor + styleSize + styleI + styleB + styleU);
    }
}
