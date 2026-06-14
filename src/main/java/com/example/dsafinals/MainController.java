package com.example.dsafinals;

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

        int iconSize = 20;

        // Dashboard
        FontIcon homeIcon = new FontIcon("mdi2h-home");
        homeIcon.getStyleClass().add("sidebar-icon");
        homeIcon.setIconSize(iconSize);
        dashboardButton.setGraphic(homeIcon);

        // Journal
        FontIcon journalIcon = new FontIcon("mdi2b-book-open-page-variant");
        journalIcon.getStyleClass().add("sidebar-icon");
        journalIcon.setIconSize(iconSize);
        journalButton.setGraphic(journalIcon);

        // Albums
        FontIcon albumIcon = new FontIcon("mdi2f-folder");
        albumIcon.getStyleClass().add("sidebar-icon");
        albumIcon.setIconSize(iconSize);
        albumsButton.setGraphic(albumIcon);

        // Photos
        FontIcon photoIcon = new FontIcon("mdi2i-image");
        photoIcon.getStyleClass().add("sidebar-icon");
        photoIcon.setIconSize(iconSize);
        photosButton.setGraphic(photoIcon);

        // Settings
        FontIcon settingsIcon = new FontIcon("mdi2c-cog");
        settingsIcon.getStyleClass().add("sidebar-icon");
        settingsIcon.setIconSize(iconSize);
        settingsButton.setGraphic(settingsIcon);

        // New Entry
        FontIcon addIcon = new FontIcon("mdi2p-plus");
        addIcon.getStyleClass().add("sidebar-icon");
        addIcon.setIconSize(18);
        newEntryButton.setGraphic(addIcon);

        // Resize the sidebar based on the window width
        sidebar.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {
                sidebar.prefWidthProperty().bind(newScene.widthProperty().multiply(0.17));
            }
        });
    }
}
