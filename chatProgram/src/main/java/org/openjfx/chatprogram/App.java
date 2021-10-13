package org.openjfx.chatprogram;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;


import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
       // System.out.println(App.class.getResource("/org.openjfx.chatprogram/logIn" + ".fxml"));
        //
        Parent root = FXMLLoader.load(getClass().getResource("/org.openjfx.chatprogram/logIn.fxml"));
        //scene = new Scene(loadFXML("/org.openjfx.chatprogram/logIn"),800,600);
        scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml + ".fxml"));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    

    public static void main(String[] args) {
        launch();
        System.out.println("Hello world igen");
        ArrayList<User> users = new ArrayList();
        ArrayList<ChatRoom> chatrooms = new ArrayList();
        ArrayList<Message> messages = new ArrayList();
        ArrayList<ChatUser> chatUsers = new ArrayList();
        Crypt crypter = new Crypt();
        crypter.encrypt("hej");
    }

}