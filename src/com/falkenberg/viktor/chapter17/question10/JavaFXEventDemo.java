package com.falkenberg.viktor.chapter17.question10;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXEventDemo extends Application {
    Label response;

    public static void main(String[] args) {
// Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    // Переопределить метод start()
    public void start(Stage myStage) {
// Присвоить название платформе
        myStage.setTitle("Use Platform.exit().");
// Использовать FlowPane для корневого узла. В данном
// случае значение вертикального и горизонтального
// зазоров составляет 10.
        FlowPane rootNode = new FlowPane(10, 10);
// Центрировать элементы управления на сцене
        rootNode.setAlignment(Pos.CENTER);

// Создать сцену
        Scene myScene = new Scene(rootNode, 300, 100);
// Установить сцену на платформе
        myStage.setScene(myScene);
// Создать метку
        response = new Label("Нажмите кнопку");
// Создать две кнопки
        Button btnRun = new Button("Run");
        Button btnExit = new Button("Exit");
// Обработать события действий для кнопки Run
        btnRun.setOnAction((ae) -> response.setText("You pressed Run."));
// Обработать события действий для кнопки Exit
        btnExit.setOnAction((ae) -> Platform.exit());

// Добавить метку и кнопки в граф сцены
        rootNode.getChildren().addAll(btnRun, btnExit, response);
// Отобразить платформу и ее сцену
        myStage.show();

    }
}