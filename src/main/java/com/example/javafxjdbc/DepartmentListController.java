package com.example.javafxjdbc;

import com.example.javafxjdbc.model.entities.Department;
import com.example.javafxjdbc.model.services.DepartmentService;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class DepartmentListController implements Initializable {

    private DepartmentService service;

    @FXML
    private TableView<Department> tableViewDepartment;

    @FXML
    private TableColumn<Department, Integer> tableColumnId;

    @FXML
    private TableColumn<Department, String> tableColumnName;

    @FXML
    private Button btNew;

    private ObservableList<Department> obsList;

    @FXML
    public void onBtNewAction() {
        System.out.println("onBtNewAction");
    }

    public void setDepartmentService(DepartmentService service) {
        this.service = service;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeNodes();
    }

    private void initializeNodes() {
        tableColumnId.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getId()).asObject());
        tableColumnName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));

        Stage stage = (Stage) MainApplication.getScene().getWindow();
        tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
    }

    public void updateTableView() {
        if (service == null) {
            throw new IllegalStateException("Service was null");
        }
        List<Department> list = service.findAll();
        tableViewDepartment.getItems().setAll(list);
    }
}
