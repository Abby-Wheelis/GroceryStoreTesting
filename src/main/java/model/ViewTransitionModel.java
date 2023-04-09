package model;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import views.CashController;
import views.GroceryController;

public class ViewTransitionModel implements ViewTransitionModelInterface
{
	BorderPane mainView;
	storeModel model;

	public ViewTransitionModel(BorderPane view, storeModel newModel)
	{
		mainView = view;
		model = newModel;
	}
	
	@Override
	public void showCash()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("../views/CashView.fxml"));
		
		try
		{
			Pane view = loader.load();
			mainView.setCenter(view);
			CashController controller = loader.getController();
			controller.setModel(model);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void showGroceries()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("../views/GroceryListView.fxml"));
		
		Node view;
		try
		{
			view = loader.load();
			mainView.setCenter(view);
			GroceryController controller = loader.getController();
			controller.setModel(model);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
