import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WinScreen extends MyWorld
{

    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlaySecond playSecond = new PlaySecond();
        addObject(playSecond, 1472, 346);
        addObject(new Paw(), 1301, 346);
        addObject(new Rectangle(score, lifeCount), 1003, 387);
        
        StartF startF = new StartF();
        Paw paw2 = new Paw();
        addObject(paw2,1301,419);
        addObject(startF,1405,419);
    }
}
