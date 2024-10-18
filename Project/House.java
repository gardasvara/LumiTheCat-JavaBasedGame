import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class House extends Actor
{
    /**
     * Act - do whatever the House wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Lumi.class)) {
           Greenfoot.playSound("House.wav");
           removeTouching(Lumi.class);
           Greenfoot.setWorld(new WinScreen());
        }
    }    
}
