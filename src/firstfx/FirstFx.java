package firstfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class FirstFx extends Application {
    @Override
    public void start(Stage stage) throws Exception {
      Button b = new Button("Click Me");
        FlowPane fp = new FlowPane();
        fp.getChildren().add(b);
      Scene sc = new Scene(fp);

      stage.setScene(sc);
      stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }


}
