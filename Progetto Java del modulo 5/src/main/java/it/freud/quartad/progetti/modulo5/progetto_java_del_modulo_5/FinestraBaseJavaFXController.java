package it.freud.quartad.progetti.modulo5.progetto_java_del_modulo_5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FinestraBaseJavaFXController {
    @FXML
    private Label label;

    @FXML
    protected void handleClick() {
        label.setText("Ciao Mondo!!!");
    }
}