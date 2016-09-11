import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Abstract class for any vehicles.
 * @author Mr.Cohen / Hansen Ngai
 */
public abstract class Vehicle extends Actor
{   
    // Variables in abstract classes should be
    // implemented 
    protected int speed; //speed of vehicle
    protected int offset;// offset for collisons
    protected Pedestrian p; // a pedestrian
    /**
     * Abstract method declarations: 
     * This means that all Vehicles must have a
     * move () method with the same signature:
     * E.g: public void move ();
     * 
     * HINT:
     * However, in this current implementation, the drive()
     * method for all three subclasses is the same. Perhaps
     * one of these methods will change if you implement something
     * interesting that requires different drive methods. If not,
     * it would be more efficient to actually write the method
     * here, making it inherited by not abstract.
     */
    public void drive(){
        move (speed); //moves at a certain speed
    }
    
    public abstract void checkHitPedestrian ();
}










