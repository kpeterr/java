package cernaszamolo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class CernaszamoloNezetController implements Initializable {
    
    // Beolvasott számok változói
    private int oldalszam;
    private int irkakiloves;
    
    @FXML
    private Pane basicPane;
    
    @FXML
    private Pane alertPane;
    
    @FXML
    private Label eredmenyText;
    
    @FXML
    private Label elsoEgeszOldalak;
    
    @FXML
    private Label alertText;
    
    @FXML
    private TextField oldalszamBe;
    
    @FXML
    private TextField irkakilovesBe;
    
    @FXML
    private void handleAlertButton(ActionEvent event) {
        basicPane.setDisable(false);
        basicPane.setOpacity(1);
        alertPane.setVisible(false);
        alertText.setText("");
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        szamol();
    }
    
    private void szamol(){
        
        // Eltároljuk a beérkező számokat
        // Számok-e egyáltalán?
        try {
            oldalszam = Integer.parseInt(oldalszamBe.getText());
            irkakiloves = Integer.parseInt(irkakilovesBe.getText());
        } catch (Exception e) {
            alert("Számot kell megadnod!");
            //return;
        }
        
        if(oldalszam % 4 == 0){
            int maradek = (oldalszam - irkakiloves) % irkakiloves;
            if(maradek == 0){
                eredmenyText.setText(String.valueOf(oldalszam / irkakiloves) + "x" + String.valueOf(irkakiloves));
                elsoEgeszOldalak.setText(String.valueOf(oldalszam / irkakiloves * irkakiloves));
            }else if (maradek == 4) {
                int koztes = irkakiloves;
                eredmenyText.setText(String.valueOf(oldalszam / irkakiloves - 2) + "x" + String.valueOf(irkakiloves) + " + 1x" + String.valueOf(koztes + 4) + " + 1x" + String.valueOf(irkakiloves));
                elsoEgeszOldalak.setText(String.valueOf((oldalszam / irkakiloves - 2) * irkakiloves));
            }else {
                eredmenyText.setText(String.valueOf(oldalszam / irkakiloves - 1) + "x" + String.valueOf(irkakiloves) + " + 1x" + String.valueOf(maradek) + " + 1x" + String.valueOf(irkakiloves));
                elsoEgeszOldalak.setText(String.valueOf((oldalszam / irkakiloves - 1) * irkakiloves));
            }
        }else {
            alert("Az oldalszámnak 4-gyel\noszthatónak kell lennie!");
        }
    }
    
    private void alert(String text){
        basicPane.setDisable(true);
        basicPane.setOpacity(0);
        alertPane.setVisible(true);
        alertText.setText(text);
        oldalszamBe.requestFocus();
    }
    
    @FXML
    private void handleTorolGomb(ActionEvent event){
        oldalszamBe.setText("");
        irkakilovesBe.setText("");
        eredmenyText.setText("");
        //elsoEgeszOldalak.setText("");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
