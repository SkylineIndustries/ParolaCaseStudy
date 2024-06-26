package org.nl.parola.Score;

public class ScoreStrategyBeginning implements IScoreCalculation {
    private static ScoreStrategyBeginning instance;
    public static ScoreStrategyBeginning getInstance(){
        if(instance == null){
            instance = new ScoreStrategyBeginning();
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