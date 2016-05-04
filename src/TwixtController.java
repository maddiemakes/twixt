import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

public class TwixtController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private GridPane twixtGridPane;

    @FXML
    void initialize() {
        assert twixtGridPane != null : "fx:id=\"twixtGridPane\" was not injected: check your FXML file 'twixtBoard.fxml'.";

    }
}
