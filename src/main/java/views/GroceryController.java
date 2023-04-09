package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.groceryItem;
import model.storeModel;

public class GroceryController {

	storeModel model;
	
    @FXML
    private Button AddButton;

    @FXML
    private ListView<groceryItem> GroceryListView;

    @FXML
    private TextField ItemCostTextField;

    @FXML
    private TextField ItemNameTestField; //oops spelling!
    
    public void setModel(storeModel newModel)
    {
    	model = newModel;
    	//setting up the grocery list view
    	GroceryListView.setItems(model.getGroceries());
    }
    
    private double getItemCost()
    {
    	String val = ItemCostTextField.textProperty().get();
    	double amt = 0;
    	try
		{
			amt = Double.parseDouble(val);
		} 
    	catch (NumberFormatException e)
		{
    		 ItemCostTextField.textProperty().set("");
		}
    	
    	return amt;
    } 
    
    private String getItemName()
    {
    	String val =  ItemNameTestField.textProperty().get();
    	return val;
    }

    @FXML
    void OnAddClick(ActionEvent event) 
    {
    	groceryItem gi = new groceryItem(getItemName(), getItemCost());
    	
    	model.getGroceries().add(gi);
    }

}
