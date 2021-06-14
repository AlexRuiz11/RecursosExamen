package contollers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;

public class GrupoRadioButtonController  implements Initializable{

    @FXML
    public  RadioButton uno;

    @FXML
    private RadioButton tres;

    @FXML
    private RadioButton dos;

    @FXML
    private Text texto;

	public void initialize(URL arg0, ResourceBundle arg1) {

		
		

	}
   

	
	public void getNumber() {
		
		if(uno.isSelected()) texto.setText(uno.getText());
		if(dos.isSelected()) texto.setText(dos.getText());
		if(tres.isSelected()) texto.setText(tres.getText());
	}
    
    
    

}
