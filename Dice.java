import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


import java.util.List;
import java.util.ArrayList;
public class Dice extends Actor

{
    public int rollOne;
    private int numRolls=0;
    private int time1;
    private int getImageOne=0;
    GifImage rollDice = new GifImage("diceroll.gif");
    public int getRollOne(){
        return rollOne;
    }
    public int getNumRolls(){
        return numRolls;
    }
   //act
    public void act()
    {
    timer();

    if (getImageOne==1){setImage(rollDice.getCurrentImage());}
    if (time1==1){setImage("dice" + rollOne + ".PNG");{getImageOne=0;}}
    if (Greenfoot.mouseClicked(this)){
            rollOne = 1 + Greenfoot.getRandomNumber(6);
            getImageOne=1;
            time1=200;
            numRolls++;
        }
    }
    //act end
    public void timer(){
        if(time1!=0){
            time1--;
        }
    }
    public int getTime1(){
    return time1;
}   
}


 

//public void determineDouble(){
    //if (rollOne!=0 && rollTwo==rollOne){
    //    setImage(new GreenfootImage ("You got a double " + rollOne + "! You get another turn.", 12, Color.BLACK, Color.WHITE));}


