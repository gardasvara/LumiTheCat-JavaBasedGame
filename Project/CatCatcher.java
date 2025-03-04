import greenfoot.*;

public class CatCatcher extends Actor{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private int counter1 = 0;
    private int counter2 = 0;
    private int counter3 = 0;
    private int lineCounter = 0;
    
    /**
     * Default constructor
     */
    public CatCatcher(){
       image1 = new GreenfootImage("dn_right1.png");
       image2 = new GreenfootImage("dn_right2.png");
       image3 = new GreenfootImage("dn_left1.png");
       image4 = new GreenfootImage("dn_left2.png");       
    }
    
    /**
     * Act - the Cat catcher moves horizontaly in order to catch Lumi. If he captures him, the "Crying" sound should be 
     * played and a text should appear on screen. Lumi should also be removed. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        removeLumi();
        rotateAtEdge();
    }
    
    /**
     * removeLumi()- if catcher meets Lumi, player loses a life, a sound is played and a pop-up line appears.
     */
    public void removeLumi() {
        if(isTouching(Lumi.class)) {
            deductLife();
            removeTouching(Lumi.class);
            reviveLumi();
            printMessage();

        }
    }
  
    /**
     * deductLife() - to remove a life when Lumi touches the Cat Catcher
     */
    public void deductLife() {
       Greenfoot.playSound("Crying.wav");
       MyWorld myWorld = (MyWorld)getWorld();
       myWorld.lifeCount(-1);
        
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
     * movement() - this method defines the movement of the Cat catcher including the animation.
     */
    public void movement() {
        counter1++;    
        if (counter1 > 80) {
            setLocation(getX() + Greenfoot.getRandomNumber(5), getY());
            counter3++;
            if (counter3 < 4) {
                setImage(image1);
            } 
            else if (counter3 > 8){
                setImage(image2);
                if (counter3 == 12){
                    counter3 = 0;
                }
            } 
        }
        else if (counter1 < 80) {
            setLocation(getX() - Greenfoot.getRandomNumber(5), getY());
            counter2++; 
            if (counter2 < 4){
                setImage(image3);
            }
            else if ( counter2 > 8){
                setImage(image4); 
                if (counter2 == 12){
                 counter2 = 0;
                }
            }

        }
        if (counter1 == 100) {
            counter1 = 0;
        }
    }    

    /**
     * rotateEdge() - if the Cat catcher is at the left edge, this method will make him appear at the right edge.
     */

    public void rotateAtEdge() {
        if (getX() == 0) {
          setLocation(1590, getY()); 
        }
    }

    /**
     * printMessage() - to print a message when Lumi touches the Cat Catcher
     */
    public void printMessage() {
      lineCounter++;
      if (lineCounter > 0) {
           Level2 myLevel2 = (Level2)getWorld();
           myLevel2.addObject(new CatcherLine(), 700, 400); 
      }
    }
}