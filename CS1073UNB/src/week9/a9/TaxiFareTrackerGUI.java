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
 * This is a graphical taxi fare tracker application
 *
 * @author Wei Liu
 */
public class TaxiFareTrackerGUI extends Application {
    private double total = 0;
    TextField textField;
    TextField textField1;
    Text text;
    Text text1;
    Text text2;
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //Nodes
        Label label = new Label("Trip Distance(in km):");
        Label label1 = new Label("Number of Passengers:");
        Button calB = new Button("Calculate");
        calB.setOnAction(event -> {
            double distance = Double.parseDouble(textField.getText());
            double fare = 4.95 + 1.5 * distance + 2 * (Integer.parseInt(textField1.getText()) - 1);
            total += fare;
            text1.setText("Taxi Fare Summary Report: " + nf.format(fare));
            text2.setText("Shift Total(All Trips: " + nf.format(total));
        });
        Button reSetB = new Button("Reset");
        reSetB.setOnAction(event -> {
            total = 0;
            textField.clear();
            textField1.clear();
            text.setText("Enter the trip information.");
            text1.setText("Taxi Fare for this Trip: ");
            text2.setText("Shift Total(All Trips: ");
        });
        textField = new TextField();
        textField.setPrefWidth(40);
        textField1 = new TextField();
        textField1.setPrefWidth(40);
        text = new Text("Enter the trip information");
        text1 = new Text("Taxi Fare for this Trip:");
        text2 = new Text("Shift Total(All Trips:)");
        //LayOut
        FlowPane flowPane = new FlowPane(20, 10, label, textField, label1, textField1, calB, reSetB, text, text1, text2);
        flowPane.setPadding(new Insets(40, 20, 20, 20));
        flowPane.setStyle("-fx-background-color: #32cdac");
        flowPane.setColumnHalignment(HPos.LEFT);
        //Scene
        Scene scene = new Scene(flowPane);
        //State
        primaryStage.setTitle("                  Taxi Fare Tracker");
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setHeight(300);
        primaryStage.setWidth(250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
