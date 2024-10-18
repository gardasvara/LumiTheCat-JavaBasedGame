import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StarTreat extends Food
{
   private int lineCounter = 0;
   /**
     * Act - do whatever the DogTreat wants to do. This method is called 
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
     * printMessage() - to print a message whenever Lumi touches a dog treat.
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
            Level1 myLevel1 = (Level1)getWorld();
            myLevel1.addObject(new PlusPoint(), 750, 450);
       }
   }
}

