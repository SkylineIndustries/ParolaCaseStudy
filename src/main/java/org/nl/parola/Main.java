package org.nl.parola;


import org.nl.ParolaController;

public class Main {
    public static void main(String[] args) {
        ParolaController parola = ParolaController.getInstance();
        parola.startQuiz("Jeffrey");
        System.out.println(parola.calculateScore("Jeffrey", "Kaas"));
    }
}