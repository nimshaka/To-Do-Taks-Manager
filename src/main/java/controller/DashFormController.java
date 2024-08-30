package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashFormController {

    @FXML
    void btnLoginOnAction(ActionEvent event) {
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../view/add_task_form.fxml")));
            Stage stage=new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("To-Do List Application");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
