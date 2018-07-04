
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ceaser extends BorderPane {

    TextField tf[] = new TextField[3];
    HBox hbox = new HBox();
    ceaserMethod mthod = new ceaserMethod();
    int i;

    public void start(Stage stage) {
        page pg = new page();
        BorderPane bp = new BorderPane();
        Pane pane = new Pane();
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(20));
        for (i = 0; i < 2; i++) {
            vbox.getChildren().add(method(i));
        }

        pane.getChildren().addAll(vbox);
        Button btn = new Button("OK");
        Button btn1 = new Button("Back");
        btn1.setOnMouseClicked(e -> {
            pg.start(stage);
        });

        RadioButton rb = new RadioButton("Left shift");
        RadioButton rb1 = new RadioButton("Right shift");
        rb.setUserData("Left");
        rb1.setUserData("Right");
        ToggleGroup grp = new ToggleGroup();
        rb.setToggleGroup(grp);
        rb1.setSelected(true);
        rb1.setToggleGroup(grp);
        rb.setPadding(new Insets (10));
        rb1.setPadding(new Insets (10));
        HBox hb3 = new HBox();
        hb3.getChildren().addAll(rb, rb1);
        TextField tft = new TextField();
        tft.setMaxSize(240, 120);
        tf[0].textProperty().addListener((observable, oldValue, newValue) -> {
            tf[1].setText(mthod.setCeaser(tf[0].getText(), tft.getText(), grp.getSelectedToggle().getUserData().toString()));
        });
        tf[1].textProperty().addListener((observable, oldValue,newValue)->{
            tf[0].setText(mthod.Leftdecrypt(tf[1].getText(), tft.getText(), grp.getSelectedToggle().getUserData().toString()));
        });
        VBox vb = new VBox();
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(btn, btn1);
        hb2.setSpacing(30.0);
        hb2.setPadding(new Insets(50));
        hb3.setPadding(new Insets(50));
        vb.getChildren().addAll(hb3, tft);
        vb.setPadding(new Insets(90));
        bp.setTop(vb);
        bp.setCenter(pane);
        bp.setBottom(btn1);
        Scene scene = new Scene(bp);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

    }

    public HBox method(int i) {
        String[] list = {"Enter the plaintext:", "Your cipher text:"};
        Label lb = new Label(list[i]);
        lb.setMinSize(120, 20);
        tf[i] = new TextField();
        HBox hb1 = new HBox();
        hb1.setPadding(new Insets(20));
        hb1.getChildren().addAll(lb, tf[i]);
        hb1.setSpacing(30);
        return hb1;
    }
}
