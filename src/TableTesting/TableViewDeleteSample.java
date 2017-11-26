/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableTesting;

import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

import com.sun.prism.impl.Disposer.Record;


public class TableViewDeleteSample extends Application {
    
    private TableView<Person> tableView = new TableView<Person>();
    

    private final ObservableList<Person> data =
            FXCollections.observableArrayList(
            new Person("Eliza", "Smith", "eliza.smith@javafxpro.com"),
            new Person("Isabella", "Johnson", "isabella.johnson@javafxpro.com"),
            new Person("Imran", "Williams", "imran.williams@javafxpro.com"),
            new Person("Emma", "Jones", "emma.jones@javafxpro.com"),
            new Person("Russel", "Peters", "russel.peters@javafxpro.com"));

    
    public static class Person {
    	 
        private final SimpleStringProperty firstName;
        private final SimpleStringProperty lastName;
        private final SimpleStringProperty email;
 
        private Person(String fName, String lName, String email) {
            this.firstName = new SimpleStringProperty(fName);
            this.lastName = new SimpleStringProperty(lName);
            this.email = new SimpleStringProperty(email);
        }
 
        public String getFirstName() {
            return firstName.get();
        }
 
        public void setFirstName(String fName) {
            firstName.set(fName);
        }
 
        public String getLastName() {
            return lastName.get();
        }
 
        public void setLastName(String fName) {
            lastName.set(fName);
        }
 
        public String getEmail() {
            return email.get();
        }
 
        public void setEmail(String fName) {
            email.set(fName);
        }
    }
    
    @SuppressWarnings("unchecked")
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Table With Delete Row");
        tableView.setEditable(false);
        
        TableColumn<Person, String> firstName = new TableColumn<Person, String>("First Name");
        TableColumn<Person, String> lastName = new TableColumn<Person, String>("Last Name");
        TableColumn<Person, String> email = new TableColumn<Person, String>("Email");
        
        firstName.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
        email.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));
        
        tableView.getColumns().add(firstName);
        tableView.getColumns().add(lastName);
        tableView.getColumns().add(email);
        tableView.setItems(data);
        
        VBox vBox = new VBox();
        vBox.getChildren().addAll(tableView);
        primaryStage.setScene(new Scene(vBox, 440, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    //Define the button cell

}