package com.example.gameservice;

import java.util.ArrayList;
import java.util.HashMap;

public final class GameHandler {
    private static HashMap<Integer, GameInfo> games = new HashMap<Integer, GameInfo>();
    private static int id;
    
    private GameHandler() {
        this.id = 0;
    }

    public static Integer createGame(int number, String tip) {
        id++;
        games.put(id, new GameInfo(number, tip));
        return id;
    }

    public static GameInfo getGame(int id) {
        return games.get(id);
    }

    public static String guessNumber(int id, int number, String name) {
        String guessedBy = games.get(id).getGuessedBy();

        if (guessedBy != null) {
            return guessedBy + " already found the number!";
        }

        int correctNum = games.get(id).getNumber();

        if (number == correctNum) {
            games.get(id).setGuessedBy(name);
            return "Congratulations, you found the number!";
        }
        else
        {
            return "Wrong number. Try again!";
        }
    }

    public static ArrayList<String> getOngoingGames() {
        var ret = new ArrayList<String>();
        
        for (HashMap.Entry<Integer, GameInfo> entry : games.entrySet()) {
            System.out.println("adasdas: " + entry.getKey().toString() + " " + entry.getValue().getTip());
            ret.add(entry.getKey().toString() + ", " + entry.getValue().getTip());
        }

        return ret;
    }
}
