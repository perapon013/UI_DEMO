package adminDashboard;

import dbUtil.dbConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class dashBoardController implements Initializable {
    @FXML
    private Button btnLoad;
    @FXML
    private TableView<Employee> employeeTable;
    //add column from scenebuilder
    @FXML
    private TableColumn<Employee,String> idColumn;
    @FXML
    private TableColumn<Employee,String> nameColumn;
    @FXML
    private TableColumn<Employee,String> positionColumn;
    @FXML
    private TableColumn<Employee,String> emailColumn;
    @FXML
    private TableColumn<Employee,String> salaryColumn;

    private dbConnection db;
    private ObservableList<Employee> data;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.db = new dbConnection();


    }
    @FXML
    private void loadEmployeeData(ActionEvent event){
        try {
            Connection conn = dbConnection.getConnection();
            this.data = FXCollections.observableArrayList();
            String sql = "select * from employee";
            ResultSet rs = conn.createStatement().executeQuery(sql);

            while (rs.next()) {
                this.data.add(new Employee(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        this.idColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("ID"));
        this.nameColumn.setCellValueFactory(new PropertyValueFactory<Employee,String>("NAME"));
        this.positionColumn.setCellValueFactory(new PropertyValueFactory<Employee,String>("POSITION"));
        this.emailColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("EMAIL"));
        this.salaryColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("SALARY"));

        this.employeeTable.setItems(null);
        this.employeeTable.setItems(this.data);


    }


}//Class
