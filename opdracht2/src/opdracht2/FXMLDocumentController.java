/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Bart
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField isbn;
    
    @FXML
    private TextField lidtoevoegen;
    
    @FXML
    private void ToevoegenBoek(ActionEvent event) {
       
        //Boek.nieuwboek(isbn.getText());
        Boek boek = new Boek("121212");
        boek.nieuwboek(isbn.getText()); 
    }
    
    @FXML
    private void Toevoegenlid(ActionEvent event) {
       
        Lid lid = new Lid("bart");
        lid.nieuwLid(lidtoevoegen.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
