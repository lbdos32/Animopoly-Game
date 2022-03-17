package com.company;
import java.util.Random;
public class ThrowDice {

    public static int throwDie() {
        Random rand = new Random();
        int upperBound = 6;
        int lowerBound = 1;
        //generate random values from 1-6
        int die = rand.nextInt(upperBound - lowerBound) + lowerBound;
        //System.out.println(random);
        return die;
    }

    public boolean checkDoubles(int die1, int die2) {
        return die1 == die2;
    }
}
