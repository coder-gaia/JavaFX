package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

        @FXML
        public Button buttonTest;

        @FXML
        public void onButtonTestAction(){
            System.out.println("Clicked!");
        }
}
