package week9;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class Demo4_8 extends Application {
    private int count;
    private Text text;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Push counter");

        text = new Text();
        text.setText("Pushers : 0");
        Button button = new Button("Push Me!");
        //button.setMinWidth(50);

        //button.setOnAction(this::processButtonPress);
        button.setOnAction((event) -> {
            count++;
            text.setText("Pushers :" + count);
        });

        FlowPane flowPane = new FlowPane(button,text);
        flowPane.setAlignment(Pos.CENTER);
        flowPane.setStyle("-fx-background-color: cyan");
        flowPane.setHgap(20);
        //flowPane.layout();


        Scene scene = new Scene(flowPane,300,100);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void processButtonPress(ActionEvent actionEvent) {
        count++;
        text.setText("Pushes: " + count);
    }
}
