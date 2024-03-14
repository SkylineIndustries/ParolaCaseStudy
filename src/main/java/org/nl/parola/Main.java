package org.nl.parola;

import org.nl.parola.quiz.Quiz;
import org.nl.parola.testcode.IScoreBerekening;
import org.nl.parola.testcode.ScoreStrategyA;
import org.nl.parola.testcode.ScoreStrategyB;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        ScoreStrategyA scoreStrategyA = new ScoreStrategyA();
        ScoreStrategyB scoreStrategyB = new ScoreStrategyB();
        int score = quiz.berekenScore(scoreStrategyB);
        System.out.println(score);
    }
}