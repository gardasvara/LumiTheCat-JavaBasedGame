import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayAgain extends ClickLines
{
    /**
     * Act - do whatever the PlayAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (Greenfoot.mouseClicked(this)) {
         Greenfoot.playSound("Meow.wav"); 
         Greenfoot.setWorld(new StartScreen());
      }    
    }
}