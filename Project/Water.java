import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Water extends Obstacles
{   
   private int lineCounter = 0;
    /**
     * Act - do whatever the Water wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
   {
        if (isTouching(Lumi.class)) {
           removeTouching(Lumi.class);
           deductLife();
           reviveLumi();
           printMessage();
       }
   }  
   
   /**
    * deductLife() - To decrease life count when Lumi touches the deep water.
    */
   public void deductLife() {
       ((MyWorld)getWorld()).lifeCount(-1);
        Greenfoot.playSound("Crying.wav");
   }  

   /**
    * reviveLumi() - To revive Lumi if life count is higher than 0.
    */
   public void reviveLumi() {
       MyWorld myWorld = (MyWorld)getWorld();
       if (myWorld.getLifeCount() > 0) {
            Level3 myLevel3 = (Level3)getWorld();
            myLevel3.addObject(new Lumi(), 800, 640);
       }  
   
   }  
   
   /**
    * printMessage() - To print a message when Lumi is touching the deep water.
    */
   public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
           Level3 line = (Level3)getWorld();
           line.addObject(new WaterLine(), 850, 350); 
       }
   
   }  
   
 }
