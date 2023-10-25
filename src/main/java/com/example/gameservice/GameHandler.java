package com.example.gameservice;

import java.util.HashMap;
import java.util.Map;

public final class GameHandler {
    private static HashMap<String, GameInfo> games;
    
    private GameHandler() {
        games = new HashMap<String, GameInfo>();
    }

    public static Integer createGame(String name) {
        if (games.containsKey(name)) {
            return 1;
        }

        games.put(name, new GameInfo(0));


        return 0;
    }
}
