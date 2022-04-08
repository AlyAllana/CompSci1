import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import java.util.Random;

public class Unit2MajorLab extends Application{
    public static void main(String[] args) {
        launch(args);
        }
    
    @Override //DONT MAKE ANY CHANGES HERE
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1500, 1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        }
    
    public void drawShapes(GraphicsContext gc){
        int randomR = (int)(Math.random()* 256);
        int randomG = (int)(Math.random()* 256);
        int randomB = (int)(Math.random()* 256);
        
        //Circle
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.fillArc(50, 130, 300, 300, 0, 360, ArcType.CHORD);
        
        
        //Ellipse
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.fillOval(760,400, 700, 300);
        
        
       
        //Rectangle 
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.fillRect (50,580,600,400);
        
        
        
        //Triangle 
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.setStroke(Color.rgb(randomR, randomG, randomB));
        gc.setLineWidth(5);
        gc.strokeLine(850, 130, 1029, 355);
        gc.strokeLine(850, 130, 655, 355);
        gc.strokeLine(655, 355, 1029, 355);
       



        gc.restore();
    }
}
