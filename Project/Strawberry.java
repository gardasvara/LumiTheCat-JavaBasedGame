import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Strawberry extends Food
{
   private int lineCounter = 0;
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (isTouching(Lumi.class)) {
           ((MyWorld)getWorld()).addScore(50); 
           Greenfoot.playSound("House.wav");
           printMessage();
           getWorld().removeObject(this);
      }  
   }
   
    /**
     * printMessage() - to print a message whenever Lumi touches a strawberry
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
            Level1 myLevel1 = (Level1)getWorld();
            myLevel1.addObject(new FruitLine(), 750, 450);
       }
   }
}
