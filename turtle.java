import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Animal implements Freezable
{
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter;
    public turtle(){
        counter = 300;
    }
    public void act()
    {
        freeze();
        lookForLobster();
    }
    public void freeze(){
        counter --;
        if( counter <= 150 )
        {
            super.act();
            move(1);
        }
        if( counter <= 0 )
            counter= 300;
        }
        public void lookForLobster(){
            if( isTouching( lobster.class))
            {
               removeTouching(lobster.class);
            }
        }
    
  
}
