import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crab extends Animal
{
    int score =0;
    int antilob = 0;
    /**
     * Act - do whatever the crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       
        move(5);
        turnAtEdge();
        randomTurn();
        if( Greenfoot.isKeyDown("left") )
        {
            turn( -4 );
        }
        if( Greenfoot.isKeyDown("right") )
        {
            turn( 4 );
        }

        lookForWorm();
        calllobster();
        win();
    }    
    
    public void addScore()
    {
        score += 10;
    }
        
    public void lookForWorm()
    {
        if( isTouching(worm.class) )
        {
            addScore();
            getWorld().showText("score : " + score,535,40);
            removeTouching(worm.class);
            getWorld().addObject(new worm(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
    public void calllobster()
    {
        if( score >= 100 && antilob == 0)
        {
            antilob ++;
            getWorld().addObject( new lobster(), 50, 200 );
        }
        if( score >= 200 && antilob == 1 )
        {
            antilob ++;
            getWorld().addObject( new lobster(), 10, 28 );
        }
        if(score >= 300 && antilob == 2 )
        {
            antilob ++;
            getWorld().addObject( new lobster(), 120, 60 );
        }
        if( score >= 400 && antilob == 3 )
        {
            antilob ++;
            getWorld().addObject( new lobster(), 180, 100 );
        }
        if( score >= 500 && antilob == 4 )
        {
            antilob ++;
            getWorld().addObject( new lobster(), 75, 119 );
        }
    }
    public void win()
    {
        if( score == 600 )
        {
            game(true);
            getWorld().removeObject( this );
        }
    }
}