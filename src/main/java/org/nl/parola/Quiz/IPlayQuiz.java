package org.nl.parola.Quiz;

import org.nl.parola.Score.IScoreCalculation;

public interface IPlayQuiz {
    void startQuiz();
    String nextQuestion();
    void processAnswer(String answer);
    boolean quizFinished();
    String getLettersForRightAnswer();
    int calculateScore(String word, IScoreCalculation advancementUser);
}
