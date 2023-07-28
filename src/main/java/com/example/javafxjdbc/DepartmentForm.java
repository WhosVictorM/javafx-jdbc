package com.example.javafxjdbc;

import com.example.javafxjdbc.model.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DepartmentForm implements Initializable {

    @FXML
    private TextField textFieldId;

    @FXML
    private TextField textFieldName;

    @FXML
    private Button buttonSave;

    @FXML
    private Button buttonCancel;

    @FXML
    private Label labelError;

    @FXML
    private void onButtonSaveAction(){
        System.out.println("onButtonSaveAction");
    }
    @FXML
    private void onButtonCancelAction(){
        System.out.println("onButtonCancelAction");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeNodes();
    }

    private void initializeNodes(){
        Constraints.setTextFieldInteger(textFieldId);
        Constraints.setTextFieldMaxLength(textFieldName,30);
    }
}
