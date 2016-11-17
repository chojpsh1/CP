import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{   Actor Lobster;
    World world;
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         world=getWorld();
        Lobster = getOneObjectAtOffset(0, 0, Lobster.class);
         if ( Lobster != null)
        {
            world.removeObject(Lobster);
    }
      
        if(Greenfoot.getRandomNumber(100) <= 10)
        {
            turn(Greenfoot.getRandomNumber(90));
            move(1);
    }   
        
        if(Greenfoot.getRandomNumber(100)<=95){
           move(1);
    }    
}
public void freeze()
{
if(Greenfoot.getRandomNumber(100) > 98)
        {   
             try{
                 Thread.sleep(2000);
               
        }
        catch(Exception e){
            System.out.println("error occur");
        }
    }   
}
}