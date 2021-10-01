module org.openjfx.chatprogram {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx.chatprogram to javafx.fxml;
    exports org.openjfx.chatprogram;
}
