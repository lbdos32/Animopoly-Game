package com.company;

public class BoardCharacter {
    protected String name;
    protected int location;

    public BoardCharacter(String name) {
        this.name = name;
        this.location = 0;
    }


    public void decreaseValue(int decrease){

    }
    public void increaseValue(){

    }
    public void getValue(){

    }
    public String getPlayerName(){
        return this.name;
    }
    public  void updateLocation(int diceRoll){
        location = location + diceRoll;
    }

}
