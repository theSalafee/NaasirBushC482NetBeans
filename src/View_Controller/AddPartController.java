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
