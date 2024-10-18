import greenfoot.*; 

public class Cactus extends Obstacles
{
    private int lineCounter = 0;
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(isTouching(Lumi.class)) {
           removeTouching(Lumi.class);
           deductPoints();
           printMessage();
           reviveLumi();
           
       }
    }    
    
    /**
     * deductPoints() - to remove points when Lumi touches a cactus
     */
    public void deductPoints() {
       Greenfoot.playSound("Spike.wav");
       MyWorld myWorld = (MyWorld)getWorld();
       myWorld.addScore(-100);
    }
 
    /**
     * reviveLumi() - to revive Lumi when life count is higher than 0.
     */
    public void reviveLumi() {
        MyWorld myWorld = (MyWorld)getWorld();
        if (myWorld.getLifeCount() > 0) {
            Level2 myLevel2 = (Level2)getWorld();
            myLevel2.addObject(new Lumi(), 800, 640);
        }   
    }
    
    /**
     * printMessage() - to print a message whenever Lumi touches the cactus
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
            Level2 myLevel2 = (Level2)getWorld();
            myLevel2.addObject(new MinusLine(), 850, 350);
       }
    }
}
