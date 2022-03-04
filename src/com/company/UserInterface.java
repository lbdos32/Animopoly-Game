package com.company;

import java.util.Scanner;

public class UserInterface {
    public UserInterface(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello welcome to Animopoly\nThe number of players required is 3");
        for (int x=0;x<3;x++){
            System.out.println("Player x enter your character here:");
            System.out.println(x);
            String input = scanner.nextLine();
            Player player = new Player();
            player.inputPlayerName(input,x);
        }



    }
}
