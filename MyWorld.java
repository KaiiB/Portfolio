import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color.*;
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050, 580, 1); 
        setBackground("nback.png");
        prepare();
    }
    public void prepare(){ 
        Dice dice = new Dice();
        DiceTwo dice2 = new DiceTwo();
        Dashboard dashboard = new Dashboard();
        addObject(dice,830,310);
        addObject(dice2,930,310);
         addObject(dashboard,450,35);
         Tile tile = new Tile();
         addObject (tile, 150, 100);
         Tile2 tile2 = new Tile2();
         addObject (tile2, 220, 100);
         Tile3 tile3 = new Tile3();
         addObject (tile3, 290, 100);
         Tile4 tile4 = new Tile4();
         addObject (tile4, 360, 100);
         Tile5 tile5 = new Tile5();
         addObject (tile5, 430, 100);
         Tile6 tile6 = new Tile6();
         addObject (tile6, 500, 100);
         Tile7 tile7 = new Tile7();
         addObject (tile7, 570, 100);
         Tile8 tile8 = new Tile8();
         addObject (tile8, 640, 100);
         Tile9 tile9 = new Tile9();
         addObject (tile9, 710, 100);
         Tile10 tile10 = new Tile10();
         addObject (tile10, 780, 100);
         Tile11 tile11 = new Tile11();
         addObject (tile11, 850, 100);
         Tile12 tile12 = new Tile12();
         addObject (tile12, 920, 100);
         Tile13 tile13 = new Tile13();
         addObject (tile13, 920, 170);
         Tile14 tile14 = new Tile14();
         addObject (tile14, 920, 240);
         Tile15 tile15 = new Tile15();
         addObject (tile15, 850, 240);
         Tile16 tile16 = new Tile16();
         addObject (tile16, 780, 240);
         Tile17 tile17 = new Tile17();
         addObject (tile17, 710, 240);
         Tile18 tile18 = new Tile18();
         addObject (tile18, 640, 240);
         Tile19 tile19 = new Tile19();
         addObject (tile19, 570, 240);
         Tile20 tile20 = new Tile20();
         addObject (tile20, 500, 240);
         Tile21 tile21 = new Tile21();
         addObject (tile21, 430, 240);
         Tile22 tile22 = new Tile22();
         addObject (tile22, 360, 240);
         Tile23 tile23= new Tile23();
         addObject (tile23, 290, 240);
         Tile24 tile24 = new Tile24();
         addObject (tile24, 220, 240);
         Tile25 tile25 = new Tile25();
         addObject (tile25, 150, 240);
         Tile26 tile26 = new Tile26();
         addObject (tile26, 150, 310);
         Tile27 tile27 = new Tile27();
         addObject (tile27, 150, 380);
         Tile28 tile28 = new Tile28();
         addObject (tile28, 220, 380);
         Tile29 tile29 = new Tile29();
         addObject (tile29, 290, 380);
         Tile30 tile30 = new Tile30();
         addObject (tile30, 360, 380);
         Tile31 tile31 = new Tile31();
         addObject (tile31, 430, 380);
         Tile32 tile32 = new Tile32();
         addObject (tile32, 500, 380);
         Tile33 tile33 = new Tile33();
         addObject (tile33, 570, 380);
         Tile34 tile34 = new Tile34();
         addObject (tile34,640, 380);
         Tile35 tile35 = new Tile35();
         addObject (tile35, 710, 380);
         Tile36 tile36 = new Tile36();
         addObject (tile36, 780, 380);
         Tile37 tile37 = new Tile37();
         addObject (tile37, 850, 380);
         Tile38 tile38 = new Tile38();
         addObject (tile38, 920, 380);
         Tile39 tile39 = new Tile39();
         addObject (tile39, 920, 450);
         Tile40 tile40 = new Tile40();
         addObject (tile40, 920,520 );
         StartTile starttile = new StartTile();
         addObject (starttile, 70, 100);
         Finish finish = new Finish();
         addObject (finish, 825, 520);
          P2 p2 = new P2();
         addObject (p2, 80, 100);
         P1 p1 = new P1();
         addObject (p1, 80, 100);

    }
}

    

