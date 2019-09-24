/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Controller;

import Model.Inventory;
import Model.Part;
import Model.Product;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
///

/**
 * FXML Controller class
 *
 * @author naasirbush
 */
public class MainScreenController implements Initializable {
    
    Stage stage;
    Parent scene;

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
    private TableView<Part> partsTable;
    @FXML
    private TableColumn<Part, Integer> partID;
    @FXML
    private TableColumn<Part, String> partName;
    @FXML
    private TableColumn<Part, Integer> partInventory;
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
    private TableColumn<Product, Double> partPricePerUnit;
    @FXML
    private TableView<Product> productsTable;
    @FXML
    private TableColumn<Product, Integer> productID;
    @FXML
    private TableColumn<Product, String> productName;
    @FXML
    private TableColumn<Product, Integer> productInventory;
    @FXML
    private TableColumn<Product, Double> productPricePerUnit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        partsTable.setItems(Inventory.getAllParts());
        partID.setCellValueFactory(new PropertyValueFactory<>("id"));
        partName.setCellValueFactory(new PropertyValueFactory<>("name"));
        partInventory.setCellValueFactory(new PropertyValueFactory<>("stock"));
        partPricePerUnit.setCellValueFactory(new PropertyValueFactory<>("price"));
        
        productsTable.setItems(Inventory.getAllProducts());
        productID.setCellValueFactory(new PropertyValueFactory<>("id"));
        productName.setCellValueFactory(new PropertyValueFactory<>("name"));
        productInventory.setCellValueFactory(new PropertyValueFactory<>("stock"));
        productPricePerUnit.setCellValueFactory(new PropertyValueFactory<>("price"));
        
    }    

    @FXML
    private void searchHandler(ActionEvent event) {
    }

    @FXML
    private void deletePartHandler(ActionEvent event) {
    }

    @FXML
    private void modifyPartHandler(ActionEvent event) throws IOException {
        
          stage = (Stage)((Button)event.getSource()).getScene().getWindow();
          scene = FXMLLoader.load(getClass().getResource("/View_Controller/ModifyPart.fxml"));
          stage.setScene(new Scene(scene));
          stage.show();
        
    }

    @FXML
    private void addPartHandler(ActionEvent event) throws IOException {
        
          stage = (Stage)((Button)event.getSource()).getScene().getWindow();
          scene = FXMLLoader.load(getClass().getResource("/View_Controller/AddPart.fxml"));
          stage.setScene(new Scene(scene));
          stage.show();
         
    }

    @FXML
    private void deleteProductHandler(ActionEvent event) {
    }

    @FXML
    private void modifyProductHandler(ActionEvent event) throws IOException {
        
          stage = (Stage)((Button)event.getSource()).getScene().getWindow();
          scene = FXMLLoader.load(getClass().getResource("/View_Controller/ModifyProduct.fxml"));
          stage.setScene(new Scene(scene));
          stage.show();
        
    }    
    

    @FXML
    private void addProductHandler(ActionEvent event) throws IOException {
        
          stage = (Stage)((Button)event.getSource()).getScene().getWindow();
          scene = FXMLLoader.load(getClass().getResource("/View_Controller/AddProduct.fxml"));
          stage.setScene(new Scene(scene));
          stage.show();
        
    }

    @FXML
    private void exitHandler(ActionEvent event) throws IOException {
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("Quit?");
//        alert.setHeaderText("Are you sure you want to quit?");
//        alert.setContentText("Data will not be saved.");
        System.exit(0);
    }
}
