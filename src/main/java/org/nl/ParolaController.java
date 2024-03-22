package org.nl;

import org.nl.parola.quiz.Quiz;
import org.nl.parola.rollen.User;
import org.nl.parola.testcode.ScoreStrategyA;

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
        this.quiz = new Quiz(new User(playername, playername));
        quiz.setTime(100);
        // throw new UnsupportedOperationException("Unimplemented method 'startQuiz'");
    }

    public char[] nextQuestion(String playername) {
        char[] result = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        return result;
    }

    public void processAnswer(String playername, String answer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processAnswer'");
    }

    public boolean quizFinished(String playername) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quizFinished'");
    }

    public String getLettersForRightAnswers(String playername) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLettersForRightAnswers'");
    }

    public int calculateScore(String playername, String word) {
        return quiz.giveWord(playername ,word);
    }

}
