import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class worm extends Animal
{
    int count = 350;
    /**
     * Act - do whatever the worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       count --;
       if( count <= 100 )
       {
           getWorld().addObject(new worm(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
           
           getWorld().removeObject(this);
        }
        if( count == 0 )
        {
            count = 350;
            getWorld().addObject(new worm(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
            
        }
    }    
}
