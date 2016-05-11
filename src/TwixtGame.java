import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by spamntaters on 5/11/16.
 */
public class TwixtGame extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    static Scene scene;
    static Stage primary;

    @Override
    public void start(Stage primary) throws Exception {
        this.primary = primary;
        primary.setHeight(590);
        Parent root = FXMLLoader.load(getClass().getResource("twixtBoard.fxml"));
        scene = new Scene(root);
        primary.setScene(scene);
        primary.setTitle("Boggle");
        primary.show();
    }
}
