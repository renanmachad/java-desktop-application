package com.cartao;

import javafx.beans.NamedArg;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField user;

    @FXML
    private Label statusLabel;
    @FXML
    private PasswordField passwordField;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected  void close(){

    }

    @FXML
    protected  void submit(){
        String username= user.getText();
        String password= passwordField.getText();

        if(username.isBlank()|| username.isEmpty()||password.isEmpty()|| password.isEmpty()){
            statusLabel.setText("Login inválido");
            statusLabel.setTextFill(Color.RED);
        } else {

            statusLabel.setText("Sucesso!");
            statusLabel.setTextFill(Color.GREEN);
        }
    }


}