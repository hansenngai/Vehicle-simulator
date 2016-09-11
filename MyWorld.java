import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyWorld functions as the Controller for this Greenfoot
 * project which helps students understand inheritance.
 * 
 * Firstly, I added a plow vehicle called DeadPlow. This vehicles shoves bodies out of the way if they have been hit by a car and have not been aided
 * by an ambulance. When the plow comes into contact with a fallen body, the body shoots towards the side of the road at a quick speed. Also, I seperated the
 * pedestrain into two types: adult and child. They share most of the same behavior, but the bus only picks up children. I thought of this bus as a yellow 
 * bus, therefore only picking up schoolchildren. They are differed by their blue body and red hat. However, the school bus runs and knocks over adults.
 * 
 * Benefits of using inheritence: 
 * 
 *  - My two types of pedestrians share many of the same behaviors, which are controlled by methods. 
 *  - Instead of writing the same code for all of them, I can write it in the parent class and refer to it in the subclass using super.___(), decreasing the amount of code. 
 *  - They also share the same instance variables, which I can initialize it once in the parent class and use in the subclasses without initializing it there.
 *  - All my vehicles drive the same way but with a different speed, so I can initialize the speed and also write the movement code in the parent class. Later, I would declare the individual speeds in the subclasses.
 *  
 * @author Hansen Ngai / Mr. Cohen
 * @version Feb 2015
 */
public class MyWorld extends World
{
    private int randomize;
    /**
     * Spawn Rates:
     * Lower number means more spawns
     * 3:spawnRate chance per act of spawning a random Vehicle
     * 1:pedSpawn chance per act of spawning a Pedestrian
     */
    private int spawnRate = 250;
    private int pedSpawn = 150;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
    }

    public void act ()
    {
        // spawn adult
        if (Greenfoot.getRandomNumber(pedSpawn) == 1)
        {
            addObject (new Adult(), Greenfoot.getRandomNumber(600), 395);
        }
        //spawn child
        if (Greenfoot.getRandomNumber(pedSpawn) == 2)
        {
            addObject (new Child(), Greenfoot.getRandomNumber(600), 395);
        }
        // Generate a random number to add a random element
        // to Vehicle spawning
        randomize = Greenfoot.getRandomNumber(spawnRate);
        
        
        // Chose a random lane in case a vehicle spawns
        int lane = Greenfoot.getRandomNumber (6);
        int spawnY = getYPosition (lane);

        // spawn vehicles
        if (randomize == 1)
        {
            // spawn a Car
            addObject (new Car(), 10, spawnY);
        }
        else if (randomize == 2)
        {
            // spawn a Bus
            addObject (new Bus(), 10, spawnY);
        }

        else if (randomize == 3)
        {
            // spawn a Car
            addObject (new Ambulance(), 10, spawnY);
        }
        else if (randomize == 4)
        {   
            // spawn a plow that plows people hit my 
            addObject(new DeadPlow(), 10, spawnY);
        }
        
    }
    
    /**
     * Returns the appropriate y coordinate for a given lane
     */
    private int getYPosition (int inLane)
    {
        // Manually input values based on the background graphic
        switch (inLane)
        {
            case 0: 
            return 79;

            case 1:
            return 127;

            case 2:
            return 175;

            case 3:
            return 222;

            case 4:
            return 272;

            case 5: 
            return 320;

        }  
        // In case an invalid value is passed in
        return 0;
    }
}

