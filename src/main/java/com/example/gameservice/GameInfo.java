package com.example.gameservice;

public class GameInfo {
    private int number;
    private int guesses;
    private String tip;
    private String guessedBy;

    public GameInfo(int number, String tip) {
        this.number = number;
        this.tip = tip;
        this.guessedBy = null;
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

    public String getGuessedBy() {
        return this.guessedBy;
    }

    public void setGuessedBy(String guessedBy) {
        this.guessedBy = guessedBy;
    }

    public String getTip() {
        return this.tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
