/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Controller;
import naasirbushc482.NaasirBushC482;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
///

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
    private Button deleteProduct;
    @FXML
    private Button modifyProductBtn;
    @FXML
    private Button addProductBtn;
    @FXML
    private Button productSearchBtn;
    @FXML
    private TextField searchProduct;
    private Object FXMLoader;
    @FXML
    private Button exitBtn;
    @FXML
    private TableColumn<?, ?> partPricePerUnit;
    @FXML
    private TableView<?> productsTable;
    @FXML
    private TableColumn<?, ?> productID;
    @FXML
    private TableColumn<?, ?> productName;
    @FXML
    private TableColumn<?, ?> productInventory;
    @FXML
    private TableColumn<?, ?> productPricePerUnit;

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
    private void modifyPartHandler(ActionEvent event) throws IOException {
        
        Parent modifyPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/ModifyPart.fxml"));
        Scene modifyPartScene = new Scene(modifyPartParent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(modifyPartScene);
        app_stage.show();
    }

    @FXML
    private void addPartHandler(ActionEvent event) throws IOException {
        
        Parent addPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/AddPart.fxml"));
        Scene addPartScene = new Scene(addPartParent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(addPartScene);
        app_stage.show();
        
    }

    @FXML
    private void deleteProductHandler(ActionEvent event) {
    }

    @FXML
    private void modifyProductHandler(ActionEvent event) throws IOException {
        
        Parent modifyProductParent = FXMLLoader.load(getClass().getResource("/View_Controller/ModifyProduct.fxml"));
        Scene modifyProductScene = new Scene(modifyProductParent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(modifyProductScene);
        app_stage.show();
    }    
    

    @FXML
    private void addProductHandler(ActionEvent event) throws IOException {
        
        Parent addProductParent = FXMLLoader.load(getClass().getResource("/View_Controller/AddProduct.fxml"));
        Scene addProductScene = new Scene(addProductParent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(addProductScene);
        app_stage.show();
    }

    @FXML
    private void exitHandler(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Quit?");
        alert.setHeaderText("Are you sure you want to quit?");
        alert.setContentText("Data will not be saved.");

//        Optional<ButtonType> result = alert.showAndWait();
//        if (result.get() == ButtonType.OK){
//            // ... user chose OK
//            mainApp.primaryStage.close();
//            NaasirBushC482.primaryStage.close();
//    }
//    
}
}
