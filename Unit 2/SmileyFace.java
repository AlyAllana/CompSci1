import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
public class SmileyFace extends Application{
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
        gc.setFill(Color.WHITE);
        gc.fillArc(225,264,38,36,360,360, ArcType.ROUND);
        gc.fillArc(332,264,38,36,360,360, ArcType.ROUND);
        // black pupils
        gc.setFill(Color.BLACK);
        gc.fillArc(236,276,16,14,360,360, ArcType.ROUND);
        gc.fillArc(340,276,16,14,360,360, ArcType.ROUND);
        // smile; black under layer
        gc.fillArc(245,319,101,37,180,180, ArcType.ROUND);
        // smile; yellow over layer
        gc.setFill(Color.YELLOW);
        gc.fillArc(245,313,101,37,180,180, ArcType.ROUND);
        // hat brim
        gc.setFill(Color.BLACK);
        gc.fillRect(126,186, 337, 54);
        // hat top
        gc.setFill(Color.BLACK);
        gc.fillRect(192,29, 209, 142);
        // red stuff on hat
        gc.setFill(Color.RED);
        gc.fillRect(192,158,209,28);
        // tongue
        gc.setFill(Color.RED);
        gc.fillArc(261,316,70,68,0,-183, ArcType.OPEN);
        
        gc.restore();
    }
}