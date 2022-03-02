package com.company;

public class Main {
    private String playerName;
    private static int playerx = 1;
    public static void main(String[] args) {
        System.out.println("Main");
        Board board = new Board();
        board.Board();
        new UserInterface();
        Player player = new Player();
        String playerName = player.getPlayerName(playerx);
        System.out.println("This is the name of the player" + playerName);
    }
}
