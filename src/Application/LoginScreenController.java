/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.awt.Button;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import screensframework.ControlledScreen;
import screensframework.ScreensController;
import screensframework.ScreensFramework;

/**
 * FXML Controller class
 *
 * @author siddhartha.jain
 */
public class LoginScreenController implements Initializable,ControlledScreen {
    ScreensController myController = new ScreensController();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

  @FXML
    private Button userloginbutton;

    @FXML
    private TextField licensenumber;

    @FXML
    void userLogin(ActionEvent event) {
            myController.setScreen(ScreensFramework.screen2ID);
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
