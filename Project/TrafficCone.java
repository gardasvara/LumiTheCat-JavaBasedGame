import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TrafficCone extends Obstacles
{
    private int lineCounter = 0;
    /**
     * Act - do whatever the TrafficCone wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() {
        deductPoints();

    }    
    
    /**
     * deducPoints() - to remove points when Lumi touches a traffic cone
     */
     public void deductPoints() {
       if (isTouching(Lumi.class)) {
          removeTouching(Lumi.class);
          MyWorld myWorld = (MyWorld)getWorld();
          myWorld.addScore(-100);
          Greenfoot.playSound("Crying.wav");
          printMessage();
          reviveLumi();
    
       }
    }
    
     /**
     * reviveLumi() - to revive Lumi when life count is higher than 0.
     */
    public void reviveLumi() {
        MyWorld myWorld = (MyWorld)getWorld();
        if (myWorld.getLifeCount() > 0) {
             Level1 myLevel1 = (Level1)getWorld();
             myLevel1.addObject(new Lumi(), 800, 640);
 
        }   
    }
    
    /**
     * printMessage() - to print a message whenever Lumi touches the traffic cone
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
           Level1 line = (Level1)getWorld();
           line.addObject(new MinusLine(), 850, 350); 
       }
    }

}
