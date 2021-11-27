package week12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * A10 Q2
 * a GUI that can be used to test the methods in the Converter class.
 *
 * @author Wei Liu
 */
public class ConverterUI extends Application {
    Text text;
    TextField textField;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Enter a binary or English word or phrase:");
        textField = new TextField();
        Button binary_to_decimal = new Button("Binary to Decimal");
        binary_to_decimal.setOnAction((event) ->{
            int i = String_Converter.bin2Decimal(textField.getText());
            if(i == -1){
            text.setText("Invalid binary input");
            }else {
                text.setText(String.valueOf(i));
            }
           // textField.clear();
        });
        Button english_to_encrypted = new Button("English to encrypted");
        english_to_encrypted.setOnAction((event) ->{
            text.setText(String_Converter.english2encrypted(textField.getText()));
            //textField.clear();
        });
        text = new Text("Welcome to the Converter App!");
        FlowPane flowPane = new FlowPane(label, textField, binary_to_decimal, english_to_encrypted, text);
        flowPane.setPadding(new Insets(40,40,40,40));
        flowPane.setAlignment(Pos.CENTER);
        flowPane.setHgap(20);
        flowPane.setVgap(20);

        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Converter App");
        primaryStage.setWidth(350);
        primaryStage.setHeight(400);
        primaryStage.show();

    }
}
