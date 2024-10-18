import greenfoot.*; 

public class KeyPass2 extends Actor
{
    /**
     * Act - do whatever the KeyPass2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Lumi.class)) {
            Greenfoot.playSound("Key.wav");
        }  
        
    }
}
