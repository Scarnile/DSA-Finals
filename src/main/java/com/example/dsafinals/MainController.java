package com.example.dsafinals;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button dashboardButton;

    @FXML
    private VBox sidebar;

    @FXML
    public void initialize() {
        sidebar.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {
                sidebar.prefWidthProperty().bind(
                        newScene.widthProperty().multiply(0.18)
                );
            }
        });
    }
}
