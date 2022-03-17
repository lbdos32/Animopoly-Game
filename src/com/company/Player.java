package com.company;

public class Player extends BoardCharacter {
    public Player(String name, int funds) {
        //player constructor
        super(name, funds);
        //this.funds = funds;
        this.location = 0;
        this.funds = 2000;
        this.bankrupt = false;

    }

}
