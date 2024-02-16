package org.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
<<<<<<< HEAD
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
=======
>>>>>>> refs/remotes/origin/master

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
<<<<<<< HEAD

    @FXML
    private void handleCreateButtonAction() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup.fxml"));
            Parent parent = fxmlLoader.load();
            Stage stage = new Stage();
            Image icon = new Image("icon.png");
            stage.getIcons().add(icon);
            stage.setTitle("Signup");
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
=======
>>>>>>> refs/remotes/origin/master
}