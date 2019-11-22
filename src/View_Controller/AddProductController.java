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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author naasirbush
 */
public class AddProductController implements Initializable {
    Product product;

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
    private TableColumn<Part, Integer> partID;
    @FXML
    private TableColumn<Part, String> partName;
    @FXML
    private TableColumn<Part, Integer> partInventory;
    @FXML
    private TableColumn<Part, Double> partPricePerUnit;
    @FXML
    private TableView<Part> prodPartTable;
    @FXML
    private TableColumn<Part, Integer> prodPartID;
    @FXML
    private TableColumn<Part, String> prodPartName;
    @FXML
    private TableColumn<Part, Integer> prodPartInventory;
    @FXML
    private TableColumn<Part, Double> prodPartPricePerUnit;
    @FXML
    private TableView<Part> partsTable;
    @FXML
    private Button searchBtn;
    @FXML
    private TextField productSearch;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        partsTable.setItems(Inventory.getAllParts());
        partID.setCellValueFactory(new PropertyValueFactory<>("id"));
        partName.setCellValueFactory(new PropertyValueFactory<>("name"));
        partInventory.setCellValueFactory(new PropertyValueFactory<>("stock"));
        partPricePerUnit.setCellValueFactory(new PropertyValueFactory<>("price"));
        
        product = new Product(0, null, 0.0, 0, 0, 0);
        
        prodPartTable.setItems(product.getAllAssociatedParts());
        prodPartID.setCellValueFactory(new PropertyValueFactory<>("id"));
        prodPartName.setCellValueFactory(new PropertyValueFactory<>("name"));
        prodPartInventory.setCellValueFactory(new PropertyValueFactory<>("stock"));
        prodPartPricePerUnit.setCellValueFactory(new PropertyValueFactory<>("price"));
        
        
    }

    @FXML
    private void cancelHandler(ActionEvent event) throws IOException {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Cancel");
        alert.setContentText("Are you sure you want to cancel?");
        alert.showAndWait();

        Parent cancelProductParent = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
        Scene cancelPartScene = new Scene(cancelProductParent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(cancelPartScene);
        app_stage.show();
    }

    @FXML
    private void addHandler(ActionEvent event) throws IOException {
        product.addAssociatePart(partsTable.getSelectionModel().getSelectedItem());

    }

    @FXML
    private void deleteHandler(ActionEvent event) { 
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Disassociate Part");
        alert.setHeaderText("Confirm");
        alert.setContentText("Are you sure you want to disassociate this part from the product?");
        alert.showAndWait();
        
        product.deleteAssociatePart(prodPartTable.getSelectionModel().getSelectedItem());
    }

    @FXML
    private void saveHandler(ActionEvent event) throws IOException {

        int id = Integer.parseInt(addProductID.getText());
        String name = addProductName.getText();
        double price = Double.parseDouble(addProductPrice.getText());
        int inventory = Integer.parseInt(addProductInventory.getText());
        //String companyName = addCompanyName.getText();
        int min = Integer.parseInt(addProductMin.getText());
        int max = Integer.parseInt(addProductMax.getText());

        if (min > max || inventory > max || inventory < min) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Data Entry Error");
            alert.setContentText("Min is greater than Max and/or Inventory is not between Min and Max");
            alert.showAndWait();
        } else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Confirm");
            alert.setHeaderText("Add Product");
            alert.setContentText("Are you sure you want to add this product?");
            alert.showAndWait();
            //product.setId(id);
            product.setName(name);
            product.setPrice(price);
            product.setMin(min);
            product.setMax(max);
            product.setStock(inventory);
            
            
            Inventory.addProduct(product);
            Parent cancelPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
            Scene cancelPartScene = new Scene(cancelPartParent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(cancelPartScene);
            app_stage.show();

        }
    }

       @FXML
    private void searchHandler(ActionEvent event) {

        String searchData = productSearch.getText();

        for (Part p : Inventory.getAllParts()) {

            if (p.getName().contains(searchData) || Integer.toString(p.getId()).equals(searchData)) {
                partsTable.getSelectionModel().select(p);
            }
        }
    }

}
