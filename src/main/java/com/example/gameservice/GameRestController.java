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

    @GetMapping("/a")
    public String a(@RequestParam String p1, @RequestParam(required = false) String p2) {
        return p1 + " " + p2;
    }

    @GetMapping("/game/{id}")
    public String getGame(@PathVariable Integer id) {
        return id.toString();
    }

    @PostMapping("/c")
    public String postMethodName(@RequestParam String p1) {
        return "c";
    }
}
