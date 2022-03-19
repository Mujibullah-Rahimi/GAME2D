package no.hiof.game2d;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;


public class Panel {

    public static void createCanvas(String title, int height, int width) {
        Stage stage = new Stage();
        stage.setTitle(title);
        Group root = new Group();

        javafx.scene.canvas.Canvas canvas = new javafx.scene.canvas.Canvas(height,width);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        root.getChildren().add(canvas);
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void setRefreshRate(){}

}
