package com.company;

public class Joe {
    public static void Animals() {
        int buyPlace;
        double why = 1.5;
        int player1 = 1;
        int player2 = 2;
        int player3 = 3;
        int player4 = 4;
        int player5 = 5;
        int player6 = 6;
        int[][] AnimalsArray = new int[11][26];
        AnimalsArray[1][1] = 50;
        AnimalsArray[1][2] = 50;
        AnimalsArray[1][3] = 75;
        AnimalsArray[1][4] = 75;
        AnimalsArray[1][5] = 75;
        AnimalsArray[1][6] = 100;
        AnimalsArray[1][7] = 100;
        AnimalsArray[1][8] = 125;
        AnimalsArray[1][9] = 125;
        AnimalsArray[1][10] = 150;
        AnimalsArray[1][11] = 150;
        AnimalsArray[1][12] = 150;
        AnimalsArray[1][13] = 200;
        AnimalsArray[1][14] = 200;
        AnimalsArray[1][15] = 200;
        AnimalsArray[1][16] = 250;
        AnimalsArray[1][17] = 250;
        AnimalsArray[1][18] = 300;
        AnimalsArray[1][19] = 300;
        AnimalsArray[1][20] = 300;
        AnimalsArray[1][21] = 350;
        AnimalsArray[1][22] = 350;
        AnimalsArray[1][23] = 350;
        AnimalsArray[1][24] = 450;
        AnimalsArray[1][25] = 450;
        int n = 1;
        while(n<26) {
            AnimalsArray[2][n] = AnimalsArray[1][n] / 10;
            n = n + 1;
        }
        int v = 1;
        while(v<26) {
            AnimalsArray[3][v] = AnimalsArray[1][v] / 2;
            v = v + 1;
        }
        int m = 1;
        while(m<26) {
            AnimalsArray[4][m] = AnimalsArray[1][m];
            m = m + 1;
        }
        int p = 1;
        while(p<26) {
            AnimalsArray[5][p] = AnimalsArray[1][p] * 2;
            p = p + 1;
        }
        int q = 1;
        while(q<26) {
            AnimalsArray[6][q] = 0;
            q = q + 1;
        }
        int l = 1;
        while(l<26) {
            AnimalsArray[7][l] = 0;
            l = l + 1;
        }
        int o = 1;
        while(o<26) {
            AnimalsArray[10][o] = (AnimalsArray[5][o]/2 + AnimalsArray[5][o]);
            o = o + 1;
        }
        System.out.println(AnimalsArray[2][5]);
    }
    public static void main(String[] args) {
        Animals();
    }
}
