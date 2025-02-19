import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level1 extends MyWorld {
   
   /**
    * Constructor for objects of class Level1.
    * 
    */
    public Level1() {
        setPaintOrder( Strawberry.class, StarTreat.class, TrafficCone.class, Car2.class, Car.class, Bench.class, Tree.class, Tree3.class, Tree2.class, Lumi.class );
        prepare();
        showLife();
        showScore();
        stopGame();
        score = 500;
        lifeCount = 3;
   }
        
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        // 1st road - top
        for(int i = 0; i < 3; i++) {
            addObject(new Car2(), i * 500, 63); 
        }
        for(int i = 1; i <= 4; i++) {
            addObject(new Car(), i * 350, 95); 
        }

        // 2nd road - top
        for(int i = 0; i < 5; i++) {
            addObject(new Car(-180), i * 385, 180); 
        }
        for(int i = 1; i < 5; i++) {
            addObject(new Car2(180), (i * 235), 216); 
        }

        // 3rd road - middle 
        for(int i = 1; i <= 3; i++) {
            addObject(new Motorcycle(), (i * 385), 305); 

        }
        for(int i = 0; i < 3; i++) {
            addObject(new Motorcycle2(), (i * 300), 295); 

        }
        for(int i = 0; i < 2; i++) {
            addObject(new Car3(), (i * 600), 335); 

        }
        for(int i = 1; i <= 2; i++) {
            addObject(new Car4(180), (i * 500), 335); 

        }        

        //4th road - bottom
        for(int i = 0; i < 3; i++) {
            addObject(new Car2(), i * 430, 420); 
        }
        for(int i = 1; i <= 2; i++) {
            addObject(new Car(), i * 350, 455); 
        }
        addObject(new Car3(), 900, 455); 

        // 5th road - bottom (last)
        for(int i = 0; i < 4; i++) {
            addObject(new Car(180), i * 300, 550); 
        }
        for(int i = 1; i <= 4; i++) {
            addObject(new Car2(180), i * 350, 585); 
        }

        // Holes
        for(int i = 1; i <= 8; i++) {
            addObject(new Hole2(), Greenfoot.getRandomNumber(1590)+ 20, Greenfoot.getRandomNumber(450)+80); 
        }
        for(int i = 1; i <= 9; i++) {
            addObject(new Hole1(), Greenfoot.getRandomNumber(1590) + 40, Greenfoot.getRandomNumber(300)+120); 
        }

        // Strawberry
        for(int i = 0; i <= 7; i++) {
            addObject(new Strawberry(), Greenfoot.getRandomNumber(1500)+ 60, Greenfoot.getRandomNumber(510)+ 40); 
        }

        for(int i = 0; i <= 5; i++) {
            addObject(new StarTreat(), Greenfoot.getRandomNumber(1500)+ 60, Greenfoot.getRandomNumber(550)+ 80); 
        }

        // Traffic Cones
        for(int i = 1; i <= 4; i++) {
            addObject(new TrafficCone(), Greenfoot.getRandomNumber(1600)+ 100, 560); 
            addObject(new TrafficCone(), Greenfoot.getRandomNumber(1600) + 60, 190); 
            addObject(new TrafficCone(), Greenfoot.getRandomNumber(1600) + 60, 430); 
            addObject(new TrafficCone(), Greenfoot.getRandomNumber(1600) + 60, 70); 
        }

        //Keys
        for (int i = 1; i <= 3; i++) {
            KeyPass keypass = new KeyPass();
            addObject(keypass, (i * 400) + 40, 20);
        }

        // Lumi
        addObject(new Lumi(), 792, 630); 

        // Bench
        addObject(new Bench(), 1200, 490); 
        addObject(new Bench(), 350, 630); 
        addObject(new Bench(), 590, 250); 

        // Quit Line
        Stop stop1 = new Stop();
        addObject(stop1,62,623);

        // Trees
        Tree tree = new Tree();
        addObject(tree,1089,496);
        Tree tree2 = new Tree();
        addObject(tree2,172,623);
        Tree tree3 = new Tree();
        addObject(tree3,1391,370);
        Tree tree4 = new Tree();
        addObject(tree4,97,253);
        Tree tree5 = new Tree();
        addObject(tree5,904,133);
        Tree2 tree22 = new Tree2();
        addObject(tree22,1445,505);
        Tree2 tree23 = new Tree2();
        addObject(tree23,526,631);
        Tree2 tree24 = new Tree2();
        addObject(tree24,230,376);
        Tree2 tree25 = new Tree2();
        addObject(tree25,1374,253);
        Tree2 tree26 = new Tree2();
        addObject(tree26,1268,136);
        Tree3 tree32 = new Tree3();
        addObject(tree32,1542,626);
        Tree3 tree33 = new Tree3();
        addObject(tree33,951,634);
        Tree3 tree34 = new Tree3();
        addObject(tree34,140,137);
        Tree3 tree35 = new Tree3();
        addObject(tree35,1030,258);
        Tree tree6 = new Tree();
        addObject(tree6,692,375);
        Tree tree7 = new Tree();
        addObject(tree7,507,499);
        tree7.setLocation(501,497);
        removeObject(tree7);
        Tree3 tree36 = new Tree3();
        addObject(tree36,189,498);
        tree36.setLocation(34,502);
   }
    
}

