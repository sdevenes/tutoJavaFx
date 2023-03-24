package com.example.tutojavafx;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;
    @ FXML
    private Label labelColor;
    @ FXML
    private ImageView ImgContainer;
    @FXML
    private PieChart chart;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onGreenButtonClick() {

        labelColor.setTextFill(Color.GREEN);
    }

    @FXML
    protected void onRedButtonClick() {

        labelColor.setTextFill(Color.RED);
    }

    @FXML
    protected void onBlueButtonClick() {

        labelColor.setTextFill(Color.BLUE);
    }

    @FXML
    protected void onChooseFileClick() {

        FileChooser fileChooser = new FileChooser();

        // Set extension filter
        FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
        FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
        fileChooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);

        // Show open file dialog
        File file = fileChooser.showOpenDialog(null);

        Image img = null;
        if (file != null) {
            img = new Image(file.toURI().toString());
        }

        ImgContainer.setImage(img);
    }

    @FXML
    protected void onSliderValueChange() {

       // chart.setData();
    }
}