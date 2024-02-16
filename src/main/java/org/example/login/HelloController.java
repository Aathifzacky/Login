package org.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label lbllogin;

    @FXML
    private TextField txtusername;

    @FXML
    private TextField txtpassword;

    public void Login(ActionEvent event) {
        if (txtusername.getText().equals("User") && txtpassword.getText().equals("Pass")) {
            lbllogin.setText("Login Success");
        } else {
            lbllogin.setText("Login Failed");
        }
    }
}