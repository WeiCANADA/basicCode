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

public class ClassB_GUI extends Application {
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
        b2.setOnAction((event) ->{
            text.setText("...");
        });
        text = new Text("...");
        FlowPane flowPane = new FlowPane(label, textField, b1, b2, text);
        flowPane.setPadding(new Insets(40,40,40,40));
        flowPane.setAlignment(Pos.CENTER);
        flowPane.setHgap(20);
        flowPane.setVgap(20);

        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("...");
        primaryStage.setWidth(350);
        primaryStage.setHeight(400);
        primaryStage.show();
    }
}
