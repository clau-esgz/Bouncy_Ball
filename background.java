import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bear bear = new Bear();
        addObject(bear,150,194);
        Turtle turtle = new Turtle();
        addObject(turtle,382,234);
        bear.setLocation(49,3);
        bear.setLocation(46,55);
        turtle.setLocation(562,377);
        turtle.setLocation(363,226);
        turtle.setLocation(180,126);
    }
}
