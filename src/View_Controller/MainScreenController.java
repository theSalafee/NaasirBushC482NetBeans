/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author naasirbush
 */
public class MainScreenController implements Initializable {

    @FXML
    private Button searchBtn;
    @FXML
    private TextField searchPart;
    @FXML
    private Button deletePartBtn;
    @FXML
    private Button modifyPartBtn;
    @FXML
    private Button addPartBtn;
    @FXML
    private TableView<?> partsTable;
    @FXML
    private TableColumn<?, ?> partID;
    @FXML
    private TableColumn<?, ?> partName;
    @FXML
    private TableColumn<?, ?> partInventory;
    @FXML
    private TableColumn<?, ?> partCost;
    @FXML
    private Button deleteProduct;
    @FXML
    private Button modifyProductBtn;
    @FXML
    private Button addProductBtn;
    @FXML
    private Button productSearchBtn;
    @FXML
    private TextField searchProduct;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void searchHandler(ActionEvent event) {
    }

    @FXML
    private void deletePartHandler(ActionEvent event) {
    }

    @FXML
    private void modifyPartHandler(ActionEvent event) {
    }

    @FXML
    private void addPartHandler(ActionEvent event) {
//       
        
    }

    @FXML
    private void deleteProductHandler(ActionEvent event) {
    }

    @FXML
    private void modifyProductHandler(ActionEvent event) {
    }

    @FXML
    private void addProductHandler(ActionEvent event) {
    }
    
}
