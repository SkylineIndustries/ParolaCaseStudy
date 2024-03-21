package org.nl.parola.testcode;

public class ScoreStrategyB implements IScoreBerekening {
    @Override
    public int berekenScore(int tijd) {
        return tijd / 2;
    }
}
