import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class TwixtController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private GridPane twixtGridPane;

    Integer colIndex;
    Integer rowIndex;
    @FXML
    void initialize() {
    }
    private void mouseEvent(MouseEvent e, Node source) {
        colIndex = GridPane.getColumnIndex(source);
        rowIndex = GridPane.getRowIndex(source);
        if(colIndex == null) {
            colIndex = 0;
        }
        if(rowIndex == null) {
            rowIndex = 0;
        }
    }
    @FXML
    void handleOnMouseEnter(MouseEvent event) {
        Node source = (Node) event.getSource();
        mouseEvent(event, source);
        source.setStyle("-fx-background-color : grey");
    }

    @FXML
    void handleOnMouseExit(MouseEvent event) {
        Node source = (Node) event.getSource();
        source.setStyle("-fx-background-color : white");
    }
}
