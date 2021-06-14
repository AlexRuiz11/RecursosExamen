package contollers;

import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CambiarVentanaController implements Initializable {
	
	

	public static String xd="Holaaaaaaaaaaaaaaaaaaaaaaaa"; // public static para poder acceder desde otra ventana

	@FXML
	Button CambiarVentana;

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	
	public void CambiarVentana() throws IOException {
		

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/CambiarVentana y coger Datos2.fxml"));
		
		Parent root = loader.load();
		
		
		CambiarVentanaController2 controller = loader.getController();
		
		Scene scene = new Scene(root);
		Stage stage = new Stage();

		stage.setScene(scene);
		
		stage.show();
		
		
		Stage myStage = (Stage) this.CambiarVentana.getScene().getWindow();
		
		
		myStage.close();
		
		
		
		
	;
		
	}
	
	

}
