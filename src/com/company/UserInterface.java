package com.company;
import java.util.Scanner;

public class UserInterface {
    public UserInterface(){
        //ui constructor
    }

    public void run() {
        Board board = new Board();
        //init board
        Scanner scanner = new Scanner(System.in);
        //init scanner
        System.out.println("Hello welcome to Animopoly\nThe number of players required is 3");
        for (int x = 1; x < 4; x++) {
            System.out.println("Player " + x + " enter your character here:");
            String input = scanner.nextLine();
            //takes input from player
            board.assignPlayerName(input);
            //uses assignPlayerName method to create an instance of the class player
        }
        board.setup();
        //initial setup before the start of the game
        board.playRound();
        //plays a round

    }
}

