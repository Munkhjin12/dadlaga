package com.example;

// 1. Added the missing imports

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent; 
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException; 

public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/com/example/mainScene.fxml"));
        
        try {
            
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            
            stage.setTitle("Hello JavaFX!");
            stage.setScene(scene);
            stage.show();
            
            
            Controller controller = fxmlLoader.getController();
            
        } catch (IOException e) {
            System.err.println("Failed to load the FXML file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}