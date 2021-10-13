package com.example.demo.gaming;

import com.example.demo.helpers.GameHelper;
import com.example.demo.models.Computer;
import com.example.demo.models.StupidComputer;

import java.util.Scanner;

public class GameField {

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Computer enemy = new StupidComputer();
        int matches = GameHelper.random(4, 40);

        do {
            System.out.println("Matches on the table: " + matches); // -> p
            System.out.println("Take 1-3 matches!"); // -> p
            int playerMatches = scanner.nextInt(); // -> form
            matches -= playerMatches;

            if(matches == 1) { // -> p
                System.out.println("You won!");
                break;
            }

            int enemyMatches = enemy.takeMatches(matches);
            matches -= enemyMatches;

            System.out.println("Computer took " + enemyMatches + " matches.");

            if(matches == 1) {
                System.out.println("Computer won!");
                break;
            }
        } while (true);
    }
}
