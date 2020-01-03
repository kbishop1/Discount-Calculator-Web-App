 

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
	    Parent root = FXMLLoader.load(getClass().getResource("main1.fxml"));


	    Scene scene = new Scene(root);
	    scene.setRoot(root);
	    //String css = this.getClass().getResource("../stylesheet1.css").toExternalForm(); 
	    //scene.getStylesheets().add(css);
	    stage.setScene(scene);
	    stage.show();
	}
 


    public static void main(String[] args) {
        launch(args);
    }
}