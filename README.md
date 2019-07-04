# CP
 This project is the crab game implemented in Greenfoot. User can move the Crab object through pressing 'left' and 'right' keyboard. When Crab eats Worm, score will increased. And when Crab touches Lobster, the game is over. But, Turtle object can remove Lobster when they meet each other.

## Setup

##### Download the Greenfoot

> Follow the dowload page on Greenfoot. (https://www.greenfoot.org/download)

## code
* Animal.java
>It controlls the animal object's rotation and game.

* MyWorld.java
>It calls the game initially and initial objects.

* crab.java
>It controlls crab object's movement by user's key pressing and score. It checks if crab object touches worm object and then, increases the score. 

* turtle.java
>Its object checks if touches lobster object and then, remove the lobster object.

* lobster.java
>It checks if touches crab object and then, set the value of game object to false to terminate game. 

* worm.java
>It calls worm objects on game periodically.

* restart.java
>If user click the 'restart' button, it create a new game world.
