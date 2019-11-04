/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Controller;

import Model.Inventory;
import Model.Product;
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
import javafx.scene.control.Alert;
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
public class AddProductController implements Initializable {
    @FXML
    private Button cancelBtn;
    @FXML
    private Label addProdIDLabel;
    @FXML
    private Label addProdNameLabel;
    @FXML
    private Label addProdInventoryLabel;
    @FXML
    private Label addProdPriceLabel;
    @FXML
    private Label addProdMinLabel;
    @FXML
    private TextField addProductID;
    @FXML
    private TextField addProductName;
    @FXML
    private TextField addProductInventory;
    @FXML
    private TextField addProductPrice;
    @FXML
    private TextField addProductMin;
    @FXML
    private Label addProdMaxLabel;
    @FXML
    private TextField addProductMax;
    @FXML
    private Button addProductBtn;
    @FXML
    private Button delectBtn;
    @FXML
    private Button saveBtn;
    @FXML
    private TableView<?> addProductTableView;
    @FXML
    private TableColumn<?, ?> productID;
    @FXML
    private TableColumn<?, ?> productName;
    @FXML
    private TableColumn<?, ?> productPricePerUnit;
    @FXML
    private TableView<?> deleteProdTableView;
    @FXML
    private TableColumn<?, ?> productInventory;
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
      public boolean search(int id){
        for (Product product : Inventory.getAllProducts()) {
            if(product.getId() == id){
                return true;
            }
        }
        return false;
    }

    @FXML
    private void cancelHandler(ActionEvent event) throws IOException {
        
        Parent cancelProductParent = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
        Scene cancelPartScene = new Scene(cancelProductParent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(cancelPartScene);
        app_stage.show();
    }

    @FXML
    private void addHandler(ActionEvent event) throws IOException {
        
         int id = Integer.parseInt(addProductID.getText());
        String name = addProductName.getText();
        double price = Double.parseDouble(addProductPrice.getText());
        int inventory = Integer.parseInt(addProductInventory.getText());
        //String companyName = addCompanyName.getText();
        int min = Integer.parseInt(addProductMin.getText());
        int max = Integer.parseInt(addProductMax.getText());
        
            if(min > max || inventory > max || inventory < min){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Data Entry Error");
            alert.setContentText("Min is greater than Max and/or Inventory is not between Min and Max");
            alert.showAndWait();
            }else{
                
                //Product product = new Product();
                Parent cancelPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
                Scene cancelPartScene = new Scene(cancelPartParent);
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.hide();
                app_stage.setScene(cancelPartScene);
                app_stage.show(); 
            
            }
    }

    @FXML
    private void deleteHandler(ActionEvent event) {
    }

    @FXML
    private void saveHandler(ActionEvent event) {
    }
    
}
