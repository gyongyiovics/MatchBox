package com.example.demo.models;

import com.example.demo.helpers.GameHelper;

public class StupidComputer implements Computer {
    @Override
    public int takeMatches(int matchesRemained) {
        return GameHelper.MIN_MATCHES;
    }
}
