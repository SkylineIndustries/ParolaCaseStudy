package org.nl.parola.testcode;

public class ScoreStrategyA implements IScoreCalculation {
    private static ScoreStrategyA instance;
    public static ScoreStrategyA getInstance(){
        if(instance == null){
            instance = new ScoreStrategyA();
        }
        return instance;
    }

    /**
     * {@inheritDoc}
     * Calculates the score for an amateur
     */
    @Override
    public int calculateScore(int time, String word) {
        int score = word.length() * 100;
        score = score - time/5;
        return score;
    }
}
