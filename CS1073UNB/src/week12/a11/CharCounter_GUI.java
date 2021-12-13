package week12.a11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Wei Liu
 */
public class CharCounter_GUI extends Application {
    Text text;
    TextField textField;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label label = new Label(" Enter a word or phrase:");
        textField = new TextField();
        textField.setOnKeyPressed(this::processKeyTyped);
        Button b1 = new Button(" Submit");
        b1.setOnAction(this::processButtonEvent);
        text = new Text("Let me help you identify the most frequently used letter!");
        FlowPane flowPane = new FlowPane(label, textField, b1, text);
        flowPane.setAlignment(Pos.CENTER);
        flowPane.setPrefWidth(400);
        flowPane.setPrefHeight(100);

        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Most Frequent Letter Identifier");
        primaryStage.show();
    }

    private void processButtonEvent(ActionEvent event) {
        String str = CharCounter.counter(textField.getText());
        text.setText("The most frequently occurring letter is: " + str.charAt(0));

    }

    public void processKeyTyped(KeyEvent keyEvent) {
        if (keyEvent.getCode().getName().equals(KeyCode.ENTER.getName())) {
            String str = CharCounter.counter(textField.getText());
            if (str.matches("[A-Za-z]"))
                text.setText("The most frequently occurring letter is: " + str);
            else
                text.setText("Error: The input text contains no letters.");
        }
    }
}
