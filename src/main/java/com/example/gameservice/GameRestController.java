package com.example.gameservice;

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
        return "ok";
    }

    @GetMapping("/games/{id}")
    public String getGame(@PathVariable int id) {
        return GameHandler.getGame(id);
    }

    @GetMapping("/games/ongoing")
    public String getOngoingGames() {
        return GameHandler.getOngoingGames();
    }

    @PostMapping("/games/new")
    public String createGame(@RequestParam int number, @RequestParam String tip) {
        return GameHandler.createGame().toString();
    }

    @PostMapping("/games/guess")
    public String createGame(@RequestParam String nickname, @RequestParam int id, @RequestParam int number) {
        return GameHandler.guessNumber(nickname, id, number).toString();
    }
}
