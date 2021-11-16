/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.chatprogram;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;

/**
 * FXML Controller class
 *
 * @author Clara Maj
 */
public class SignUp2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    //@FXML 
    public void switchToLogIn() throws IOException {
        App.setRoot("logIn2");
    }
    
}
