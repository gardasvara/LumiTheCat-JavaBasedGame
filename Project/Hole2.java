import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hole2 extends Actor
{   
    private int lineCounter = 0;
    /**
     * Act - do whatever the Hole1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       removeLumi();
    }
    
    /**
     * removeLumi() - to remove Lumi from the World and bring him back to his initial position in that level.
     */
    public void removeLumi() {
        if (isTouching(Lumi.class)) {
            Greenfoot.playSound("Crying.wav");
            printMessage();
            reviveLumi();
            deductLife();
            removeTouching(Lumi.class);
        }
    }
    
    /**
     * deductLife() - to remove a life when Lumi touches the holes.
     */
     public void deductLife() {
        MyWorld myWorld = (MyWorld)getWorld();
        myWorld.lifeCount(-1);
        
    }
    
    /**
     * reviveLumi() - bring back Lumi to initial position.
     */
     public void reviveLumi() {
        MyWorld myWorld = (MyWorld)getWorld();
        if (myWorld.getLifeCount() > 0) {
             if (getWorld() instanceof Level1) {
                Level1 myLevel1 = (Level1)getWorld();
                myLevel1.addObject(new Lumi(), 800, 640);
             }
             else {
                Level3 myLevel3 = (Level3)getWorld();
                myLevel3.addObject(new Lumi(), 800, 640);
           
             }
        }
    }

    /**
     * printMessage() - to print a message when Lumi touches a hole
     */
    public void printMessage() {
      lineCounter++;
      if (lineCounter > 0) {
          Level1 line = (Level1)getWorld();
          line.addObject(new HoleLine(), 850, 350); 
      }
      
    }
}
