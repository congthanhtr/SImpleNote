package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button crtBtn;

    @FXML
    private Button viewBtn;

    @FXML
    void handleCrtBtn(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent  root = FXMLLoader.load(getClass().getResource("CreatNote/creatNote.fxml"));
        Scene sceme = new Scene(root);
        stage.setScene(sceme);
        stage.show();

    }

    @FXML
    void handleViewBtn(ActionEvent event) {

    }

}
