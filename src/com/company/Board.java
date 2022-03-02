package com.company;

public class Board {
    protected int test = 1;
    protected int[][] boardSpacesArray = new int[25][4];
    //25 for the number of spaces - (need to remember that 0 is the start and 13 is miss a go, therefore neither can be owned)
    //4 for the state of that space, 0 being unowned, 1 being owned player1, 2 for player 2, 3 for player 3
    public static void Board() {
        System.out.println("Board");
        Player player = new Player();
        player.Player();
    }
}