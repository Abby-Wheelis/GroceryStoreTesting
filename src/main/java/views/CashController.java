package views;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.storeModel;
import javafx.util.StringConverter;
import javafx.util.converter.CurrencyStringConverter;

public class CashController {

	storeModel model;
	
    @FXML
    private Label BalanceLabel;

    @FXML
    private TextField deltaMoneyTextField;
    
    public void setModel(storeModel newModel)
    {
    	model = newModel;
    	
    	//bind the label
    	StringConverter<Number> fmt = new CurrencyStringConverter();
    	Bindings.bindBidirectional(BalanceLabel.textProperty(), model.getMoney(), fmt);
    }
    
    private double getAmt()
    {
    	String val = deltaMoneyTextField.textProperty().get();
    	double amt = 0;
    	try
		{
			amt = Double.parseDouble(val);
		} 
    	catch (NumberFormatException e)
		{
    		deltaMoneyTextField.textProperty().set("");
//			e.printStackTrace();
		}
    	
    	return amt;
    }

    @FXML
    void OnAddCash(ActionEvent event) 
    {
    	double value = getAmt();
    	model.deltaMoney(value);
    }

    @FXML
    void OnRemoveCash(ActionEvent event) 
    {
    	double value = getAmt();
    	model.deltaMoney(-1 * value);
    }

}

