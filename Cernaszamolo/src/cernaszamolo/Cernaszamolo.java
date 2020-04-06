package cernaszamolo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Cernaszamolo extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CernaszamoloNezet.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Prime Rate Kft. | Cérnaszámoló");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
