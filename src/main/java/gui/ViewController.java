package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {

        @FXML
        public Button buttonTest;

        @FXML
        public void onButtonTestAction(){
            Alerts.showAlert("Alert title", null, "Worked", Alert.AlertType.ERROR);
        }
}
