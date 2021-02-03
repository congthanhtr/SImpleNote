package sample.CreatNote;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class creatNote implements Initializable {

    @FXML
    private AnchorPane crtPane;

    @FXML
    private TextField header;

    @FXML
    private DatePicker time;

    @FXML
    private TextArea content;

    @FXML
    private Button saveBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    private Label noti;

    @FXML
    void handleCancelBtn(ActionEvent event) throws IOException {
        ((Stage)crtPane.getScene().getWindow()).close();
    }

    @FXML
    void handleSaveBtn(ActionEvent event) {
        String strheader = header.getText();
        String strcontent = content.getText();
        LocalDate value = time.getValue();
        String strtime = value.toString();
        System.out.println(strtime);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        time.setValue(LocalDate.now());
    }
}
