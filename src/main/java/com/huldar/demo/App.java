package com.huldar.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * 
 * @author  huldarchen
 * @CreateTime 2024/6/21 22:05
 * @version 1.0
 *
 */public class App extends Application {


    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Get Baidu Title");
        btn.setOnAction(event -> {
            String title = WebScraper.getBaiduTitle();
            System.out.println("Baidu Title: " + title);
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Baidu Title Scraper");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
