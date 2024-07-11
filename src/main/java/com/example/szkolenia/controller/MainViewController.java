package com.example.szkolenia.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainViewController {

    @FXML
    private Label welcomeLabel;

    @FXML
    public void initialize() {
        welcomeLabel.setText("Witamy w aplikacji Szkolenia");
    }
}
