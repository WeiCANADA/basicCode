package week9.a9;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.text.NumberFormat;

/**
 * This Class represent a Pass Calculator GUI
 *
 * @author: Wei Liu
 */
public class PassGUI extends Application {
    TextField textField;
    TextField textField1;
    TextField textField2;
    A9_Pass halfDayA9Pass;
    A9_Pass fullDayA9Pass;
    Text text;
    Text text1;
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Nodes
        Label label = new Label("Owner Name:");
        Label label1 = new Label("Number of Training Modules:");
        Label label2 = new Label("Number of Grooming Sessions:");

        Button hB = new Button("Half-Day");
        hB.setOnAction(event -> {
            halfDayA9Pass = new HalfDayA9Pass(textField.getText(), Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
            text.setText("Canine Cottage Number: " + halfDayA9Pass.numCottage());
            text1.setText("Total cost of pass: " + nf.format(halfDayA9Pass.calCost()));
        });

        Button fB = new Button("Full-day");
        fB.setOnAction(event -> {
            fullDayA9Pass = new FullDayA9Pass(textField.getText(), Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
            text.setText("Canine Cottage Number: " + fullDayA9Pass.numCottage());
            text1.setText("Total cost of pass: " + nf.format(fullDayA9Pass.calCost()));
        });

        Button clearB = new Button("Clear");
        clearB.setOnAction(event -> {
            textField.clear();
            textField1.clear();
            textField2.clear();
            text.setText("Welcome to Barks & Recreation!");
            text1.setText("Enter your pass information");
        });

        textField = new TextField();
        textField.setPrefWidth(130);
        textField1 = new TextField();
        textField1.setPrefWidth(40);
        textField2 = new TextField();
        textField2.setPrefWidth(40);
        text = new Text("Welcome to Barks & Recreation!");
        text1 = new Text("Enter your pass information");
        FlowPane flowPane = new FlowPane(20, 10, label, textField, label1, textField1, label2, textField2, hB, fB, clearB, text, text1);
        flowPane.setPadding(new Insets(40, 20, 20, 30));
        flowPane.setStyle("-fx-background-color: #32cdac");
        flowPane.setColumnHalignment(HPos.LEFT);
        //Scene
        Scene scene = new Scene(flowPane);
        //State
        primaryStage.setTitle("                  6-Month Pass Calculator");
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setHeight(300);
        primaryStage.setWidth(300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
