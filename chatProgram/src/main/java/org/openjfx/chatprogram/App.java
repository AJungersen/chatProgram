package org.openjfx.chatprogram;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    //public static User U = new User("","");
    public static Database db = new Database();
    public static  ArrayList<User> users = new ArrayList<User>();
    public static  ArrayList<ChatRoom> chatrooms = new ArrayList<ChatRoom>();
    public static  ArrayList<Message> messages = new ArrayList<Message>();
    public static  ArrayList<ChatUser> chatUsers = new ArrayList<ChatUser>();
    


    //@Override;
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
    
    

    public static void main(String[] args) throws Exception {
        launch();
        Database db = new Database();
        App.users = db.getAllUsers();
        App.chatrooms = db.getAllchatRooms();
        App.messages = db.getAllmessages();
        App.chatUsers = db.getAllchatUsers();
        System.out.println("Hello world igen");
    }

}