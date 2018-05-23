package adminDashboard;

import dbUtil.dbConnection;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class dashBoardController {
    @FXML
    private Button btnLoad;
    @FXML
    private TableView<Employee> employeeTable;
    //add column from scenebuilder
    @FXML
    private TableColumn<Employee,Integer> idColumn;
    @FXML
    private TableColumn<Employee,String> nameColumn;
    @FXML
    private TableColumn<Employee,String> positionColumn;
    @FXML
    private TableColumn<Employee,String> emailColumn;
    @FXML
    private TableColumn<Employee,Double> salaryColumn;

    private dbConnection db;
    private ObservableList<Employee> data;



}//Class
