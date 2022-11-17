package com.example.projectfour;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    @FXML
    private TextField billboard;

    @FXML
    void clickChicagoStyle(ActionEvent event) {
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
    void clickNYStyle(ActionEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainViewController.class.getResource("ChicagoStylePizzaOrdering" +
                "View.fxml"));
        Parent root;
        Scene scene;
        try {
            root = fxmlLoader.load();
            scene = new Scene(root);
            stage.setResizable(false);
            stage.setTitle("New York Style Pizza");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void clickStoreOrders(ActionEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainViewController.class.getResource("ChicagoStylePizzaOrdering" +
                "View.fxml"));
        Parent root;
        Scene scene;
        try {
            root = fxmlLoader.load();
            scene = new Scene(root);
            stage.setResizable(false);
            stage.setTitle("Store Orders");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void clickCurrentOrder(ActionEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainViewController.class.getResource("ChicagoStylePizzaOrdering" +
                "View.fxml"));
        Parent root;
        Scene scene;
        try {
            root = fxmlLoader.load();
            scene = new Scene(root);
            stage.setResizable(false);
            stage.setTitle("Order Detail");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        billboard.setEditable(false);
    }
}
