package com.example.demo.helpers;

import com.example.demo.models.CleverComputer;
import com.example.demo.models.Computer;
import com.example.demo.models.RandomComputer;
import com.example.demo.models.StupidComputer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ComputerFactory {

    @Bean("ListOfAll")
    public List<Computer> getAllComputers() {
        List<Computer> computers = new ArrayList<>();

        computers.add(new StupidComputer());
        computers.add(new RandomComputer());
        computers.add(new CleverComputer());

        return computers;
    }

    @Bean("stupid")
    public Computer getStupid() {
        return new StupidComputer();
    }

    @Bean("random")
    public Computer getRandom() {
        return new RandomComputer();
    }

    @Bean("clever")
    public Computer getClever() {
        return new CleverComputer();
    }

    @Bean("stupidAndRandom")
    public List<Computer> getStupidAndRandom() {
        List<Computer> computers = new ArrayList<>();

        computers.add(new StupidComputer());
        computers.add(new RandomComputer());

        return computers;
    }

    @Bean("stupidAndClever")
    public List<Computer> getStupidAndClever() {
        List<Computer> computers = new ArrayList<>();

        computers.add(new StupidComputer());
        computers.add(new CleverComputer());

        return computers;
    }

    @Bean("randomAndClever")
    public List<Computer> getRandomAndClever() {
        List<Computer> computers = new ArrayList<>();

        computers.add(new RandomComputer());
        computers.add(new CleverComputer());

        return computers;
    }

}
