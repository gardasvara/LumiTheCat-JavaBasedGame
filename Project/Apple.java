import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Food
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
           Greenfoot.playSound("Coin.wav");
           printMessage();
           getWorld().removeObject(this);
      }  
   }
   
    /**
     * printMessage() - to print a message whenever Lumi touches an apple
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
            Level3 myLevel3 = (Level3)getWorld();
            myLevel3.addObject(new FruitLine(), 750, 450);
       }
   }
}
