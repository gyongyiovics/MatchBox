package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatchGameController {
    @GetMapping(value = "/play")
    public String getGamePage() {
        return "play";
    }

}
