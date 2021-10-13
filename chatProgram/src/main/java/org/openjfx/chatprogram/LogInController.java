package org.openjfx.chatprogram;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;

public class LogInController implements Initializable {

    @FXML
    private PasswordField password;
    @FXML
    private TextField username;
    @FXML
    private Label signUpBtn;
    @FXML
    private Label exitBtn;
    
    @Override 
    public void initialize(URL url, ResourceBundle rb){
        //TODO
    }
        
    @FXML
    private void switchToSignUp (MouseEvent event) throws IOException  {
        App.setRoot("/org.openjfx.chatprogram/signUp");
    }

    @FXML
    private void app_exit(MouseEvent event) {
        System.exit(0);
    }
    
    @FXML
    public void login(ActionEvent event) throws IOException, Exception {
        //if(database login && .getText == true){
        //App.setRoote("Main");
        //}
    }
    
    
}
