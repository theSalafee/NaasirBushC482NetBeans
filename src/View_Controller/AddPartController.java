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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        // testing my git commits
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
