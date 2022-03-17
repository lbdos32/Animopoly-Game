package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    private int recentGo = 0;
    private boolean isWinner = false;
    private String winner;
    private int numLosers = 0;
    private boolean landGo;
    private boolean passGo;
    Player Plowner;
    private ArrayList<Player> player = new ArrayList<>();
    private ArrayList<Animals> animals = new ArrayList<>();

    //DicePair dice;
    public Board() {

    }
    public void setup(){
        this.recentGo = 0;
        animals.add(new Animals("Ant", 50,6,0,1)); // This Array list allows us to get the information required for each animal!
        animals.add(new Animals("Caterpillar", 50,6,0,2));
        animals.add(new Animals("Spider", 75,6,0,3));
        animals.add(new Animals("Goldfish", 75,6,0,4));
        animals.add(new Animals("Bat", 75,6,0,5));
        animals.add(new Animals("Mouse", 100,6,0,6));
        animals.add(new Animals("Robin", 100,6,0,7));
        animals.add(new Animals("Hamster", 125,6,0,8));
        animals.add(new Animals("Rat", 125,6,0,9));
        animals.add(new Animals("Cat", 150,6,0,10));
        animals.add(new Animals("Dog", 150,6,0,11));
        animals.add(new Animals("Capybara", 150,6,0,12));
        animals.add(new Animals("Otter", 200,6,0,14));
        animals.add(new Animals("Narwhal", 200,6,0,15));
        animals.add(new Animals("Eagle", 250,6,0,16));
        animals.add(new Animals("Bull Shark", 250,6,0,17));
        animals.add(new Animals("Tiger", 300,6,0,18));
        animals.add(new Animals("Great White Shark", 300,6,0,19));
        animals.add(new Animals("Orca", 300,6,0,20));
        animals.add(new Animals("Polar Bear", 350,6,0,21));
        animals.add(new Animals("Lion", 350,6,0,22));
        animals.add(new Animals("Giraffe", 350,6,0,23));
        animals.add(new Animals("Elephant", 450,6,0,24));
        animals.add(new Animals("Blue Whale", 450,6,0,25));

    }
    public void playRound() {
        Scanner scanner = new Scanner(System.in);

        while (!isWinner) {
            //plays a round until there is a winner
            if (recentGo >= 3) {
                numLosers = 0;
                recentGo = 0;
            }
            //resets recentGo and numLosers every time all 3 players have had a go.
            BoardCharacter player = this.player.get(recentGo);
            //gets the player information based on the player who just went
            boolean isBankrupt = player.checkBankrupt();
            numLosers++;
            //checks if the player is bankrupt
            if (!isBankrupt) {
                //if they are bankrupt they cannot play and their go is skipped

                System.out.println("It is " + player.getName() + "'s go\nYour current location is " + player.location + "\nYou have " + player.funds + " monies\nType any key to roll the dice:");
                scanner.nextLine();
                //type to roll dice
                ThrowDice throwDice = new ThrowDice();
                //init dice
                int die1 = throwDice.throwDie();
                int die2 = throwDice.throwDie();
                //throws dice
                int diceTotal = die1 + die2;
                //calculates total distance moved
                boolean doubles = throwDice.checkDoubles(die1, die2);
                //checks for doubles
                System.out.println("You rolled a " + die1 + " and a " + die2);
                //tells player what they rolled
                if (!doubles) {
                    System.out.println("This totals to a " + diceTotal);
                } else {
                    System.out.println("You rolled a doubles!");
                    Cards cards = new Cards();
                    int card = cards.drawCard();
                    //if they roll doubles then draws a card
                    player.changeValue(card);
                    //updates the player's value based on the outcome of the card
                }
                passGo = player.isPassGo(diceTotal);
                //checks if a play has passed go
                if (passGo) {
                    player.passGo();
                    //adds the money for the player passing go
                }
                player.updateLocation(diceTotal);
                //moves the player
                landGo = player.isLandGo(diceTotal);
                //checks if the player lands on go
                if (landGo) {
                    player.landGo();
                    //adds money for landing on go
                }
                int g = 0;
                while (g < 24) { // Runs every single location comparing it to the location of the player to give them the option to buy.
                    if (animals.get(g).getPosi() == player.location) {
                        System.out.println("You landed on " + animals.get(g).getName());
                        System.out.println("This is " + player.location);
                        if (animals.get(g).getOwner() == recentGo) {
                            System.out.println("You own this animal!");
                        } else if (animals.get(g).getOwner() < 5) {
                            if (animals.get(g).getOwner() == 0) {
                                Plowner = this.player.get(0);
                            } else if (animals.get(g).getOwner() == 1) {
                                Plowner = this.player.get(1);
                            } else if (animals.get(g).getOwner() == 2) {
                                Plowner = this.player.get(2);
                            }
                            System.out.println("This animal is already owned by player " + Plowner);
                            if (animals.get(g).getLevel() == 0) {
                                System.out.println("You owe that player " + animals.get(g).getValue() / 10);
                                player.funds = player.funds - animals.get(g).getValue() / 10;
                                Plowner.funds = Plowner.funds + animals.get(g).getValue() / 10;
                            } else if (animals.get(g).getLevel() == 1) {
                                System.out.println("You owe that player " + animals.get(g).getValue() / 2);
                                player.funds = player.funds - animals.get(g).getValue() / 2;
                                Plowner.funds = Plowner.funds + animals.get(g).getValue() / 2;
                            } else if (animals.get(g).getLevel() == 2) {
                                System.out.println("You owe that player " + animals.get(g).getValue());
                                Plowner.funds = Plowner.funds + animals.get(g).getValue();
                            } else if (animals.get(g).getLevel() == 3) {
                                System.out.println("You owe that player " + animals.get(g).getValue() * 2);
                                player.funds = player.funds - animals.get(g).getValue() * 2;
                                Plowner.funds = Plowner.funds + animals.get(g).getValue() * 2; //Takes the funds from one player and gives them to another!
                            }
                        } else {
                            System.out.println("No body owns this animal. \nWould you like to buy it? \nIt costs " + animals.get(g).getValue());
                            int f = 6;
                            while (f == 6) {
                                System.out.println("\nPress 1 for yes and 2 for no");
                                int buy = scanner.nextInt();
                                switch (buy) {
                                    case 1: {
                                        if (player.funds - animals.get(g).getValue() > 0) {
                                            player.funds = player.funds - animals.get(g).getValue();
                                            animals.get(g).setOwner((recentGo));
                                            System.out.println("You now own " + animals.get(g).getName());
                                            System.out.println("You currently have " + player.funds + "monies"); // Tells you how close you are to being bankrupt
                                        } else {
                                            System.out.println("You do not have the money to afford it!");
                                        }
                                        f = 57;
                                        break;
                                    }
                                    case 2: {
                                        f = 87;
                                        break;
                                    }
                                    default: {
                                        System.out.println("Invalid input!");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    g = g + 1;
                }
                int l = 8;
                while (l == 8) {
                    System.out.println("Would you like to upgrade any of your animals?");
                    System.out.println("Press 1 for yes and 2 for no!");
                    int upgrade = scanner.nextInt();
                    switch (upgrade) {
                        case 1: {
                            System.out.println("What animal would you like to upgrade");
                            int p = 5;
                            while (p == 5) {
                                System.out.println("Enter the number based off their location on the board. \nE.G ant = 1, Caterpillar = 2");
                                int lev = scanner.nextInt();
                                if (lev < 13) {
                                    lev = lev - 1;
                                    p = 7;
                                }
                                else if (lev > 13 && lev < 24){ //Levelling up system because the numbers are 1 up in the array list and above skip a turn then it takes 2 off them.
                                    lev = lev - 2;
                                    p = 6;
                                }
                                else {
                                    System.out.println("Invalid input!");
                                }
                                System.out.println("You are trying to upgrade " + animals.get(lev).getName());
                                if (animals.get(lev).getOwner() == recentGo) {
                                    if (animals.get(lev).getLevel() == 3) {
                                        System.out.println("You have reached the max level for this animal!\nYou can no longer upgrade it");
                                    } else if (animals.get(lev).getLevel() == 2) {
                                        int upgrade3;
                                        upgrade3 = animals.get(lev).getValue() * 3;
                                        if (player.funds - upgrade3 > 0) { // these make sure they can afford it.
                                            System.out.println(animals.get(lev).getName() + " is now level 3!");
                                            player.funds = player.funds - upgrade3;
                                            animals.get(lev).setLevel(3);
                                        } else {
                                            System.out.println("You don't have the funds for that!");
                                        }
                                    } else if (animals.get(lev).getLevel() == 1) {
                                        int upgrade2;
                                        upgrade2 = animals.get(lev).getValue() + animals.get(lev).getValue() / 2;
                                        if (player.funds - upgrade2 > 0) {
                                            System.out.println(animals.get(lev).getName() + " is now level 2!");
                                            player.funds = player.funds - upgrade2;
                                            animals.get(lev).setLevel(2);
                                        } else {
                                            System.out.println("You don't have the funds for that!");
                                        }
                                    } else if (animals.get(lev).getLevel() == 0) {
                                        int upgrade1;
                                        upgrade1 = animals.get(lev).getValue() * 3;
                                        upgrade1 = upgrade1/4;
                                        if (player.funds - upgrade1 > 0) {
                                            System.out.println(animals.get(lev).getName() + " is now level 1!");
                                            player.funds = player.funds - upgrade1;
                                            animals.get(lev).setLevel(1);
                                        } else {
                                            System.out.println("You don't have the funds for that!");
                                        }
                                    }
                                } else {
                                    System.out.println("You don't own this animal!");
                                }
                            }
                            break;
                        }
                        case 2: {
                            l = 65;
                            break;
                        }
                        default: {
                            System.out.println("Invalid input!");
                            break;
                        }
                    }
                }
                System.out.println("Your location is now " + player.location);
                System.out.println("You now have " + player.funds + " monies");
            } else {
                System.out.println("Player " + player.getName() + " is bankrupt");
            }

            recentGo++;
        }
    }
    //System.out.println("Type y if you would like to upgrade any animals?");
    //String input = scanner.nextLine();
    //if (input.equals("y")){
    //check
    //}


    public void assignPlayerName(String name){
        int funds = 2000;
        player.add(new Player(name, funds));
    }

}