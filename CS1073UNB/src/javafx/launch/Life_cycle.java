package javafx.launch;

import javafx.application.Application;
import javafx.stage.Stage;

/**

 */
public class Life_cycle extends Application {
    @Override
    public void init() throws Exception {
       // super.init();
        System.out.println("init()"+ Thread.currentThread().getName());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println("start()" + Thread.currentThread().getName());
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        //super.stop();
        System.out.println("stop()" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("main() + Thread.currentThread()"+ Thread.currentThread().getName());
        launch(args);

    }
}
