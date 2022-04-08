import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import java.util.Random;

public class BoxesOne extends Application{
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
    
    public void drawShapes(GraphicsContext gc){
        int posX = (int)(Math.random() * 400); 
        int posY = (int)(Math.random() * 400); 
        


        //Upper-left point (200, 200)

        //box one
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        gc.setFill (Color.YELLOW);
        gc.fillRect((posX),(posY),100,100);

        //box two
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        gc.setFill (Color.MEDIUMPURPLE);
        gc.fillRect((posX),(posY),100,100);


        //box three
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        gc.setFill (Color.RED);
        gc.fillRect((posX),(posY),100,100);


        //box four
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        gc.setFill (Color.CADETBLUE);
        gc.fillRect((posX),(posY),100,100);

        //box five
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        gc.setFill (Color.LIME);
        gc.fillRect((posX),(posY),100,100);

        //box six
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        gc.setFill (Color.BROWN);
        gc.fillRect((posX),(posY),100,100);

        //box seven
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        gc.setFill (Color.DARKGREEN);
        gc.fillRect((posX),(posY),100,100);


        //box eight 
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        gc.setFill (Color.BLUE);
        gc.fillRect((posX),(posY),100,100);






gc.restore();
        }
}
