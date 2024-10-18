import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CatTreat extends Actor
{
    private int lineCounter = 0;
    /**
     * Act - do whatever the CatTreat wants to do. This method is called 
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (isTouching(Lumi.class)) {
           ((MyWorld)getWorld()).addScore(100); 
           Greenfoot.playSound("Treats.wav");
           printMessage();
           getWorld().removeObject(this);
      }

    }    
    
    /**
     * printMessage() - to print a message whenever Lumi touches a cat treat.
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
            Level3 myLevel3 = (Level3)getWorld();
            myLevel3.addObject(new PlusPoint(), 840, 400);
       }
    }
}
