/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author naasirbush
 */
public class ModifyProductController implements Initializable {

    @FXML
    private TextField addPartPrice;
    @FXML
    private Button cancelBtn;
    @FXML
    private Label modifyProductIdLabel;
    @FXML
    private Label modifyProdNameLabel;
    @FXML
    private Label modifyProdInventoryLabel;
    @FXML
    private Label modifyProdPriceLabel;
    @FXML
    private Label modifyProdMinLabel;
    @FXML
    private TextField modifyProductID;
    @FXML
    private TextField modifyProductName;
    @FXML
    private TextField modifyProductInventory;
    @FXML
    private TextField modifyProductMin;
    @FXML
    private Label modifyProdMaxLabel;
    @FXML
    private TextField modifyProductMax;
    @FXML
    private TextField productSearch;
    @FXML
    private Label searchProductLabel;
    @FXML
    private TableView<?> addProdTableView;
    @FXML
    private TableColumn<?, ?> productID;
    @FXML
    private TableColumn<?, ?> productName;
    @FXML
    private TableColumn<?, ?> productInventory;
    @FXML
    private TableColumn<?, ?> productPricePerUnit;
    @FXML
    private TableView<?> deleteProdTableView;
    @FXML
    private Button addProductBtn;
    @FXML
    private Button deleteBtn;
    @FXML
    private Button saveBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    } 
    
    @FXML
    private void cancelProductHandler(ActionEvent event) throws IOException {
        
        Parent cancelProductParent = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
        Scene cancelProductScene = new Scene(cancelProductParent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(cancelProductScene);
        app_stage.show();
        
    }

    @FXML
    private void addProductHandler(ActionEvent event) {
    }

    @FXML
    private void deleteProductHandler(ActionEvent event) {
    }

    @FXML
    private void saveProductHandler(ActionEvent event) {
    }
    
    
    
}
