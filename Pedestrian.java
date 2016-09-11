import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pedestrian Class
 * 
 * Moves mindlessly up the road, reacting to cars
 * that hit it, ambulances that heal it, and potentially
 * buses that pick it up.
 * 
 * @author Jordan Cohen / Hansen Ngai
 * 
 */

public abstract class Pedestrian extends Actor
{
    // Instance variables
    protected int myWidth;
    protected boolean healthy; //if gotten hit by vehicle or not
    protected int startSpeed = 2;//moves at a starting speed of 2
    protected int speed; // speed it is moving at

    /**
     * Checks if object is out of boundaries and if it is, removes itself.
     * Code may not be working, as mentioned by Mr. Cohen on Thurs. Feb 26.
     */
    public void checkRemove() 
    {
        // move upwards
        setLocation (getX(), getY() - speed);
        // check if I'm at the edge of the world,
        // and if so, remove myself
        if (atWorldEdge())
        {
            getWorld().removeObject(this);
        }
    }    

    /**
     * Method causes this Pedestrian to stop moving
     * and appear to fall over
     */
    public void knockMeOver ()
    {
        speed = 0;//stops moving
        setRotation (90); // rotates to act dead
        healthy = false;// no longer healthy
    }

    /**
     * Method causes this pedestrian to "heal" - regain
     * upright position and start moving again
     */
    public void healMe ()
    {
        speed = startSpeed; //starts to move again
        setRotation (0); //rotates back to normal 
    }

    

    /**
     * Handy method that checks if this object is at the edge
     * of the World
     * 
     * @return boolean  true if at or past the edge of the World, otherwise false
     */
    public boolean atWorldEdge()
    {
        if (getX() < -(myWidth / 2) || getX() > getWorld().getWidth() + (myWidth / 2))
            return true;
        else if (getY() < -(myWidth / 2) || getY () > getWorld().getHeight() + (myWidth / 2))
            return true;
        else
            return false;
    }

    public void plowed(){
        if (healthy == false){
            setRotation (90); //rotates sideways
            speed = startSpeed * 3; //gets out of the way at 3 times the original moving speed
        }
    }
}
