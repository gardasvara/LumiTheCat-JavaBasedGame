import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Start extends ClickLines
{ 
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (Greenfoot.mouseClicked(this)) {
          Greenfoot.playSound("Meow.wav");
          Greenfoot.setWorld(new MyWorld());
          Greenfoot.setWorld(new Level1());
          Greenfoot.setWorld(new Level1()); // to ensure it resets to 500
     }    
   }
}
