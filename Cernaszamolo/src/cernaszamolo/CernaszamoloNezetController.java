package cernaszamolo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class CernaszamoloNezetController implements Initializable {
    
    @FXML
    private Button alertButton;
    
    @FXML
    private Pane basicPane;
    
    @FXML
    private Pane alertPane;
    
    @FXML
    private Label eredmenyText;
    
    @FXML
    private Label alertText;
    
    @FXML
    private TextField input1;
    
    @FXML
    private TextField input2;
    
    @FXML
    private void handleAlertButton(ActionEvent event) {
        basicPane.setDisable(false);
        basicPane.setOpacity(1);
        alertPane.setVisible(false);
        alertText.setText("");
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
