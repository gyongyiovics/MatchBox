package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class MatchGameService {

    public String getTextWithNumber(boolean isForUser, int number) {
        if(isForUser) {
            return "A te számod: " + number;
        }
        return "A program száma: " + number;
    }

    //TODO: logic here
    public String getWinnerMsg(int userNum, int progNum) {
        if(userNum > progNum) {
            return "Te nyertél!";
        } else if(userNum < progNum) {
            return "A program nyert!";
        }
        return "Döntetlen!";
    }



    public int random(int min, int max) {
        return (int) (Math.random() * max + min);
    }
}
