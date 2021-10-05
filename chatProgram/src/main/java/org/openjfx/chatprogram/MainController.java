package org.openjfx.chatprogram;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.TextFlow;

public class MainController {
@FXML TextField chatBar;
@FXML TextFlow chatDisplay;

public void keyPressed(KeyEvent e) throws IOException{
    input();
}

@FXML
private void input() throws IOException{

String chatBarInput = chatBar.getText();
System.out.println(chatBarInput);
}
    
}