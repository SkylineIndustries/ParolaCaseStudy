package org.nl.parola;


import org.nl.ParolaController;
import org.nl.parola.MOCKDATA.Timer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ParolaController parola = ParolaController.getInstance();
//        parola.startQuiz("Jeffrey");
//        System.out.println(parola.calculateScore("Jeffrey", "Kaas"));
        Timer.startTimer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your player name: ");
        String playername = scanner.nextLine();
        Timer.stopTimer();
        System.out.println(Timer.getTimeDifference());
    }
}