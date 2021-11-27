package javafx.layOut;
/*
* 将 DialogPane 添加到一个Button event， 练习其方法
*
* */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Wei Liu
 * @version V1.0
 * @date
 */
public class JaveFX_Layout_DialogPane extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button testB = new Button("test");

        testB.setOnAction((event) ->{
            DialogPane dialogP = new DialogPane();
            dialogP.setHeaderText("Header");
            dialogP.setContentText("Content");
            dialogP.getButtonTypes().add(ButtonType.APPLY);
            Button apply = (Button) dialogP.lookupButton(ButtonType.APPLY);
            dialogP.getButtonTypes().add(ButtonType.PREVIOUS);
            dialogP.getButtonTypes().add(ButtonType.CANCEL);
            dialogP.setExpandableContent(new Text("this is Expand"));
            dialogP.setExpanded(true);
            dialogP.setGraphic(new ImageView("icons/zxc.jpg"));
            Scene sc = new Scene(dialogP);
            Stage stage = new Stage();
            stage.setScene(sc);
            stage.setTitle("jumping out window");
            stage.setAlwaysOnTop(true);
            stage.initStyle(StageStyle.UTILITY);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(primaryStage);
            stage.show();

        });
        AnchorPane an = new AnchorPane();
        AnchorPane.setTopAnchor(testB, 100.0);
        AnchorPane.setLeftAnchor(testB, 100.0);
        an.setStyle("-fx-background-color: #ffffff");
        an.getChildren().add(testB);


        Scene scene = new Scene(an);
        primaryStage.setScene(scene);
        primaryStage.setTitle("DialogPane Demo");
        primaryStage.setHeight(400);
        primaryStage.setWidth(300);
        primaryStage.show();


    }
}
