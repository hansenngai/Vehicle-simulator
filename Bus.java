import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Yellow school bus vehicle.
 * @author Hansen Ngai / Mr. Cohen
 * @version February 2015
 */
public class Bus extends Vehicle
{
    private Child c;
    private Adult a;
    /**
     * Act method
     */
    public void act()
    {
        drive();
        checkHitPedestrian();
    }

    /**
     * Drives/moves the bus
     */
    public void drive()
    {
        speed = 3;//sets a moving speed of 3
        super.drive(); //drives, called from parent class
    }

    /**
     * Checks for collision with a pedestrian (child only) 
     */
    public void checkHitPedestrian ()
    {
        // Check collision for a pedestrian one pixel ahead
        // of the Vehicle
        c = (Child)getOneObjectAtOffset((this.getImage().getWidth() / 2) + 1, 0, Child.class);
        if (c != null)
        {
            c.pickMeUp(); //picks up the child
        }
        a = (Adult)getOneObjectAtOffset((this.getImage().getWidth() / 2) + 1, 0, Adult.class);
        if (a != null)
        {
            a.knockMeOver(); //knocks over the adult;
        }
    }
}
