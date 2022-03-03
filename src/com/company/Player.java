package com.company;

public class Player extends Board{


    public Player(String name, int money , int space) {
        //Constructor
        String name1 = name;
        
        int money1 = money;
        int space1 = space;
        //
    }
    public static void Player(){
        Player player1 = new Player("*", 1, 1);
        Player player2 = new Player("/", 19, 6);
        Player player3 = new Player("/", 19, 6);

        Board board = new Board();
        System.out.println("Ur mum");
        System.out.println(board.test);
    }
    public void inputPlayerName(String nameInput){

    }
    public String getPlayerName(int playerx){
        String err = "Player does not exist";
        if(playerx == 1){
            String playerName = Player player1;
            return playerName;
        }
        if(playerx == 2){
            String playerName = Player player1;
            return playerName;
        }if(playerx == 3){
            String playerName = player3;
            return playerName;
        }
        return err;

        }
}
