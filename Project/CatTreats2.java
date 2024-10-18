import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CatTreats2 extends Food
{
    private int lineCounter = 0;
    /**
     * Act - do whatever the DogTreats2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
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
            Level2 myLevel2 = (Level2)getWorld();
            myLevel2.addObject(new PlusPoint(), 700, 400);
       }
    }
}
