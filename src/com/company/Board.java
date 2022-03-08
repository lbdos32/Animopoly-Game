package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    protected int recentGo = 0;

    ArrayList<Player> player = new ArrayList<>();

    //DicePair dice;
    Animals animals[];
    public Board() {

    }
    public void setup(){
        this.recentGo = 0;

    }
    public void playRound(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (recentGo >= 3) {
                recentGo = 0;
            }
            BoardCharacter player = this.player.get(recentGo);

            System.out.println("It is " + player.getPlayerName() + "'s go\nType any key to roll the dice:");
            String input = scanner.nextLine();
                int die1 = ThrowDice.throwDie();

                int die2 = ThrowDice.throwDie();
                int diceTotal = die1 + die2;
                System.out.println("You rolled a " + die1 + " and a " + die2 + " this totals to a " + diceTotal);
            recentGo++;

        }

        //System.out.println("Type y if you would like to upgrade any animals?");
        //String input = scanner.nextLine();
        //if (input.equals("y")){
            //check
        //}

    }
    public void assignPlayerName(String name){

        player.add(new Player(name));
    }

}