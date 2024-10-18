import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartF extends Actor
{
    /**
     * Act - do whatever the StartF wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (Greenfoot.mouseClicked(this)) {
          Greenfoot.playSound("Meow.wav");
          Greenfoot.setWorld(new MyWorld());
          Greenfoot.setWorld(new Thankyou());
      }    
    }
}
