import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class P1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P1 extends Actor

{
    private boolean isArrayXDone = true;
    private boolean isArrayYDone = true;  
   private int diceRolls; 
   int numRolls;
   private boolean turnOne=true;
    ArrayList<Integer> tilesX = new ArrayList<Integer>();
    ArrayList<Integer> tilesY = new ArrayList<Integer>();
    public void getTilesX(){
        if( isArrayXDone==true){
            for (int i = 150; i <= 850; i += 70) {
            tilesX.add(i);
        }
        for (int i = 1; i <=1; i ++) {
            tilesX.add(920);
            tilesX.add(920);
            tilesX.add(920);
        }
            for (int n = 850; n >= 220; n -= 70) {
            tilesX.add(n);
        }
        for (int i = 1; i <=1; i ++) {
            tilesX.add(150);
            tilesX.add(150);
            tilesX.add(150);
        }
            for (int i = 220; i <= 710; i += 70) {
            tilesX.add(i);
        }
        for (int i = 1; i <=1; i++){
            tilesX.add(780);
        }
        for (int i = 1; i <=1; i++){
            tilesX.add(850);
        }
        for (int i = 1; i <=4; i++){
            tilesX.add(920);
        }
        System.out.println(tilesX);
        isArrayXDone=false;
    }
}
public void getTilesY(){
    if(isArrayYDone==true){
        for(int i=1;i<=12;i++){
            tilesY.add(100);
        }
        for(int i=1;i<=1;i++){
            tilesY.add(170);
        }
        for(int i=1;i<=12;i++){
            tilesY.add(240);
        }
        for(int i=1;i<=1;i++){
            tilesY.add(310);
        }
        for(int i=1;i<=12;i++){
            tilesY.add(380);
        }
        for(int i=1;i<=1;i++){
            tilesY.add(450);
        }
        for(int i=1;i<=1;i++){
            tilesY.add(520);
        }
        System.out.println(tilesY);
        isArrayYDone=false;
    }
}
private void movePlayer(){
    for(int x=0;x<diceRolls;x++){
        this.setLocation(tilesX.get(diceRolls-1),tilesY.get(diceRolls-1));
    }
    
}
private void movePlayerQ(int n){
    for(int x=0;x<diceRolls;x++){
        this.setLocation(tilesX.get(diceRolls-1+n),tilesY.get(diceRolls-1+n));
    }
    
}
    /**
     * Act - do whatever the P1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setQuestions();
        getTilesX();
        getTilesY();
      GreenfootImage image = getImage();
       image.scale(40,40); 
       setImage(image); // Add your action code here.
       if(Greenfoot.isKeyDown("q")){
        askQuestions();
    }
       if (Greenfoot.mouseClicked(this)&&turnOne==true){
         diceRolls = getWorld().getObjects(Dashboard.class).get(0).getDiceRollsPlayerOne();          
         movePlayer();  
    }
    
    numRolls = getWorld().getObjects(Dice.class).get(0).getNumRolls()+getWorld().getObjects(DiceTwo.class).get(0).getNumRolls2();
    if(numRolls==2||numRolls==6||numRolls==10||numRolls==14||numRolls==18){
        turnOne=true;
    }
    else{
        turnOne=false;
    }
}
 ArrayList<String> questions = new ArrayList<String>();
 ArrayList<Class> qtiles = new ArrayList<Class>();
public void askQuestions(){

    if (getOneIntersectingObject(Tile2.class) != null||getOneIntersectingObject(Tile5.class) != null||getOneIntersectingObject(Tile8.class) != null||getOneIntersectingObject(Tile12.class) != null||getOneIntersectingObject(Tile16.class) != null||getOneIntersectingObject(Tile20.class) != null||getOneIntersectingObject(Tile24.class) != null||getOneIntersectingObject(Tile28.class) != null||getOneIntersectingObject(Tile32.class) != null||getOneIntersectingObject(Tile35.class) != null||getOneIntersectingObject(Tile40.class) != null){
        int index=Greenfoot.getRandomNumber(8)+1;
        String answer = Greenfoot.ask(questions.get(index));
        if(index==0&&answer.charAt(0)=='b'){
            movePlayerQ(4);
        }
        if(index==0&&answer.charAt(0)=='a'){
            movePlayerQ(-5);
        }
        if(index==0&&answer.charAt(0)=='c'){
            movePlayerQ(-5);
        }
        if(index==1&&answer.charAt(0)=='a'){
            movePlayerQ(4);
        }
        if(index==1&&answer.charAt(0)=='b'){
            movePlayerQ(-5);
        }
        if(index==1&&answer.charAt(0)=='c'){
            movePlayerQ(-5);
        }
        if(index==2&&answer.charAt(0)=='b'){
            movePlayerQ(4);
        }
        if(index==2&&answer.charAt(0)=='c'){
            movePlayerQ(-5);
        }
        if(index==2&&answer.charAt(0)=='a'){
            movePlayerQ(-5);
        }
        if(index==3&&answer.charAt(0)=='a'){
            movePlayerQ(4);
        }
        if(index==3&&answer.charAt(0)=='b'){
            movePlayerQ(-5);
        }
        if(index==3&&answer.charAt(0)=='c'){
            movePlayerQ(-5);
        }
        if(index==4&&answer.charAt(0)=='a'){
            movePlayerQ(4);
        }
        if(index==4&&answer.charAt(0)=='b'){
            movePlayerQ(-5);
        }
        if(index==4&&answer.charAt(0)=='c'){
            movePlayerQ(-5);
        }
        if(index==5&&answer.charAt(0)=='a'){
            movePlayerQ(4);
        }
        if(index==5&&answer.charAt(0)=='b'){
            movePlayerQ(4);
        }
        if(index==5&&answer.charAt(0)=='c'){
            movePlayerQ(-5);
        }
        if(index==6&&answer.charAt(0)=='b'){
            movePlayerQ(4);
        }
        if(index==6&&answer.charAt(0)=='a'){
            movePlayerQ(-5);
        }
        if(index==6&&answer.charAt(0)=='c'){
            movePlayerQ(-5);
        }
        if(index==7&&answer.charAt(0)=='a'){
            movePlayerQ(4);
        }
        if(index==7&&answer.charAt(0)=='b'){
            movePlayerQ(-5);
        }
        if(index==7&&answer.charAt(0)=='c'){
            movePlayerQ(-5);
        }
        
    }
    
}
public void setQuestions(){
    qtiles.add(Tile2.class);
    qtiles.add(Tile5.class);
    qtiles.add(Tile8.class);
    qtiles.add(Tile12.class);
    qtiles.add(Tile16.class);
    qtiles.add(Tile20.class);
    qtiles.add(Tile24.class);
    qtiles.add(Tile28.class);
    qtiles.add(Tile32.class);
    qtiles.add(Tile35.class);
    qtiles.add(Tile40.class);
    questions.add("What is a Stack? | a) a method that adds objects to a list b) a way of organizing data that only removes items from the top of a stack c) a way to keep track of methods you have previously called");
    questions.add("What is a 2 dimensional array? | a) an array with rows and columns b) an array with graphs c) an array that constantly adds new items to a list");
    questions.add("How does Java store 2 dimensional arrays? | a) as a method b) an array of an array c) an array of lists");
    questions.add("What does an Object always have? | a) fields and lists b) fields and methods c) conditional statements");
    questions.add("What is a Field? | a) Something an object knows about itself b) something an object can do c) something that creates an object");
    questions.add("What is a Constructor? | a) something that initializes the fields when an object is created b) a way to get and set objects c) an object that doesn't change");
    questions.add("What is Overloading? | a) when 2 lists have the same names b) when 2 methods have the same names but different data sets c) when 2 classes have the same name");
    questions.add("What is recursion? | a) Method calls itself b) Method runs once c) Method calls another method");
}
}

