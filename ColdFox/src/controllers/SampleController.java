package controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class SampleController implements Initializable{
	@FXML
	private TabPane tpChambre, tpPoste;
	@FXML
	private Tab tabChambre1;
	@FXML
	private TextField tfIGsociete, tfIGclient, tfIGchambre, tfIGrepere;
	@FXML
	private DatePicker dpIG;
	@FXML
	private TextField tfIGtempscr, tfIGhygrometrie, tfIGhauteur, tfIGsurface;
	@FXML
	private Tab tabIG, tabP1, tabP2, tabP3, tabP4, tabP5, tabP6;
	@FXML
	private Tab tabP7, tabP8, tabP9, tabP10, tabRecap;

	@FXML
	void test(ActionEvent event) {
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		dpIG.setValue(LocalDate.now());
	}

}
