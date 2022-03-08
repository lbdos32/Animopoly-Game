package com.company;

import java.util.Random;

public class Cards {

    private String[] Cards = {
            "Advance to go.",
            "a terrorist just blew up your zoo ,lose 500 for repair",
            "it is a nice and sunny day ,do nothing",
            "bill gates loves you and wants to invest ,gain 300",
            "you have a new collab with macdonalds ,gain 270",
            "you got robbed on the street.lose 400",
            "you have been granted a country for your kindness,gain 550",
            "you have to pay for your honeymoon.lose 150",
            "a meteor is coming and you had to purchase top of the line defense,lose 350",
            "Someone killed most of your animals ,lose 500",
            "tax time ,lose 50",
            "money fell from the sky ,gain 25",
            "speeding fine,lose 50",
            "you inherit your parents will,gain 100",
            "some of your rivals magically got gunned down,gain 200",
            "you organize a huge bake sale,gain 30",
            "you have been asked to go to multiple interviews ,collect 400",
            "its your birthday,gain 100",
            "you found a random goldbar,gain 250",
            "time to pay for your kid tuition ,loose 300",
            "you meet a alien and he gives you his planet blessing,gain 550"};


    public class Card {
        private int playerBalance;

        public Card() {
            this.playerBalance = playerBalance;
        }

        public int getPlayerBalance(){
            return playerBalance;
        }

        public void updatePlayerBalance(int playerBalance){
            this.playerBalance = this.playerBalance + playerBalance;
        }



        public String drawCard() {
            int number;
            Random Generate = new Random();
            number = Generate.nextInt((Cards.length - 1) - 0 + 0) + 0;
            return Cards[number];
        }

        public void processCard(Card player, String cardInstruction) {
            System.out.println(cardInstruction);
            switch (cardInstruction) {
                case "a terrorist just blew up your zoo ,lose 500 for repair":
                    player.updatePlayerBalance(-50);
                    break;

                case "it is a nice and sunny day ,do nothing":
                    System.out.println("you got nothing");
                    break;


            }
        }
    }
}