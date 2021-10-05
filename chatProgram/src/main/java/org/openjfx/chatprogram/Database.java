/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.chatprogram;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Database {
   private final String connectionString = "jdbc:sqlite:src/Database.db";
   
   public ArrayList<User> getAllUsers() throws SQLException, Exception {
        
        ArrayList<User> allUsers = new ArrayList<>();
        
        Connection conn = null;
        Class.forName("org.sqlite.JDBC");
        
        //Skab forbindelse til databasen...
        
        try {          
          conn = DriverManager.getConnection(connectionString);
        } 
        catch ( SQLException e ) {
          //Skrive fejlhåndtering her
          System.out.println("DB Error: " + e.getMessage());
        }
        
        //Hent alle personer fra databasen v.h.a. SQL
        try{ 
            Statement stat = conn.createStatement();   

            //Læser fra database alt data fra databasetabellen people.   
            ResultSet rs = stat.executeQuery("Username, Password");

            //Løber data igennem via en løkke og skriver det up.    
            while (rs.next()) {
                allUsers.add(new User(rs.getString("Username"), rs.getString("Password")));
            }
            rs.close();
        }
        catch ( SQLException e ) {
            //Skrive fejlhåndtering her
            System.out.println("DB Error: " + e.getMessage());
        }
        //Luk forbindelsen til databasen
        conn.close();
    
        return allUsers;
    }
   
   public ArrayList<ChatRoom> getAllchatRooms() throws SQLException, Exception {
        
        ArrayList<ChatRoom> allchatRooms = new ArrayList<>();
        
        Connection conn = null;
        Class.forName("org.sqlite.JDBC");
        
        //Skab forbindelse til databasen...
        
        try {          
          conn = DriverManager.getConnection(connectionString);
        } 
        catch ( SQLException e ) {
          //Skrive fejlhåndtering her
          System.out.println("DB Error: " + e.getMessage());
        }
        
        //Hent alle personer fra databasen v.h.a. SQL
        try{ 
            Statement stat = conn.createStatement();   

            //Læser fra database alt data fra databasetabellen people.   
            ResultSet rs = stat.executeQuery("ID_chatRoom, Navn");

            //Løber data igennem via en løkke og skriver det up.    
            while (rs.next()) {
                allchatRooms.add(new ChatRoom(rs.getInt("ID_chatRoom"), rs.getString("Navn")));
            }
            rs.close();
        }
        catch ( SQLException e ) {
            //Skrive fejlhåndtering her
            System.out.println("DB Error: " + e.getMessage());
        }
        //Luk forbindelsen til databasen
        conn.close();
    
        return allchatRooms;
    }
   
    public ArrayList<ChatUser> getchatUsers() throws SQLException, Exception {
        
        ArrayList<ChatUser> allchatUsers = new ArrayList<>();
        
        Connection conn = null;
        Class.forName("org.sqlite.JDBC");
        
        //Skab forbindelse til databasen...
        
        try {          
          conn = DriverManager.getConnection(connectionString);
        } 
        catch ( SQLException e ) {
          //Skrive fejlhåndtering her
          System.out.println("DB Error: " + e.getMessage());
        }
        
        //Hent alle personer fra databasen v.h.a. SQL
        try{ 
            Statement stat = conn.createStatement();   

            //Læser fra database alt data fra databasetabellen people.   
            ResultSet rs = stat.executeQuery("Users_name, C_ID");

            //Løber data igennem via en løkke og skriver det up.    
            while (rs.next()) {
                allchatUsers.add(new ChatUser(rs.getString("Users_name"), rs.getInt("C_ID")));
            }
            rs.close();
        }
        catch ( SQLException e ) {
            //Skrive fejlhåndtering her
            System.out.println("DB Error: " + e.getMessage());
        }
        //Luk forbindelsen til databasen
        conn.close();
    
        return allchatUsers;
    }
    
    public ArrayList<Message> getAllmessages() throws SQLException, Exception {
        
        ArrayList<Message> allmessages = new ArrayList<>();
        
        Connection conn = null;
        Class.forName("org.sqlite.JDBC");
        
        //Skab forbindelse til databasen...
        
        try {          
          conn = DriverManager.getConnection(connectionString);
        } 
        catch ( SQLException e ) {
          //Skrive fejlhåndtering her
          System.out.println("DB Error: " + e.getMessage());
        }
        
        //Hent alle personer fra databasen v.h.a. SQL
        try{ 
            Statement stat = conn.createStatement();   

            //Læser fra database alt data fra databasetabellen people.   
            ResultSet rs = stat.executeQuery("ID_message, message, sender_ID, C_ID");

            //Løber data igennem via en løkke og skriver det up.    
            while (rs.next()) {
                allmessages.add(new Message(rs.getInt("ID_message"), rs.getString("message"), rs.getString("sender_ID"), rs.getInt("C_ID")));
            }
            rs.close();
        }
        catch ( SQLException e ) {
            //Skrive fejlhåndtering her
            System.out.println("DB Error: " + e.getMessage());
        }
        //Luk forbindelsen til databasen
        conn.close();
    
        return allmessages;
    }
}
