import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
public class Smiley3 extends Application{
public static void main(String[] args) {
launch(args);
}
@Override //DONT MAKE ANY CHANGES HERE
public void start(Stage primaryStage) {
primaryStage.setTitle("Drawing Operations Test");
Group root = new Group();
Canvas canvas = new Canvas(500, 500);
GraphicsContext gc = canvas.getGraphicsContext2D();
drawShapes(gc);
root.getChildren().add(canvas);
primaryStage.setScene(new Scene(root));
primaryStage.show();
}
//Write all changes to code in this method.
public void drawShapes(GraphicsContext gc){
//Upper-left point (200, 200)
gc.setFill(Color.YELLOW);         // yellow face
gc.fillOval(200, 200, 200, 200);
// white eyes
// black pupils
// tongue
// smile; black under layer
// smile; yellow over layer
// tongue--black line
// hat brim
gc.setFill(Color.BLACK);
gc.fillRect(00,500,10,10);

// hat top
// red stuff on hat
gc.restore();
}
}