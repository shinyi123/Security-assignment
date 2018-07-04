
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class page extends Pane {

    public static void main(String[] args) {

    }

    public void start(Stage stage) {
        ceaser c = new ceaser();
        Pane pane = new Pane();
        HBox hbox = new HBox();

        hbox.setSpacing(20);
        Button btn1 = new Button("Ceaser Cipher");
        Button btn2 = new Button("");
        Button btn3 = new Button("");
        btn1.setMinSize(60, 40);
        btn2.setMinSize(60, 40);
        btn3.setMinSize(60, 40);

        btn1.setOnMouseClicked(e -> {
            c.start(stage);

        });
        btn2.setOnMouseClicked(e -> {

        });
        btn3.setOnMouseClicked(e -> {

        });

        hbox.getChildren().addAll(btn1, btn2, btn3);
        pane.getChildren().add(hbox);
        pane.autosize();

        Scene scene = new Scene(pane, 500, 300);
        stage.setScene(scene);
        stage.setTitle("Ceaser Cipher");
        stage.show();
    }
}
