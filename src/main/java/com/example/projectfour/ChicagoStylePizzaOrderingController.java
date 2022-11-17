package com.example.projectfour;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class ChicagoStylePizzaOrderingController implements Initializable {
    @FXML
    private ComboBox chicagoPizzaOptions;
    @FXML
    private RadioButton small;
    @FXML
    private RadioButton medium;
    @FXML
    private RadioButton large;
    @FXML
    private TextField crust;
    @FXML
    private ListView availableToppings;
    @FXML
    private ListView selectedToppings;
    @FXML
    private TextField pizzaPrice;
    @FXML
    private Button add;
    @FXML
    private Button remove;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> items = FXCollections.observableArrayList("Deluxe","BBQ Chicken","Meatzza","Build " +
                "Your Own");
        chicagoPizzaOptions.setItems(items);
        chicagoPizzaOptions.getSelectionModel().select(3);

    }
}
