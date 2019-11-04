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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author naasirbush
 */
public class ModifyPartController implements Initializable {

    @FXML
    private TextField modifyPartID;
    @FXML
    private TextField modifyPartName;
    @FXML
    private TextField modifyPartinventory;
    @FXML
    private TextField modifyPartPrice;
    @FXML
    private TextField modifyCompanyName;
    @FXML
    private TextField modifyPartMin;
    @FXML
    private TextField modifyPartMax;
    @FXML
    private TextField modifyPartMachinID;
    @FXML
    private RadioButton outsourcedBtn;
    @FXML
    private RadioButton inHouseBtn;
    @FXML
    private Button cancelBtn;
    @FXML
    private Button savePartBtn;
    @FXML
    private Label modifyPartIdLabel;
    @FXML
    private Label modifyPartNameLabel;
    @FXML
    private Label modifyPartInventoryLabel;
    @FXML
    private Label modifyPartPriceLabel;
    @FXML
    private Label modifyPartMinLabel;
    @FXML
    private Label modifyPartCompLabel;
    @FXML
    private Label modifyPartMaxLabel;
    @FXML
    private Label modifyPartMachineIdlabel;
    @FXML
    private ToggleGroup partToggle;

    Part selectedPart;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setPart(Part part) {
        selectedPart = part;
        if (selectedPart instanceof InhousePart) {
            inHouseBtn.setSelected(true);
            int machineId = ((InhousePart) selectedPart).getMachineID();
            modifyPartMachinID.setText(String.valueOf(machineId));
            modifyPartID.setText(String.valueOf(selectedPart.getId()));
            modifyPartName.setText(selectedPart.getName());
            modifyPartMin.setText(String.valueOf(selectedPart.getMin()));
            modifyPartMax.setText(String.valueOf(selectedPart.getMax()));
            modifyPartinventory.setText(String.valueOf(selectedPart.getStock()));
            modifyPartPrice.setText(String.valueOf(selectedPart.getPrice()));
            modifyCompanyName.disableProperty().bind(inHouseBtn.selectedProperty());
        }

        if (selectedPart instanceof OutsourcedPart) {
            outsourcedBtn.setSelected(true);
            String companyName = ((OutsourcedPart) selectedPart).getCompanyName();
            //modifyPartMachinID.setText(companyName);
            modifyPartMachinID.disableProperty().bind(outsourcedBtn.selectedProperty());
            modifyPartID.setText(String.valueOf(selectedPart.getId()));
            modifyPartName.setText(selectedPart.getName());
            modifyPartMin.setText(String.valueOf(selectedPart.getMin()));
            modifyPartMax.setText(String.valueOf(selectedPart.getMax()));
            modifyPartinventory.setText(String.valueOf(selectedPart.getStock()));
            modifyPartPrice.setText(String.valueOf(selectedPart.getPrice()));
            modifyCompanyName.setText(selectedPart.getName());

        }
    }

    @FXML
    private void outsourcedBtnHandler(ActionEvent event) {
    }

    @FXML
    private void inHouseBtnHandler(ActionEvent event) {
    }

    @FXML
    private void cancelHandler(ActionEvent event) throws IOException {
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Cancel");
        alert.setContentText("Are you sure you want to cancel?");
        alert.showAndWait();

        Parent cancelPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
        Scene cancelPartScene = new Scene(cancelPartParent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(cancelPartScene);
        app_stage.show();
    }

    @FXML
    private void savePartHandler(ActionEvent event) throws IOException {

        int id = Integer.parseInt(modifyPartID.getText());
        String name = modifyPartName.getText();
        //String companyName =  modifyCompanyName.getText();
        double price = Double.parseDouble(modifyPartPrice.getText());
        int inventory = Integer.parseInt(modifyPartinventory.getText());
        String companyName = modifyCompanyName.getText();
        int min = Integer.parseInt(modifyPartMin.getText());
        int max = Integer.parseInt(modifyPartMax.getText());

        if (inHouseBtn.isSelected()) {
            int machineID = Integer.parseInt(modifyPartMachinID.getText());

            if (min > max || inventory > max || inventory < min) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setHeaderText("Data Entry Error");
                alert.setContentText("Min is greater than Max and/or Inventory is not between Min and Max");
                alert.showAndWait();
            } else {

                //possible move this into a method of its own called redirect()
                Inventory.addPart(new InhousePart(id, price, inventory, min, max, name, machineID));
                Parent cancelPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
                Scene cancelPartScene = new Scene(cancelPartParent);
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.hide();
                app_stage.setScene(cancelPartScene);
                app_stage.show();
            }
        } else {
            companyName = modifyCompanyName.getText();

            if (min > max || inventory > max || inventory < min) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setHeaderText("Data Entry Error");
                alert.setContentText("Min is greater than Max and/or Inventory is not between Min and Max");
                alert.showAndWait();
            } else {

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

}
