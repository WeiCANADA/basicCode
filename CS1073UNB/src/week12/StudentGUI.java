package week12;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.text.NumberFormat;

public class StudentGUI extends Application {
    private Button tuition;
    private Button tuitionScholar;
    private Button clear;
    private TextField name;
    private TextField id;
    private TextField courses;
    private TextField scholar;
    private Text out;
    private NumberFormat nf;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        nf= NumberFormat.getCurrencyInstance();
         primaryStage.setTitle("Tuition Calculator");
        Text message = new Text("Welcome to the Tuition Calculator\t");
         message.setFont(new Font(18));
         tuition = new Button("Tuition");
         tuition.setMinWidth(100);
         tuition.setOnAction(this::eventHandler);
         tuitionScholar = new Button("tuitionScholar");
        tuitionScholar.setOnAction(this::eventHandler);
        clear = new Button("Clear");
        clear.setOnAction((event) ->{
            name.clear();
            id.clear();
            courses.clear();
            scholar.clear();
        });

        Label nameField = new Label("Name: ");
        name = new TextField();

        Label idField = new Label("Student ID: ");
        id = new TextField();
        Label coursesField = new Label("Number of Courses: ");
        courses = new TextField();

        Label scholarField = new Label("The Amount of Scholar: ");
        scholar = new TextField();
        out = new Text("Out: ");

        FlowPane myPane = new FlowPane(message,  nameField, name, idField, id,
                coursesField, courses, scholarField, scholar, tuition, tuitionScholar, out, clear);
        myPane.setHgap(10);
        myPane.setVgap(20);
        myPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(myPane, 350, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void eventHandler(ActionEvent event) {
        String name = this.name.getText();
        int id = Integer.parseInt(this.id.getText());
        int courses = Integer.parseInt(this.courses.getText());


        if(event.getSource() == tuition) {
            out.setText("Out: "+ name + " " + id + " " + nf.format(courses* 850));
        }
        if(event.getSource() == tuitionScholar) {
            double scholarNum = Double.parseDouble(scholar.getText());
            out.setText("Out: " + name + " "+ id + " " +
                    nf.format(courses * 850 -scholarNum) );
        }
    }
}
