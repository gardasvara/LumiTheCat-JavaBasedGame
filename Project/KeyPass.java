import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class KeyPass extends Actor
{
    /**
     * Act - do whatever the KeyPass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          if (isTouching(Lumi.class)) {
            Greenfoot.playSound("Key.wav");
         }  
    }
}
