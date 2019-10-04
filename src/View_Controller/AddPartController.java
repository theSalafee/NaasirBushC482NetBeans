/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Controller;

import Model.InhousePart;
import Model.Inventory;
import Model.OutsourcedPart;
import Model.Part;
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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author naasirbush
 */
public class AddPartController implements Initializable {

    @FXML
    private RadioButton outsourcedBtn;
    @FXML
    private RadioButton inHouseBtn;
    @FXML
    private Button cancelBtn;
    @FXML
    private Button savePartBtn;
    @FXML
    private TextField addPartID;
    @FXML
    private TextField addPartName;
    @FXML
    private TextField addPartinventory;
    @FXML
    private TextField addPartPrice;
    @FXML
    private TextField addCompanyName;
    @FXML
    private TextField addPartMin;
    @FXML
    private TextField addPartMax;
    @FXML
    private TextField addPartMachinID;
    @FXML
    private Label addPartIDLabel;
    @FXML
    private Label addPartNameLabel;
    @FXML
    private Label addPartInventoryLabel;
    @FXML
    private Label addPartPriceLabel;
    @FXML
    private Label addPartMInLabel;
    @FXML
    private Label addPartCompNameLabel;
    @FXML
    private Label addPartMaxLabel;
    @FXML
    private Label addPartMachineIdLabel;
    @FXML
    private ToggleGroup partToggle;

    
    public boolean search(int id){
        for (Part part : Inventory.getAllParts()) {
            if(part.getId() == id){
                return true;
            }
        }
        return false;
    }
    
    
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        // testing my git commits
        
        if(search(22)){
            System.out.println("Match");
        }else{
             System.out.println("No Match");
        }
    }    


    @FXML
    private void cancelHandler(ActionEvent event) throws IOException {
        
        Parent cancelPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
        Scene cancelPartScene = new Scene(cancelPartParent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(cancelPartScene);
        app_stage.show();
    }

    @FXML
    private void savePartHandler(ActionEvent event) throws IOException {
     
        int id = Integer.parseInt(addPartID.getText());
        String name = addPartName.getText();
        double price = Double.parseDouble(addPartPrice.getText());
        int inventory = Integer.parseInt(addPartinventory.getText());
        //String companyName = addCompanyName.getText();
        int min = Integer.parseInt(addPartMin.getText());
        int max = Integer.parseInt(addPartMax.getText());
        
        if(inHouseBtn.isSelected()){
            int machineID = Integer.parseInt(addPartMachinID.getText());  
        
        
        
         if(min > max || inventory > max || inventory < min){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Data Entry Error");
            alert.setContentText("Min is greater than Max and/or Inventory is not between Min and Max");
            alert.showAndWait();
            }else{
             
             //possible move this into a method of its own called redirect()
                Inventory.addPart(new InhousePart(id, price, inventory, min, max, name, machineID));
                Parent cancelPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
                Scene cancelPartScene = new Scene(cancelPartParent);
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.hide();
                app_stage.setScene(cancelPartScene);
                app_stage.show();         
         } 
        }else {
              String companyName = addCompanyName.getText();
              
             if(min > max || inventory > max || inventory < min){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Data Entry Error");
            alert.setContentText("Min is greater than Max and/or Inventory is not between Min and Max");
            alert.showAndWait();
            }else{
             
             //possible move this into a method of its own called redirect()
                Inventory.addPart(new OutsourcedPart(id, price, inventory, min, max, name, companyName));
                Parent cancelPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
                Scene cancelPartScene = new Scene(cancelPartParent);
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.hide();
                app_stage.setScene(cancelPartScene);
                app_stage.show(); 
               }
        }
    }

    @FXML
    private void outsourcedBtnHandler(MouseEvent event) {
        
        addPartMachinID.disableProperty().bind(outsourcedBtn.selectedProperty()); 
        
    }

    @FXML
    private void inHouseBtnHandler(MouseEvent event) {
        
         addCompanyName.disableProperty().bind(inHouseBtn.selectedProperty());
    }
    
}
