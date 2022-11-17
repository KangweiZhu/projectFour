package com.example.projectfour;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    @FXML
    void clickChicagoStyle(ActionEvent event){
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainViewController.class.getResource("ChicagoStylePizzaOrdering" +
                "View.fxml"));
        Parent root;
        Scene scene;
        try {
            root = fxmlLoader.load();
            scene = new Scene(root);
            stage.setResizable(false);
            stage.setTitle("Chicago Style Pizza");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void clickNYStyle(ActionEvent event){
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainViewController.class.getResource("ChicagoStylePizzaOrdering" +
                "View.fxml"));
        Parent root;
        Scene scene;
        try {
            root = fxmlLoader.load();
            scene = new Scene(root);
            stage.setResizable(false);
            stage.setTitle("Chicago Style Pizza");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void clickChicagoStyle(ActionEvent event){
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainViewController.class.getResource("ChicagoStylePizzaOrdering" +
                "View.fxml"));
        Parent root;
        Scene scene;
        try {
            root = fxmlLoader.load();
            scene = new Scene(root);
            stage.setResizable(false);
            stage.setTitle("Chicago Style Pizza");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void clickChicagoStyle(ActionEvent event){
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainViewController.class.getResource("ChicagoStylePizzaOrdering" +
                "View.fxml"));
        Parent root;
        Scene scene;
        try {
            root = fxmlLoader.load();
            scene = new Scene(root);
            stage.setResizable(false);
            stage.setTitle("Chicago Style Pizza");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
