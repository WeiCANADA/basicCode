package week9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-11-05 12:51 p.m.
 */
public class FahrenheitDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Fahrenheit Converter");
        Scene scene = new Scene(new FahrenheitPane(),300,150);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
