package week9;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-11-05 12:57 p.m.
 */
public class FahrenheitPane extends GridPane {
    private Label result;
    private TextField fahrenheit;
    public FahrenheitPane(){
        Font font = new Font(18);

        Label label = new Label("Fahrenheit : ");
        label.setFont(font);
        //label.setAlignment(Pos.CENTER);
        GridPane.setHalignment(label, HPos.RIGHT);
        Label label1 = new Label("Celsius : ");
        label1.setFont(font);
        //label1.setAlignment(Pos.CENTER);
        GridPane.setHalignment(label1, HPos.RIGHT);

        result = new Label("---");
        result.setFont(font);
        //result.setAlignment(Pos.CENTER);
        GridPane.setHalignment(result, HPos.CENTER);

        fahrenheit = new TextField();
        fahrenheit.setFont(font);
        fahrenheit.setPrefWidth(50);
        fahrenheit.setAlignment(Pos.CENTER);
      setHgap(20);
      setVgap(10);
      setStyle("-fx-background-color: yellow");
        fahrenheit.setOnAction((event) ->{
            int fahrenheitTemp = Integer.parseInt(fahrenheit.getText());
            int CelsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
            result.setText(CelsiusTemp + "");
        });

        add(label, 0,0 );
        add(label1, 0,1 );
        add(fahrenheit, 1,0 );
        add(result,1,1);
    }
}
