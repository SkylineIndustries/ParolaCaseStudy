package org.nl;


import org.nl.parola.Quiz.QuizUserHistory;


public class ParolaController {
    private static ParolaController instance;
    QuizUserHistory quizUserHistory;

    public static ParolaController getInstance() {
        if (instance == null) {
            instance = new ParolaController();
        }
        return instance;
    }

    public void startQuiz(String playername) {
        quizUserHistory = QuizUserHistory.getInstance();
        quizUserHistory.startQuiz(playername);
    }

    public String nextQuestion(String playername) {
        return quizUserHistory.nextQuestion(playername);
    }

    public void processAnswer(String playername, String answer) {
        this.quizUserHistory.processAnswer(playername, answer);
    }

    public boolean quizFinished(String playername) {
        return quizUserHistory.quizFinished(playername);
    }

    public String getLettersForRightAnswers(String playername) {
        return quizUserHistory.getLettersForRightAnswers(playername);
    }

    public int calculateScore(String playername, String word) {
        return quizUserHistory.calculateScore(playername, word);
    }
}
