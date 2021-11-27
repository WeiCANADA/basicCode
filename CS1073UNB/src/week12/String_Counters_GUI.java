package week12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Wei Liu
 * @version V1.0
 */
public class String_Counters_GUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text;
        TextField textField;
        @Override
        public void start(Stage primaryStage) throws Exception {
            Label label = new Label(" ...");
            textField = new TextField();
            Button b1 = new Button(" ... ");
            b1.setOnAction((event) ->{
                //.....
            });
            Button b2 = new Button("...");
            b2.setOnAction(this::processButtonEvent);
            text = new Text("...");
            FlowPane flowPane = new FlowPane(label, textField, b1, b2, text);
            flowPane.setPadding(new Insets(40,40,40,40));
            flowPane.setAlignment(Pos.CENTER);
            flowPane.setHgap(20);
            flowPane.setVgap(20);
            flowPane.setPrefWidth(300);
            flowPane.setPrefHeight(400);

            Scene scene = new Scene(flowPane);
            scene.setOnKeyTyped(this::processKeyTyped);
            primaryStage.setScene(scene);
            primaryStage.setTitle("...");
            primaryStage.show();
        }

        public void processButtonEvent(ActionEvent event) {

        }

        public void processKeyTyped(KeyEvent keyEvent) {
            processButtonEvent();
        }

    }
}
