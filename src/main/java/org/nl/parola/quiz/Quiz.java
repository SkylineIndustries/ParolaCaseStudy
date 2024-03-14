package org.nl.parola.quiz;

import org.nl.parola.testcode.IScoreBerekening;
import org.nl.parola.testcode.ScoreStrategyA;
import org.nl.parola.testcode.ScoreStrategyB;

import java.sql.Time;

public class Quiz {

    private Time tijd;

    public void setTijd(Time tijd) {
        this.tijd = tijd;
    }

    public Time getTijd() {
        return tijd;
    }

    public int berekenScore(IScoreBerekening scoreBerekening){
        int tijd = 10;
        return scoreBerekening.berekenScore(tijd);
    }
}
