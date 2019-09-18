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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void outsourcedBtnHandler(ActionEvent event) {
    }

    @FXML
    private void inHouseBtnHandler(ActionEvent event) {
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
    private void savePartHandler(ActionEvent event) {
    }
    
}
