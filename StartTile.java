import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartTile extends Actor
{
    /**
     * Act - do whatever the StartTile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      GreenfootImage image = getImage();
       image.scale(100,75); 
       setImage(image);  // Add your action code here.
    }
}
