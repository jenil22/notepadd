package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.NumberFormat;
import java.util.List;

import javafx.application.Platform;
import javafx.beans.binding.IntegerExpression;
import javafx.beans.property.IntegerProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.TextFlow;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private TextArea ArA;
	
	
	@FXML
	public void CloseApp(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

	public void Save(ActionEvent event) throws Exception {
		String k=ArA.getText().toString();
		FileChooser fc=new FileChooser();    
		fc.setInitialDirectory(new File("D:\\jenil"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("text files","*.txt"));
		File Selectedfiled=fc.showSaveDialog(null);
		FileWriter f2=new FileWriter(Selectedfiled.getAbsolutePath().toString());
		BufferedWriter b2=new BufferedWriter(f2);
		b2.write(k);
		b2.close();
	}
	
	public void Open(ActionEvent event) throws Exception
	{
		FileChooser fc=new FileChooser();    
		fc.setInitialDirectory(new File("D:\\jenil"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("text files","*.txt"));
		File Selectedfiled=fc.showOpenDialog(null);
		try {
		FileInputStream reader=new FileInputStream(Selectedfiled.getAbsolutePath().toString());
		byte bt[]=new byte[(int)Selectedfiled.length()];
		reader.read(bt);
		String s=new String(bt);
		ArA.setText(""+s);
		reader.close();
		}catch(Exception e) {System.out.println(e);}
	}
	
	public void New(ActionEvent event) throws Exception{
		Parent root=FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage primaryStage=new Stage();
		primaryStage.setTitle("mynotepad");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void delete(ActionEvent event) throws Exception{
		ArA.clear();
	}
	public void calc(ActionEvent event) throws Exception{
		Parent root=FXMLLoader.load(getClass().getResource("/application/Jen1.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage primaryStage=new Stage();
		primaryStage.setTitle("calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
         

