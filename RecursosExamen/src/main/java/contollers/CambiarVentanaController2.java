package contollers;

import java.io.IOException;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class CambiarVentanaController2 implements Initializable {
	

	CambiarVentanaController otraVentana;

	
	@FXML
	Button CambiarVentana;

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void CambiarVentana() throws IOException {
		

	
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information Dialog");
		alert.setHeaderText(null);
		alert.setContentText(otraVentana.xd);

		alert.showAndWait();
		
	}
	
	

}
