package com.company;

public class BoardCharacter {
    protected String name;
    protected int location;
    protected int value;
    protected int funds;
    protected int winner;
    protected int posi;
    protected int level;
    protected int owner;
    protected boolean bankrupt;

    public BoardCharacter(String name, int value) {
        this.name = name;
        this.value = value;
        this.location = 0;
        this.level = 0;
        this.owner = 0;
        this.posi = 0;
    }

    public void changeValue(int changeValue){
        this.funds = this.funds + changeValue;
        //changes the value by the given amount - changeValue
    }

    public int getValue() {
        //gets the value
        return value;
    }

    public String getName() {
        return this.name;
    }

    public int getLocation() {
        return this.location;
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getPosi() {
        return posi;
    }

    public void updateLocation(int moveValue) {

        if (this.location + moveValue > 25){
            //checks if the dice roll will go to past 25 (the start or greater)
            int spaceUntilStart = 25 - this.location;
            //calculates the distance until the start
            int moveAfterGo = moveValue - spaceUntilStart;
            //calculates how much further it will move after go
            this.location = 0;
            //resets the location to the start
            this.location = this.location + moveAfterGo;
            //adds on the remaining
        } else {
            this.location = this.location + moveValue;
            //if they won't pass go then just moves them
        }
    }
    public boolean checkBankrupt(){
        return bankrupt;
    }


    public int getWinner(){
        return winner;
    }
    public boolean isPassGo(int moveValue){
        return this.location + moveValue > 25;
        //returns true if they will pass go
    }
    public boolean isLandGo(int moveValue){
        return (this.location + moveValue) == 0;
        //returns false if they have passed go
    }
    public void passGo(){
        System.out.println("You got 500 for passing go well done!");
        this.funds = this.funds + 500;
        //increases player money by 500 for passing on go
    }
    public void landGo() {
        System.out.println("You got 1000 for landing on go");
        this.funds += 1000;
        //increases player money 1000 for landing on go
    }
}

