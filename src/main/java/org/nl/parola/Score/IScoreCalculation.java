package org.nl.parola.Score;

public interface IScoreCalculation {
    /**
     * Calculates the score at the end of the quiz.
     *
     * @param time             determines the score based on the time that the player took the quiz.
     * @param word             determines how big of a score the player will receive
     * @param questionsCorrect the total of questions that the player had correctly guessed.
     * @return returns the score of the quiz.
     */
    int calculateScore(int time, String word, int questionsCorrect);
}
