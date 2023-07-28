package com.example.javafxjdbc;

import com.example.javafxjdbc.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    private void onMenuItemSellerAction() {
        System.out.println("onMenuItemSellerAction");
    }

    @FXML
    private void onMenuItemDepartmentAction() {
        System.out.println("onMenuItemDepartmentAction");
    }

    @FXML
    private void onMenuItemAboutAction() {
        loadView("About.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    private synchronized void loadView(String absoluteName){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = fxmlLoader.load();

            Scene scene = MainApplication.getScene();
            VBox mainVBox = ((VBox) ((ScrollPane) scene.getRoot()).getContent());

            Node mainMenu = mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVBox.getChildren());


        } catch (IOException e){
            Alerts.showAlert("IO Exception", "Error Loading View", e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}