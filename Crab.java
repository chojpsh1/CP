import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{ int score;
    int speed=3;
    Actor Worm;
        World world;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int xpos = getX();
        int ypos = getY();
           world=getWorld();
        Worm = getOneObjectAtOffset(0, 0, Worm.class);
         if ( Worm != null)
        {
            world.removeObject(Worm);
    }
        if(Greenfoot.isKeyDown("up")) {
            setRotation(60);
            move(3);
            ypos -= speed;
        }
        if(Greenfoot.isKeyDown("down")) {
            setRotation(300);
            move(3);
            ypos += speed;
        }    
        if(Greenfoot.isKeyDown("left")) {
            setRotation(270);
            xpos -= speed;
        }
        if(Greenfoot.isKeyDown("Right")) {
            setRotation(90);
            xpos += speed;
        }
        setLocation(xpos, ypos);

    
        if ( isTouching (Lobster.class) )
        {
            Greenfoot.stop();
            System.out.println("게임 오버");
    }
}

public void addScore(){
    world=getWorld();
        Worm = getOneObjectAtOffset(0, 0, Worm.class);
    if( Worm != null){
        score+=10;
    }
    }
}
