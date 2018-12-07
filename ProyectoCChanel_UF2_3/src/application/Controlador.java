package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlador {
	@FXML
	private Stage primaryStage;
	
	public Controlador() {

	}
	public void asignarVentanas(Stage primaryStage) {
		this.primaryStage=primaryStage;
	}
	@FXML
	public void cerrarApp() {
		System.exit(0);
	}
	@FXML
	public void cambiarVentana() {
		FXMLLoader loader= new FXMLLoader(getClass().getResource("Ventana2.fxml"));
		
		AnchorPane ventana2;
		try {
			ventana2 = loader.load();
			primaryStage.setScene(new Scene(ventana2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
