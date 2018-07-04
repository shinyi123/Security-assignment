
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class mainPage extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        page cPage = new page();
        Pane pane = new Pane();
        HBox hbox = new HBox();
        Button btn1 = new Button("Encryption");
        Button btn2 = new Button("Dycryption");
        btn1.setPrefSize(150, 50);
        btn2.setPrefSize(150, 50);

        btn1.setOnAction(e -> {
            cPage.start(stage);
        });
        btn2.setOnAction(e -> {

        });

        pane.autosize();
        hbox.setPadding(new Insets(30));
        hbox.setAlignment(Pos.CENTER);
        hbox.autosize();
        hbox.getChildren().addAll(btn1, btn2);
        pane.getChildren().add(hbox);
        Scene scene = new Scene(pane, 500, 700);
        stage.setScene(scene);
        stage.setTitle("Security Assignment");
        stage.show();
    }
}
