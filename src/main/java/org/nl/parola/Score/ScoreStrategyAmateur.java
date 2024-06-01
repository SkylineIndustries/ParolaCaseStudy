package org.nl.parola.Score;

public class ScoreStrategyAmateur implements IScoreCalculation {
    private static ScoreStrategyAmateur instance;

    public static ScoreStrategyAmateur getInstance() {
        if (instance == null) {
            instance = new ScoreStrategyAmateur();
        }
        return instance;
    }

    /**
     * {@inheritDoc}
     * Calculates the score for an amateur
     */
    @Override
    public int calculateScore(int time, String word, int questionsCorrect) {
        int score = word.length() * 75;
        score = score + questionsCorrect * 75;
        score = score - time / 5;
        return Math.max(score, 0);
    }
}
