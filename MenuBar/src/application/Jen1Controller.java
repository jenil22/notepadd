package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

public class Jen1Controller implements Initializable{
	
	float data=0f;
	
	int operation=-1;
	
	@FXML
	private Button seven;
	@FXML
	private Button eight;
	@FXML
	private Button nine;
	@FXML
	private Button plus;
	@FXML
	private Button four;
	@FXML
	private Button five;
	@FXML
	private Button six;
	@FXML
	private Button minus;
	@FXML
	private Button one;
	@FXML
	private Button two;
	@FXML
	private Button three;
	@FXML
	private Button multi;
	@FXML
	private Button zero;
	@FXML
	private Button equal;
	@FXML
	private Button clear;
	@FXML
	private Button div;
	@FXML
	private TextField textfeild;

	// Event Listener on Button[#seven].onAction
	@FXML
	public void handleButtonAction(ActionEvent event) {
		if(event.getSource() == one)
		{
			textfeild.setText(textfeild.getText()+"1");
		}
		else if(event.getSource() == two)
		{
			textfeild.setText(textfeild.getText()+"2");
		}else if(event.getSource() == three)
		{
			textfeild.setText(textfeild.getText()+"3");
		}else if(event.getSource() == four)
		{
			textfeild.setText(textfeild.getText()+"4");
		}else if(event.getSource() == five)
		{
			textfeild.setText(textfeild.getText()+"5");
		}else if(event.getSource() == six)
		{
			textfeild.setText(textfeild.getText()+"6");
		}else if(event.getSource() == seven)
		{
			textfeild.setText(textfeild.getText()+"7");
		}else if(event.getSource() == eight)
		{
			textfeild.setText(textfeild.getText()+"8");
		}else if(event.getSource() == nine)
		{
			textfeild.setText(textfeild.getText()+"9");
		}else if(event.getSource() == zero)
		{
			textfeild.setText(textfeild.getText()+"0");
		}else if(event.getSource() == clear)
		{
			textfeild.setText("");
		}else if(event.getSource() == plus)
		{
			data = Float.parseFloat(textfeild.getText());
			operation=1;
			textfeild.setText("");
		}
		else if(event.getSource() == plus)
		{
			data = Float.parseFloat(textfeild.getText());
			operation=1;
			textfeild.setText("");
		}
		else if(event.getSource() == minus)
		{
			data = Float.parseFloat(textfeild.getText());
			operation=2;
			textfeild.setText("");
		}
		else if(event.getSource() == multi)
		{
			data = Float.parseFloat(textfeild.getText());
			operation=3;
			textfeild.setText("");
		}
		else if(event.getSource() == div)
		{
			data = Float.parseFloat(textfeild.getText());
			operation=4;
			textfeild.setText("");
		}
		else if(event.getSource() == equal)
		{
			Float secondOperation = Float.parseFloat(textfeild.getText());
			switch(operation)
			{
			case 1: 
				Float ans = data + secondOperation;
				textfeild.setText(String.valueOf(ans));
			case 2: 
				 ans = data - secondOperation;
				textfeild.setText(String.valueOf(ans));
			case 3: 
				ans = data * secondOperation;
				textfeild.setText(String.valueOf(ans));
			case 4: 
				ans=0f;
				try {
					ans = data / secondOperation;
				}catch(Exception e) {textfeild.setText("error");}
				textfeild.setText(String.valueOf(ans));
			}
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
