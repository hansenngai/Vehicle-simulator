import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Car vehicle.
 * @author Hansen Ngai / Mr. Cohen
 * @version February 2015
 */
public class Car extends Vehicle
{
    /**
     * Act method for Car
     */
    public void act()
    {
        drive();
        checkHitPedestrian();
    }
    
    /**
     * Method that deals with movement, drives/moves the car
     */
    public void drive() 
    {
        speed = 5;//sets a moving speed of 5
        super.drive();//drives, calle from parent class
    }    

    /**
     * check if hit a Pedestrian, and if so, act
     * accordingly
     */
    public void checkHitPedestrian ()
    {
        // Check collision for a pedestrian one pixel ahead
        // of the Vehicle
        offset = 30; //30 pixels ahead

        p = (Pedestrian)getOneObjectAtOffset(offset, 0, Pedestrian.class);
        if (p != null)
        {
            //System.out.println("got here");
            p.knockMeOver(); //knocks pedestrian over
        }
    }
}
