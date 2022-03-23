package edu.wpi.teamname.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
  @FXML private Label outputLabel;
  @FXML private TextField nameField;

  @FXML
  void sayHello() {
    String name = nameField.getText();
    outputLabel.setText("Hello, " + name + "!");
  }
}
