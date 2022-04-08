import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import java.util.Random;

public class BoxesThree extends Application{
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
        int randomWidth = (int)(20 + Math.random() * 100);
        int randomHeight = (int)(20 + Math.random() * 100);
        int randomR = (int)(Math.random()* 256);
        int randomG = (int)(Math.random()* 256);
        int randomB = (int)(Math.random()* 256);


        //Upper-left point (200, 200)

        //box one
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400);
        randomWidth = (int)(20 + Math.random() * 100);
        randomHeight = (int)(20 + Math.random() * 100);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.fillRect((posX),(posY),randomWidth,randomHeight);

        //box two
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        randomWidth = (int)(20 + Math.random() * 100);
        randomHeight = (int)(20 + Math.random() * 100);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.fillRect((posX),(posY),randomWidth,randomHeight);


        //box three
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400);
        randomWidth = (int)(20 + Math.random() * 100);
        randomHeight = (int)(20 + Math.random() * 100);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.fillRect((posX),(posY),randomWidth,randomHeight);


        //box four
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        randomWidth = (int)(20 + Math.random() * 100);
        randomHeight = (int)(20 + Math.random() * 100);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.fillRect((posX),(posY),randomWidth,randomHeight);

        //box five
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        randomWidth = (int)(20 + Math.random() * 100);
        randomHeight = (int)(20 + Math.random() * 100);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.fillRect((posX),(posY),randomWidth,randomHeight);

        //box six
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400); 
        randomWidth = (int)(20 + Math.random() * 100);
        randomHeight = (int)(20 + Math.random() * 100);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.fillRect((posX),(posY),randomWidth,randomHeight);

        //box seven
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400);
        randomWidth = (int)(20 + Math.random() * 100);
        randomHeight = (int)(20 + Math.random() * 100);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.fillRect((posX),(posY),randomWidth,randomHeight);


        //box eight 
        randomR = (int)(Math.random()* 256);
        randomG = (int)(Math.random()* 256);
        randomB = (int)(Math.random()* 256);
        posX = (int)(Math.random() * 400); 
        posY = (int)(Math.random() * 400);
        randomWidth = (int)(20 + Math.random() * 100);
        randomHeight = (int)(20 + Math.random() * 100);
        gc.setFill (Color.rgb(randomR, randomG, randomB));
        gc.fillRect((posX),(posY),randomWidth,randomHeight);






gc.restore();
        }
}
