package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatchGameController {

    @GetMapping(value = "/game")
    public String getGamePage() {
        return "game";
    }

    @GetMapping(value = "/play")
    public String getPlayPage() {
        //TODO: logic here --> call service
        return "play";
    }

}
