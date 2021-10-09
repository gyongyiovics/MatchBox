package com.example.demo.gaming;

import com.example.demo.models.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class Simulation {
    private List<Computer> computers;

    @Autowired
    public Simulation(@Qualifier("listOfAll") List<Computer> computers) {
        this.computers = computers;
    }

    public void run() {
        //add logic...
    }
}
