import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 650, 1); 
        mouseClicked();
        Greenfoot.playSound("Intro.wav");
        prepare();
    }

    /**
     * mouseClicked() - to move to different worlds by clicking the brown paw on the screen. 
     */
    private void mouseClicked() {
        // paw and start
        Paw pawStart = new Paw();
        addObject(pawStart, 500, 600);
        addObject(new Start(), 590, 600);

        // paw and instruction
        Paw pawInstruction = new Paw();
        addObject(pawInstruction, 885, 600);
        addObject(new Instructions(), 1050, 600);

        // paw and credit
        Paw pawCredit = new Paw();
        addObject(pawCredit, 1350, 600);
        addObject(new Credits(),1450, 600);

        //paw and story
        Paw pawStory = new Paw();
        addObject(pawStory, 110, 600);
        addObject(new Storys(),200,600);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
