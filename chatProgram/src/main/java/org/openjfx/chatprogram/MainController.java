
package org.openjfx.chatprogram;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.TextFlow;

public class MainController {
@FXML TextField chatBar;
@FXML TextField secondaryTextField;
@FXML TextFlow chatDisplay;
String chatBarInput; 


   
@FXML
public void textFieldEnter(KeyEvent e){
    //if (chatBar.getText() != null){
    if (e.getCode().equals(KeyCode.ENTER)){
       // chatBarInput = secondaryTextfield.getText();
        //System.out.println(chatBarInput);
       System.out.println(secondaryTextField.getText());

    } 
    else {

    }

} 



}