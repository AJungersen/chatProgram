module org.openjfx.chatprogram {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.base;
    requires java.sql;

    opens org.openjfx.chatprogram to javafx.fxml;
    exports org.openjfx.chatprogram;
}
