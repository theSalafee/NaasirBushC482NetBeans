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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

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
    private void cancelHandler(ActionEvent event) {
    }

    @FXML
    private void savePartHandler(ActionEvent event) {
    }
    
}