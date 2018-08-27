import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.lang.*;

/**
 * Class BallDemo - provides a demonstration of the
 * BouncingBall and Canvas classes. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2010.11.30
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;
    private static final int distBorda = 20;
    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", WIDTH, HEIGHT);
        myCanvas.setVisible(true);
    }
 
    /**
     * Simulate two bouncing balls
     */
    public void bounce()
    {
        Dimension dimension = new Dimension(myCanvas.getSize());
        int largura = (int)dimension.getWidth();
        int altura = (int)dimension.getHeight();
        
        int ground = altura - 3*distBorda;   // position of the ground line
        int xStart = 2*distBorda;    // x-start of the ground line
        int xLimit = largura - 3*distBorda;   // x-limit of the ground line

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(xStart, ground, xLimit, ground);

        // Number of balls
        int numBalls = 0;
        while(numBalls <= 0){
            Scanner leitor = new Scanner(System.in);
            System.out.println("How many balls do you want appear in the canvas?");
            numBalls = leitor.nextInt();
            if(numBalls<=0){
                System.out.println("INVALID NUMBER!!! You need to insert a positive value");
            }
        }
        
        //adding balss in a collection
        ArrayList<BouncingBall> balls = new ArrayList<BouncingBall>(numBalls);
        Random rand = new Random();
        for(int i = 0; i < numBalls; i++){
           int tmp = rand.nextInt(200)+1;
           int r = rand.nextInt(255);
           int g = rand.nextInt(255);
           int b = rand.nextInt(255);
           Color color = new Color(r, g, b);
           BouncingBall ball = new BouncingBall(xStart, Math.max((altura/2)-tmp, 30), 16, color, ground, myCanvas);
           balls.add(i, ball);
           ball.draw();
        }
         
        // Make them bounce until all have gone beyond the xLimit.
        boolean finished =  false;
        int aux = 0;
        while(finished == false) {
            myCanvas.wait(50);           // small delay
            for(int i = 0; i < balls.size(); i++){
                balls.get(i).move();
                // stop once ball has travelled a certain distance on x axis
                if(balls.get(i).getXPosition() >= xLimit) {
                    aux++;;
                    balls.get(i).erase();
                }
                if(aux == balls.size()){
                    finished = true;
                }
            }
        }
	myCanvas.erase();
    }
    
    /**
     * Draw a frame in the canvas
     * @author Gabriel Igor
     */
    public void drawFrame(){
        myCanvas.erase();
        Dimension dimension = new Dimension(myCanvas.getSize());
        int largura = (int)dimension.getWidth();
        int altura = (int)dimension.getHeight();
        Rectangle rectangle = new Rectangle(distBorda, distBorda, largura-2*distBorda, altura-2*distBorda);
        myCanvas.draw(rectangle);
    }
}
