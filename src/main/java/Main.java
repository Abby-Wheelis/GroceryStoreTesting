import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.ViewTransitionModel;
import model.storeModel;
import views.MainController;

public class Main extends Application
{
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		storeModel model = new storeModel();
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("views/MainView.fxml"));
		
		BorderPane view = loader.load();
		MainController controller = loader.getController();
		ViewTransitionModel vm = new ViewTransitionModel(view, model);
		controller.setModel(vm);
		vm.showCash();
		
		Scene s = new Scene(view);
		primaryStage.setScene(s);
		primaryStage.show();
		
	}
	
	public static void main(String [] args)
	{
		launch(args);
	}

}


