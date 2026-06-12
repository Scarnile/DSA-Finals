package com.example.dsafinals;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Journal");
        stage.setScene(scene);

        // Set the minimum bounds for the window
        stage.setMinWidth(800);
        stage.setMinHeight(500);

        // CSS
        String css = Objects.requireNonNull(getClass().getResource("stylesheets/application.css")).toExternalForm();
        scene.getStylesheets().add(css);

        stage.show();
    }
}
