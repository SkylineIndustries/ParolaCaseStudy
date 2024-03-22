package org.nl.parola.testcode;

public class ScoreStrategyB implements IScoreCalculation {
    private static ScoreStrategyB instance;
    public static ScoreStrategyB getInstance(){
        if(instance == null){
            instance = new ScoreStrategyB();
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
