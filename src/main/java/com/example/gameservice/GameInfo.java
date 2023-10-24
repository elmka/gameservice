package com.example.gameservice;

public class GameInfo {
    private int number;
    private int guesses;

    public GameInfo(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGuesses() {
        return this.guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }
}
