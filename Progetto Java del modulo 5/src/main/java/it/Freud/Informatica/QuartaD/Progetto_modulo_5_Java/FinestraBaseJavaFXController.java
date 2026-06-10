package it.Freud.Informatica.QuartaD.Progetto_modulo_5_Java;

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