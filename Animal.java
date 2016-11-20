import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        turnAtEdge();
        randomTurn();
    } 
        public void turnAtEdge()
    {
        if( isAtEdge() )
        {
            turn( 17 );
        }
    }
    public void randomTurn()
    {
        if( Greenfoot.getRandomNumber(100) < 10 )
        {
            turn( Greenfoot.getRandomNumber(90) - 45);
        }
    }
    public void game(boolean compr)
    {
        if(!compr)
        {
            getWorld().addObject(new restart(), 310, 230 );
            getWorld().addObject(new gameover(), 301, 125 );
        }
        else
        {
            getWorld().showText("You Win!",301,125);
            getWorld().addObject( new restart(),310,230);
        }
    }
}