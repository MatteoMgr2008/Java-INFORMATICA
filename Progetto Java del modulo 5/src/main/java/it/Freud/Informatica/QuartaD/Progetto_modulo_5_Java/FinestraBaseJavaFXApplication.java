package it.Freud.Informatica.QuartaD.Progetto_modulo_5_Java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FinestraBaseJavaFXApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FinestraBaseJavaFXApplication.class.getResource("/it/freud/Informatica/QuartaD/Progetto_modulo_5_Java/finestra-base-JavaFX.fxml"));
        Scene scene =  new Scene(fxmlLoader.load(),400,500);
        stage.setScene(scene);
        stage.setTitle("Finestra di base realizzata con JavaFX");
        stage.setResizable(true);
        stage.show();
    }
}