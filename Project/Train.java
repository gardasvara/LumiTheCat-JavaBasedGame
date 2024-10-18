import greenfoot.*;

public class Train extends Actor
{
    private int trainCounter = 0;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private GreenfootImage image7;
    private GreenfootImage image8;
    private int lineCounter = 0;
    
    /**
     * Default constructor
     */
    public Train() {
        image1 = new GreenfootImage("Train3.png");
        image2 = new GreenfootImage("end1.png");
        image3 = new GreenfootImage("end2.png");
        image4 = new GreenfootImage("end3.png");
        image5 = new GreenfootImage("end4.png");
        image6 = new GreenfootImage("end5.png");
        image7 = new GreenfootImage("end6.png");
        setImage(image1);
    }

    /**
     * Act - do whatever the Train wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-4, getY());
        switchImage();
        removeLumi();
    }    
    
    /**
     * switchImage() - to make the disappearance of the train realistic
     */
    public void switchImage() {
       if (getX() == 0) {
          trainCounter++;
          if (trainCounter == 8) {
                setImage(image2);
          }
          if (trainCounter == 16 ) {
             setImage(image3);
          }
          if (trainCounter == 24) {
             setImage(image4);
          }
          if (trainCounter == 32) {
             setImage(image5);
          }
          if (trainCounter == 40) {
             setImage(image6);
          }
          if (trainCounter == 48) {
             setImage(image7);
          }
          if(trainCounter == 56){
             setImage(image1);
             setLocation(1650,getY());
             trainCounter = 0;
          }
       } 
        
    }
    
    /**
     * removeLumi() - to remove Lumi from the World and bring him back to his initial position in that level.
     */
    public void removeLumi() {
        if (isTouching(Lumi.class)) {
           getWorld().addObject(new Blood(), getX()-80, getY());
           Greenfoot.playSound("Train.wav");
           removeTouching(Lumi.class);
           reviveLumi();
           deductLife();
           printMessage();
     
        }
    }

    /**
     * deductLife() - to remove points when Lumi touches the train
     */
     public void deductLife() {
        MyWorld myWorld = (MyWorld)getWorld();
        myWorld.lifeCount(-1);
    }

    /**
     * reviveLumi() - bring back Lumi if life count is higher than 0.
     */
    public void reviveLumi() {
        MyWorld myWorld = (MyWorld)getWorld();
        if (myWorld.getLifeCount() > 0) {
            if (getWorld() instanceof Level2) {
                Level2 myLevel2 = (Level2)getWorld();
                myLevel2.addObject(new Lumi(), 800, 640);
           
            }
        }
    }
    
    /**
     * printMessage() - to print a message whenever Lumi touches the heart
     */
     public void printMessage() {
        lineCounter++;
        if (lineCounter > 0) {
           Level2 line = (Level2)getWorld();
           line.addObject(new HitLine(), 850, 350); 
  
        }
    }
} 
