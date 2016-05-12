import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class TwixtController {

    Integer colIndex;
    Integer rowIndex;
    private ImageInput emptyDot = new ImageInput(new Image("file:images/emptyDot.png"),-9.5,-1.0);
    private ImageInput redDot = new ImageInput(new Image("file:images/redDot.png"),-9.5,-1.0);
    private ImageInput blueDot = new ImageInput(new Image("file:images/blueDot.png"),-9.5,-1.0);

    //empty dot is 0; red dot is 1; blue dot is 2
    int[][] dots = new int[24][24];

    //maybe make this some kind of map that maps colors and stuff?
    private String playerColor = "red";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private GridPane twixtGridPane;

    @FXML
    void initialize() {
        for (int k=0; k<23; k++) {
            for (int j=0; j<23; j++) {
                dots[k][j] = 0;
            }
        }
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
        if (dots[colIndex][rowIndex] == 0) {
            switch (playerColor) {
                case "blue":
                    source.setEffect(blueDot);
                    break;
                case "red":
                    source.setEffect(redDot);
                    break;
            }
        }
    }

    @FXML
    void handleOnMouseExit(MouseEvent event) {
        Node source = (Node) event.getSource();
        if (dots[colIndex][rowIndex] == 0) {
            source.setEffect(emptyDot);
        }
    }

    @FXML
    void handleOnMouseClick(MouseEvent event) {
//        Node source = (Node) event.getSource();
        if (dots[colIndex][rowIndex] == 0) {
            switch (playerColor) {
                case "red":
                    dots[colIndex][rowIndex] = 1;
                    playerColor = "blue";
                    break;
                case "blue":
                    dots[colIndex][rowIndex] = 2;
                    playerColor = "red";
                    break;
            }
        }
    }
}
