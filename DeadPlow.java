import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Plow vehicle.
 * 
 * @author Hansen Ngai / Mr. Cohen
 * @version February 2015
 */
public class DeadPlow extends Vehicle
{
    /**
     * Act method
     */
    public void act()
    {
        drive();
        checkHitPedestrian();
    }
    
    /**
     * Method that deals with movement, drives/moves the plow
     */
    public void drive() 
    {
        speed = 4;//sets a moving speed of 4
        super.drive();//drives, called from a parent class
    }    

    /**
     * check if hits a Pedestrian, and if so, act
     * accordingly
     */
    public void checkHitPedestrian ()
    {
        // Check collision for a pedestrian one pixel ahead
        // of the Vehicle
        offset = 30; //offset for collsion set at 30 pixels

        p = (Pedestrian)getOneObjectAtOffset(offset, 0, Pedestrian.class);
        if (p != null)
        {
            //System.out.println("got here");
            p.plowed(); //plows the body if healthy is false (in plowed method)
        }
        
        
    }
}
