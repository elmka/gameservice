package com.example.gameservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GameRestController {

    @GetMapping("/")
    public String index() {
        return "Numeronarvauspeli <br><br> /games/ongoing : hae kaikki käynnissä olevat pelit <br>- output formaatti: pelin id, vinkki <br><br> /games/{id} : hae tietty peli <br>- output formaatti: pelin id, vinkki <br><br> /games/new : uusi peli <br>- input parametrit: number, tip<br>- output: pelin id<br><br>/games/guess<br>- input parametrit: nickname, id, number";
    }

    @GetMapping("/games/{id}")
    public String getGame(@PathVariable int id) {
        String tip = GameHandler.getGame(id).getTip();
        return id + ", " + tip;
    }

    @GetMapping("/games/ongoing")
    public String getOngoingGames() {
        ArrayList<String> ongoing = GameHandler.getOngoingGames();
        return String.join("\n", ongoing);
    }

    @PostMapping("/games/new")
    public String createGame(@RequestParam int number, @RequestParam String tip) {
        return GameHandler.createGame(number, tip).toString();
    }

    @PostMapping("/games/guess")
    public String createGame(@RequestParam String nickname, @RequestParam int id, @RequestParam int number) {
        return GameHandler.guessNumber(id, number, nickname).toString();
    }
}
