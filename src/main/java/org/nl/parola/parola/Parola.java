package org.nl.parola.parola;

import org.nl.parola.rollen.Gebruiker;
import org.nl.parola.quiz.Quiz;
import org.nl.parola.testcode.ScoreStrategyA;
import org.nl.parola.testcode.ScoreStrategyB;

public class Parola {

    public Quiz quiz;
    public int kostenQuiz = 40;
    public Gebruiker gebruiker;
    public Parola(Quiz quiz, Gebruiker gebruiker){
      this.quiz = quiz;
      this.gebruiker = gebruiker;
    }

    public int spelenQuiz() {

        gebruiker.getIsGevorderd();
        ScoreStrategyA scoreStrategyA = new ScoreStrategyA();
        ScoreStrategyB scoreStrategyB = new ScoreStrategyB();
        int score = quiz.berekenScore(scoreStrategyB);
        System.out.println(score);
        return 0;
    }

    public Gebruiker registreerGebruiker(){
        return new Gebruiker("test@gmail.com", "1234");
    }

}
