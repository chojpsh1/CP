import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lobster extends Animal
{
    /**
     * Act - do whatever the lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        turnAtEdge();
        randomTurn();
        move(5);
        lookForCrab();
    }    
    
    public void lookForCrab()
    {
        if( isTouching(crab.class) )
        {
            removeTouching( crab.class );
            game(false);
        }
    }
}
