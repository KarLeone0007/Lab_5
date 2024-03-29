package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;
import sample.Main;

import java.io.IOException;

public class InputSurnameController {

    @FXML
    private Button btnCancel;

    @FXML
    private TextField txtSurname;

    public static String surname;
    public static boolean IsCancel;

    public void OnClickedCancel(MouseEvent mouseEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
        IsCancel = true;
    }

    public void OnClickedOk(MouseEvent mouseEvent) {
        if(!txtSurname.getText().isEmpty()&&txtSurname.getText().matches("[А-Я][а-я]{2,}")){
            surname=txtSurname.getText();
            OnClickedCancel(mouseEvent);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка!");
            alert.setHeaderText("Некорректный ввод!");
            alert.setContentText("Введите корректную фамилию!");
            alert.showAndWait();
        }
        IsCancel = false;
    }

}
