package controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.time.LocalDate;

public class AddTaskFormController {
    @FXML
    public  JFXDatePicker DOB  ;
    @FXML
    public JFXTextField txtAddTask;
    @FXML
    public VBox boxVBox;
    @FXML
    public JFXCheckBox box1;


    public void btnViewOnAction(ActionEvent actionEvent) {
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../view/done_task_form.fxml")));
            Stage stage=new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("To-Do List Application");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void btnAddOnAction(ActionEvent actionEvent) {
            JFXCheckBox box1 = new JFXCheckBox(txtAddTask.getText());
            javafx.scene.control.Label lbl = new Label(String.valueOf(DOB.getValue()));
            boxVBox.getChildren().add(lbl);
            boxVBox.getChildren().addAll(box1);
            boxVBox.setSpacing(10);
            DOB.setValue(null);
            txtAddTask.setText(null);
        }

    }

