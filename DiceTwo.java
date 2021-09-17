import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DiceTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiceTwo extends Actor
{
    public int rollTwo;
    private int numRolls2=0;
    private int time2;
    private int getImageTwo=0;
    GifImage rollDice = new GifImage("diceroll.gif");
    public int getRollTwo(){
        return rollTwo;
    }
    public int getNumRolls2(){
        return numRolls2;
    }
    public void act()
    {
      timer();
        if (getImageTwo==1){setImage(rollDice.getCurrentImage());}
        if (time2==1){setImage("dice" + rollTwo + ".PNG");{getImageTwo=0;}}
    if (Greenfoot.mouseClicked(this)){
            rollTwo = 1 + Greenfoot.getRandomNumber(6);
            getImageTwo=1;
            time2=200;
            numRolls2++;
        }
    
      }
          public void timer(){
        if(time2!=0){
            time2--;
        }
    }
    public int getTime2(){
        return time2;
    }
}
