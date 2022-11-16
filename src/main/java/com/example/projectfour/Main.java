package com.example.projectfour;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * The main method will create a scene, build the Scene Graph and initialise the Controller of a JavaFX View.
 *
 * @author Michael Israel, Kangwei Zhu
 */
public class Main extends Application {
    /**
     * Default constructor
     */
    public Main() {
    }

    /**
     * The entry of this program. It calls the launch method, which is a static method defined in Application class for
     * launching a stand-alone JavaFx application
     *
     * @param args The String type array of command lines arguments
     */
    public static void main(String[] args) {
        launch();
    }

    /**
     * The start method place UI controls in a scene and display the scene in a stage
     *
     * @param stage The stage that is going to be showed.
     */
    @Override
    public void start(Stage stage) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
        Scene scene;
        Parent root;
        try {
            root = fxmlLoader.load();
            scene = new Scene(root);
            stage.setTitle("RU Pizza");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println("Warning: Cannot show the stage!");
            e.printStackTrace();
        }
    }
}
