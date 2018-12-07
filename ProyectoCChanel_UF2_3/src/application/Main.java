package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	Controlador controlador;
	
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader= new FXMLLoader(getClass().getResource("Layouts.fxml"));
		
		try {
			AnchorPane ventana1= loader.load();
			
			controlador = loader.getController();
			controlador.asignarVentanas(primaryStage);
			primaryStage.setScene(new Scene(ventana1));
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
