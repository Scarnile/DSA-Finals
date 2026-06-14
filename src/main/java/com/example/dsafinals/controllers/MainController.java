package com.example.dsafinals.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import org.kordamp.ikonli.javafx.FontIcon;

public class MainController {
    @FXML
    private VBox sidebar;

    @FXML
    private Button dashboardButton;

    @FXML
    private Button journalButton;

    @FXML
    private Button albumsButton;

    @FXML
    private Button photosButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button newEntryButton;


    @FXML
    public void initialize() {

        dashboardButton.setGraphic(createIcon("mdi2h-home"));
        journalButton.setGraphic(createIcon("mdi2b-book-open-page-variant"));
        albumsButton.setGraphic(createIcon("mdi2f-folder"));
        photosButton.setGraphic(createIcon("mdi2i-image"));
        settingsButton.setGraphic(createIcon("mdi2c-cog"));
        newEntryButton.setGraphic(createIcon("mdi2p-plus"));

        // Resize the sidebar based on the window width
        sidebar.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {
                sidebar.prefWidthProperty().bind(newScene.widthProperty().multiply(0.17));
            }
        });
    }

    public FontIcon createIcon(String iconCode) {
        FontIcon addIcon = new FontIcon(iconCode);
        addIcon.getStyleClass().add("sidebar-icon");
        addIcon.setIconSize(18);
        return addIcon;
    }
}
