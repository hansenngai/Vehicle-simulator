import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ambulance vehicle.
 * @author Hansen Ngai/Mr.Cohen
 * @version February 2015
 */
public class Ambulance extends Vehicle
{
    /**
     * Act method
     */
    public void act ()
    {
        drive();
        checkHitPedestrian();
    }

    /**
     * Drives/moves the bus
     * 
     */
    public void drive ()
    {
        speed = 4;//sets a moving speed of 4
        super.drive();//drives, called from parent class
    }

    /**
     * Checks for collision with any pedestrian
     */
    public void checkHitPedestrian ()
    {
        // Check collision for a pedestrian one pixel ahead
        // of the Vehicle
        p = (Pedestrian)getOneObjectAtOffset((this.getImage().getWidth() / 2) + 1, 0, Pedestrian.class);
        if (p != null)
        {
            p.healMe();
        }
    }
}
