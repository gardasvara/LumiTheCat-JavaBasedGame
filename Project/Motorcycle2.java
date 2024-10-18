import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Motorcycle2 extends Car
{
    private int rotation;
    private int lineCounter = 0;
    
       /**
        * Default Constructor
        */
       public Motorcycle2() {
          //default motorcycle direction
           
       }

       /**
        *  
        * Constructor with one parameter(rotation) - rotates the motorcycle to opposite direction
        */
       public Motorcycle2(int rotation) {
           setRotation(rotation);
       }
       
       /**
        * Act - do whatever the Car wants to do. This method is called whenever
        * the 'Act' or 'Run' button gets pressed in the environment.
        */
        public void act() {
           removeLumi();
           move(2);
           if(isAtEdge()) {
               setLocation(0, getY());
           }

        }
        
       /**
        * removeLumi() - to remove Lumi from the World and replace health Lumi with Lumi with blood.
        */
        public void removeLumi() {
             if (isTouching(Lumi.class)) {
                Greenfoot.playSound("tireSkid.wav");
                getWorld().addObject(new Blood(), getX()-80, getY());
                removeTouching(Lumi.class);
                deductLife();
                reviveLumi();
                printMessage();
     
           }
       }
    
       /**
         * deductLife() - to remove points when Lumi touches the green motorcycle.
         */
         public void deductLife() {
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.lifeCount(-1);
       }
    
       /**
         * reviveLumi() - to bring back Lumi if life count is higher than 0.
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
         * printMessage() - to print a message when Lumi touches the green motorcyle.
         */
        public void printMessage() {
         lineCounter++;
         if (lineCounter > 0) {
             if (getWorld() instanceof Level1) {
                    Level1 line1 = (Level1)getWorld();
                    line1.addObject(new HitLine(), 850, 350); 

             }
             
             if (getWorld() instanceof Level3) {
                    Level3 line3 = (Level3)getWorld();
                    line3.addObject(new HitLine(), 850, 350); 

             }

         }
      }
}



