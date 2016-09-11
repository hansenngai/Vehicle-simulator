import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An adult pedestrian.
 * 
 * @author Hansen Ngai / Mr. Cohen
 * @version February 2015
 */
public class Adult extends Pedestrian
{
    //Constructor
    public Adult()
    {
        // figure out own width (related to checking if at world's edge)
        GreenfootImage g = this.getImage();
        myWidth = g.getWidth();

        // Set current healthy status to true (alive and moving)
        healthy = true;
        // Set initial speed
        speed = startSpeed;
    }
    
    /**
     * Act - do whatever the Adult wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkRemove();
    } 
    
    /**
     * Knocks person over. From parent class.
     */
    public void knockMeOver(){
        super.knockMeOver();
    }
    
    /**
     * Heals person. From parent class.
     */
    public void healMe(){
        super.healMe();
    }
    
    /**
     * Checks if at world edge. From parent class.
     */
    public boolean atWorldEdge(){
        return super.atWorldEdge();
    }
    
    /**
     * Plows away body. From parent class.
     */
    public void plowed(){
        super.plowed();
    }
}
