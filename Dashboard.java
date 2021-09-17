import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Dashboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dashboard extends Actor
{
int rollOne;
int rollTwo;
int rollBoth;
int player=1;
int numRolls;
int numRolls2;
private boolean newTurn = false;
ArrayList<Integer> diceRolls = new ArrayList<Integer>();
ArrayList<Integer> diceRollsPlayerTwo = new ArrayList<Integer>();
public int sumPlayerOne(ArrayList<Integer> diceRolls) {
    int sum = 0;
    for (int i:diceRolls) {
        sum += i;
    }
    System.out.println(diceRolls);
    return sum;
}
public int getDiceRollsPlayerOne(){
    if(sumPlayerOne(diceRolls)<40){
        diceRolls.add(rollOne);
        diceRolls.add(rollTwo);
        player=2;
}
    if(sumPlayerOne(diceRolls)>40){
        diceRolls.add(-2*rollOne);
        diceRolls.add(-2*rollTwo);
        player=2;
}
        if(sumPlayerTwo(diceRolls)==40){
        Greenfoot.ask("Player 1 Wins!");
        Greenfoot.delay(10);
        Greenfoot.stop();
}
return sumPlayerOne(diceRolls);
}
public int sumPlayerTwo(ArrayList<Integer> diceRolls) {
    int sum = 0;
    for (int i:diceRollsPlayerTwo) {
        sum += i;
    }
    System.out.println(diceRollsPlayerTwo);
    return sum;
}
public int getDiceRollsPlayerTwo(){
         if(sumPlayerTwo(diceRollsPlayerTwo)<40){
        diceRollsPlayerTwo.add(rollOne);
        diceRollsPlayerTwo.add(rollTwo);
        player=1;
}
        if(sumPlayerTwo(diceRollsPlayerTwo)>40){
        diceRollsPlayerTwo.add(-2*rollOne);
        diceRollsPlayerTwo.add(-2*rollTwo);
        player=1;
}
        if(sumPlayerTwo(diceRollsPlayerTwo)==40){
        Greenfoot.ask("Player 2 wins!");
        Greenfoot.delay(10);
        Greenfoot.stop();
}
        return sumPlayerTwo(diceRollsPlayerTwo);
}
    public void act()
    {
    rollOne = getWorld().getObjects(Dice.class).get(0).getRollOne();
    rollTwo = getWorld().getObjects(DiceTwo.class).get(0).getRollTwo();

    this.setImage(new GreenfootImage ("Player:" + player + "  |  Press 'q' if you land on a question.", 48, Color.BLACK, Color.WHITE));
}
}