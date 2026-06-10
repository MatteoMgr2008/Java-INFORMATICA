module it.Freud.Informatica.QuartaD.Progetto_modulo_5_Java {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens it.Freud.Informatica.QuartaD.Progetto_modulo_5_Java to javafx.fxml;
    exports it.Freud.Informatica.QuartaD.Progetto_modulo_5_Java;
}
