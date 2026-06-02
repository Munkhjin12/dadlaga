package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtName; 

    @FXML
    private Label lblResult;   
    @FXML
    void onButtonClick(ActionEvent event) {
        try {
        
            String input = txtName.getText();
            
            
            int number = Integer.parseInt(input);
            
            
            int lastDigit = Math.abs(number % 10);
            
        
            lblResult.setText("Сүүлийн цифр: " + lastDigit);
            
        

        } catch (NumberFormatException e) {
            
            lblResult.setText("Алдаа: Тоо оруулна уу!");
            lblResult.setStyle("-fx-text-fill: red;");
        }
    }
}