package org.nl.parola.testcode;

public class ScoreStrategyC implements IScoreCalculation {
    private static ScoreStrategyC instance;
    public static ScoreStrategyC getInstance(){
        if(instance == null){
            instance = new ScoreStrategyC();
        }
        return instance;
    }
    /**
     * {@inheritDoc}
     * Calculates the score for an advanced player
     */
    @Override
    public int calculateScore(int time, String word) {
        int score = word.length() * 100;
        score = score - time;
        return score;
    }
}