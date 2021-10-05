package org.openjfx.chatprogram;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LogInController {

    @FXML
    private PasswordField password;
    @FXML
    private TextField username;
    @FXML
    private Label signUpBtn;
    @FXML
    private Label exitBtn;
    
    @FXML
    private void switchToMain() throws IOException {
        App.setRoot("main");
    }
    
    @FXML
    private void switchToSignUp (MouseEvent event) {
    }

    @FXML
    private void app_exit(MouseEvent event) {
        System.exit(0);
    }
    
    
}
