package main;

import contollers.CambiarVentanaController2;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainCambiarVentana extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		try {

			Pane root = (Pane) FXMLLoader.load(getClass().getResource("/vistas/CambiarVentana y coger Datos.fxml"));

			Scene scene = new Scene(root, 600, 400);

			arg0.setScene(scene);
			arg0.show();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} 
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
	


