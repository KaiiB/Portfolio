import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tile33 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tile33 extends Actor
{
    /**
     * Act - do whatever the Tile33 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
     GreenfootImage image = getImage();
       image.scale(75,75); 
       setImage(image);   // Add your action code here.
    }
}