package org.nl;

import org.nl.parola.MOCKDATA.MockDatabase;
import org.nl.parola.quiz.Quiz;

public class ParolaController {
    private static ParolaController instance;
    Quiz quiz;
    public static ParolaController getInstance() {
        if(instance == null){
            instance = new ParolaController();
        }
        return instance;
    }

    public void startQuiz(String playername) {
        this.quiz = MockDatabase.getQuiz(playername);
        quiz.startQuiz(playername);
    }

    public String nextQuestion(String playername) {
        return quiz.nextQuestion(playername);
    }

    public void processAnswer(String playername, String answer) {
        this.quiz.processAnswer(playername, answer);
    }

    public boolean quizFinished(String playername) {
        return quiz.quizFinished(playername);
    }

    public String getLettersForRightAnswers(String playername) {
        return quiz.getLettersForRightAnswers(playername);
    }

    public int calculateScore(String playername, String word) {
        return quiz.calculateScore(playername ,word);
    }
}
