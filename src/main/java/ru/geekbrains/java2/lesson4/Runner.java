package ru.geekbrains.java2.lesson4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Runner extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/maket/sample.fxml"));
        primaryStage.setTitle("Chat Client");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.centerOnScreen();
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
