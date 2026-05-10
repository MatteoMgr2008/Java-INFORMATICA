package it.freud.quartad.progetti.modulo5.progetto_java_del_modulo_5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FinestraBaseJavaFXApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FinestraBaseJavaFXApplication.class.getResource("finestra-base-JavaFX.fxml"));
        Scene scene =  new Scene(fxmlLoader.load(),400,500);
        stage.setScene(scene);
        stage.setTitle("Finestra di base realizzata con JavaFX");
        stage.setResizable(true);
        stage.show();
    }
}