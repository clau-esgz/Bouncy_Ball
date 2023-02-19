import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Bear extends Actor
{
    
    private int offsetX = 5;
    private int offsetY = 5;
    private static int nextOffset = 5;
    private int counterAddObject;
    
    public Bear(){
        offsetX = nextOffset;
        offsetY = nextOffset;
        
        nextOffset += 3;
    }
    

    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(x + offsetX, y + offsetY);
        
        if(isAtEdge()){
            offsetY *= -1;
        }
        
        if(getX() >= 575 || getX() <= 0){
            offsetX *= -1;
        }
              
        Turtle turtle = (Turtle)getOneIntersectingObject(Turtle.class); // si chocan
        Bomb bomb = new Bomb();
      
        if(turtle != null && counterAddObject == 0){ // exixte una tortuga con la que choca
         counterAddObject = 100;
         World world = getWorld();
         world.addObject(bomb,x,y);
         
        }
        
        if(counterAddObject > 0){
            counterAddObject--;
           
        }
        
    }
}

