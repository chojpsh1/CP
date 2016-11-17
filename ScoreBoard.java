import greenfoot.*; 
import java.awt.*;

public class ScoreBoard extends Actor
{   public GreenfootImage board;
    private GreenfootImage sb;
    Crab c=new Crab();
    public String label = "Score: ";
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        board = new GreenfootImage(120, 30);
       
        board.setTransparency(125);
        board.fillRect(0,0, 120,30);
        this.setImage(board);
        update();
        board.drawImage(new GreenfootImage(label + c.score, 16, Color.BLACK, Color.WHITE), 25,5);
    } 
    public int getScore(){
        return c.score;
    }
    public void update(){
       sb = new GreenfootImage(board);
        sb.drawImage(new GreenfootImage(label + c.score, 10, Color.BLACK, Color.WHITE), 25,5);
    }
}