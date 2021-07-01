package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class Main extends Application {
	private static Stage stage;

    @Override
    public void start(Stage s) throws IOException {
        stage=s;
        setRoot("Sample","Cold Fox");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/resources/images/icons/overwolf-bleu-64.png")));
    }

    public static void setRoot(String fxml) throws IOException {
        setRoot(fxml, stage.getTitle(), stage.getHeight(), stage.getWidth());
        
    }

    public static void setRoot(String fxml, String title) throws IOException {
        Scene scene = new Scene(loadFXML(fxml));
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml, String title, double height, double widht) throws IOException {
        Scene scene = new Scene(loadFXML(fxml));
        stage.setTitle(title);
        stage.setScene(scene);
        stage.setHeight(height);
        stage.setWidth(widht);
        stage.show();
    }
    
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/resources/fxml/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
