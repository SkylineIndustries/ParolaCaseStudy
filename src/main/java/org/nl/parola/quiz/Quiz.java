package org.nl.parola.quiz;

import org.nl.parola.antwoord.Antwoord;
import org.nl.parola.parola.Parola;
import org.nl.parola.rollen.Gebruiker;
import org.nl.parola.testcode.IScoreBerekening;
import org.nl.parola.testcode.ScoreStrategyA;
import org.nl.parola.testcode.ScoreStrategyB;

import java.sql.Time;

public class Quiz implements Parola {

    private Time tijd;
    public Gebruiker gebruiker;

    public Quiz(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    @Override
    public int geefWoord(String woord) {

        gebruiker.getIsGevorderd();
        ScoreStrategyA scoreStrategyA = new ScoreStrategyA();
        ScoreStrategyB scoreStrategyB = new ScoreStrategyB();
        int score = berekenScore(scoreStrategyB);
        System.out.println(score);
        return 0;
    }

    @Override
    public char[] beantwoordVraag(Antwoord antwoord) {
        return new char[0];
    }


    private int berekenScore(IScoreBerekening scoreBerekening) {
        int tijd = 10;
        return scoreBerekening.berekenScore(tijd);
    }

    public void setTijd(Time tijd) {
        this.tijd = tijd;
    }

    public Time getTijd() {
        return tijd;
    }
}
