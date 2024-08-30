package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class DoneTaskFormController {
    public TableColumn colDoneTask;
    public TableColumn colDate;
    public TableView tblTaskTable;

    public void btnHistoryOnAction(ActionEvent actionEvent) {
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../view/history_task_form.fxml")));
            Stage stage=new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("To-Do List Application");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnReloadOnAction(ActionEvent actionEvent) {
        
    }
}
