package javafx.stage;

import javafx.application.Application;
import javafx.scene.image.Image;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-11-04 4:30 p.m.
 */
public class StageDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
       // Stage stage = new Stage(StageStyle.UTILITY);//constructor1
        Stage stage = new Stage();//constructor 2


        stage.setTitle("MyState");//
        stage.initStyle(StageStyle.UNIFIED);
        //stage.initStyle(StageStyle.UTILITY);
        //change Icon
        stage.getIcons().add(new Image("/icons/zxc.jpg"));

        //最小化窗口
        stage.setIconified(false);
        stage.show();
    }

}
