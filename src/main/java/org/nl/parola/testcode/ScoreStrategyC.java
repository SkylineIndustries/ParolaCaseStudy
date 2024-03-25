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
     * Calculates the score for a beginning player
     */
    @Override
    public int calculateScore(int time, String word, int questionsCorrect) {
        int score = word.length() * 110;
        score = score + questionsCorrect * 100;
        score = score - time/10;
        return Math.max(score, 0);
    }
}