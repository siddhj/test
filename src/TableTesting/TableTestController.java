/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableTesting;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author siddhartha.jain
 */
public class TableTestController implements Initializable {
    @FXML
    private Button add;

    @FXML
    private Button remove;

    @FXML
    private TableView<PersonName> tableView = new TableView<>();
    
    @FXML
    private TextField firstnametext;

    @FXML
    private TextField lastnametext;
    
     TableColumn <PersonName,String>firstcol = new TableColumn<>("First Name");
     TableColumn <PersonName,String>lastcol = new TableColumn<>("Last Name");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
    

    @FXML
    void addRow(ActionEvent event) {
    firstcol.setCellValueFactory(new PropertyValueFactory<PersonName,String>("firstName"));
    lastcol.setCellValueFactory(new PropertyValueFactory<PersonName,String>("lastName"));
    tableView.setItems(getProduct());
    tableView.getColumns().addAll(firstcol,lastcol);
    }

    @FXML
    void removeRow(ActionEvent event) {

    }
    
    public ObservableList<PersonName> getProduct(){
    ObservableList <PersonName> list = FXCollections.observableArrayList();
    list.add(new PersonName("sid","jain"));
    list.add(new PersonName("mohit","bansal"));
    return list;
    }
    
   public static class PersonName{
   
        private String firstName,lastName;
       
        public PersonName(){
        firstName = "";
        lastName = "";
        }
        
        public PersonName(String firstname,String lastname){
        this.firstName = firstname;
        this.lastName = lastname;
        }
        
        public void setFirstName(String firstname)
        {
        this.firstName = firstname;
        }
        
        public void setLastName(String lastname)
        {
        this.lastName = lastname;
        }
        
        public String getLastName()
        {
        return lastName;
        }
        
        public String getFirstName()
        {
        return firstName;
        }
   }
}
 