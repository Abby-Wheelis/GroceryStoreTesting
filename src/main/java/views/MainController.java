package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.ViewTransitionModelInterface;

public class MainController
{
	ViewTransitionModelInterface model;
    @FXML
    private Button CashButton;
    @FXML
    private Button GrocListButton;
	
	public void setModel(ViewTransitionModelInterface newModel)
	{
		model = newModel;
	}

    @FXML
    void OnClickCash(ActionEvent event) 
    {
    	model.showCash();
    	System.out.println("cash button clicked");
    }

    @FXML
    void OnClickGrocList(ActionEvent event) 
    {
    	model.showGroceries();
    	System.out.println("grocery list button clicked");
    }

}
