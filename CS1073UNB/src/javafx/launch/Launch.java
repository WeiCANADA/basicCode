package javafx.launch;

import com.sun.javafx.application.LauncherImpl;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-11-04 3:21 p.m.
 */
public class Launch extends Application {
    public static void main(String[] args) {
        //第一种launch way
       // Application.launch(Launch.class,args);
        //第二种 launch way
       // launch(args);
        //The third way
        Application.launch(Launch1.class,args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World");
        primaryStage.show();

    }
}
