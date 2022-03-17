package com.company;

import java.util.Random;

public class Cards {

    private int playerBalance;

    public Cards() {

    }

    public int drawCard() {
        Random rand = new Random();
        int upperBound = 19;
        int lowerBound = 0;
        //generate random values from 1-6
        int card = rand.nextInt(upperBound - lowerBound) + lowerBound;
        switch (card) {
            case 0:
                System.out.println("a terrorist just blew up your zoo ,lose 500 for repair");
                return -500;
            case 1:
                System.out.println("it is a nice and sunny day ,do nothing");
                break;
            case 2:
                System.out.println("bill gates loves you and wants to invest ,gain 300");
                return 300;

            case 3:
                System.out.println("you have a new collab with macdonalds ,gain 270");
                return 270;
            case 4:
                System.out.println("you got robbed on the street.lose 400");
                return 400;

            case 5:
                System.out.println("you have been granted a country for your kindness,gain 550");
                return 550;

            case 6:
                System.out.println("you have to pay for your honeymoon.lose 150");
                return -150;

            case 7:
                System.out.println("a meteor is coming and you had to purchase top of the line defense,lose 350");
                return -350;
            case 8:
                System.out.println("Someone killed most of your animals ,lose 500");
                return -500;
            case 9:
                System.out.println("tax time ,lose 50");
                return -50;

            case 10:
                System.out.println("money fell from the sky ,gain 25");
                return 25;

            case 11:
                System.out.println("speeding fine,lose 50");
                return -50;

            case 12:
                System.out.println("you inherit your parents will, gain 100");
                return 100;

            case 13:
                System.out.println("some of your rivals magically got gunned down,gain 200");
                return 200;

            case 14:
                System.out.println("you organize a huge bake sale,gain 30");
                return 30;


            case 15:
                System.out.println("you have been asked to go to multiple interviews ,collect 400");
                return 400;
            case 16:
                System.out.println("its your birthday,gain 100");
                return 400;

            case 17:
                System.out.println("you found a random goldbar,gain 250");
                return 250;

            case 18:
                System.out.println("time to pay for your kid tuition ,lose 300");
                return -300;

            case 19:
                System.out.println("you meet a alien and he gives you his planet blessing, gain 550");
                return 550;


        }
        return 0;
    }
}