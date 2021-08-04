package com.sebitza.javaexercises.challenges.methods;

public class Methods {
    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHighScorePosition(900));
        displayHighScorePosition("Tim", calculateHighScorePosition(400));
        displayHighScorePosition("Tim", calculateHighScorePosition(50));
        displayHighScorePosition("Mihai", calculateHighScorePosition(1000));
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get to position "
                            + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}
