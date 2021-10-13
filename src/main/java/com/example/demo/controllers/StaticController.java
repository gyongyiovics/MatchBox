package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {
    @GetMapping(value = {"/", "/home"})
    public String getHomePage() {
        return "index";
    }

    @GetMapping(value = "/game")
    public String getGamePage() {
        return "game";
    }
}
