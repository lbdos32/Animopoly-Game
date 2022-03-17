package com.company;
public class Animals extends BoardCharacter {

    public Animals(String name, int cost,int owner, int level, int posi) {
        super(name, cost);
        this.location = location;
        this.level = level;
        this.owner = owner;
        this.posi = posi;
        Animals.assignAnimalsName(name,cost,owner,level, posi);
    }

    private static void assignAnimalsName(String name, int cost, int owner, int level, int posi) {
    }
}