import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Crab c=new Crab();
    Actor act;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Crab(), 100,100);
        addObject(new Lobster(), 500,500);
        addObject(new ScoreBoard(), 500,30);
        addObject(new Turtle(), 300,300);
          int bana,ba;
             Actor actor;
             Actor Worm;
             int k=11;
             
           while(k>0){
              try{Thread.sleep(30);
             ba=Greenfoot.getRandomNumber(400);
             bana=Greenfoot.getRandomNumber(400);
              addObject(new Worm(), ba, bana);
              k=k-1;
            }
              catch(Exception e){
                  System.out.println("Error");
                  break;
                }
    }
   
   
}
    public void add(){
          if(Greenfoot.getRandomNumber(100) < 10)
        {
            act.turn(Greenfoot.getRandomNumber(90));
     
        if(c.score==20){
        addObject(new Lobster(), 300,300);
    }
    if(c.score==40) {
        addObject(new Lobster(), 450,450);
    }
    if(c.score==30){
        addObject(new Turtle(), 500,500);
    
    }
}
}
}