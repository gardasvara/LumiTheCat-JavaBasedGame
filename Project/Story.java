import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Story extends World
{

    /**
     * Constructor for objects of class Instruction.
     * 
     */
    public Story()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 650, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Return to Menu
        addObject(new Paw(),1102,583);
        addObject(new ReturnToStart(),1003,626);
    }
}