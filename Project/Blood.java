import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Blood extends Actor
{
    private int counter = 0;
    /**
     * Act - do whatever the Blood wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        counter++;
        // To remove Toby with blood
        if (counter == 20) {
            getWorld().removeObject(this);
            counter = 0; 
        }
    }  
}
