import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends MyWorld
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Play Again
        addObject(new PlaySecond(), 1181,441);
        addObject(new Paw(),1126,394);
        // Scoreboard
        addObject(new Rectangle(score, lifeCount, 60), 1125, 200);
    }

}
