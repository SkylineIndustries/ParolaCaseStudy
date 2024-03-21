package org.nl.parola.testcode;

public class ScoreStrategyA implements IScoreBerekening{

    public ScoreStrategyA(){

    }
    @Override
    public int berekenScore(int tijd) {
        return tijd + (tijd *2);
    }
}
