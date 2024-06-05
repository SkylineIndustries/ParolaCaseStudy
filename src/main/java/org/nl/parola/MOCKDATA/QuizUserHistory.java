package org.nl.parola.MOCKDATA;

import org.nl.parola.Quiz.IPlayQuiz;
import org.nl.parola.Roles.User;

import java.util.ArrayList;
import java.util.List;

public class QuizUserHistory {

    private static QuizUserHistory instance;
    private int score;
    private StringBuilder letters;
    private int currentQuestion;
    private int numberOfQuestionsCorrect;
    private User currentUser;
    private IPlayQuiz iPlayQuiz;
    private List<User> users;

    public static QuizUserHistory getInstance() {
        if (instance == null) {
            instance = new QuizUserHistory();
        }
        return instance;
    }

    public void setQuiz(String userName) {
        iPlayQuiz = MockDatabase.getQuiz(userName);
    }

    public void saveQuizData() {
    }

    public void startQuiz(String playerName) {
        if (playerName == null) {
            return;
        }
        setUsers(playerName);
        setQuiz(playerName);
        MockDatabase.getUser(playerName).reduceCredits();
        iPlayQuiz.startQuiz();
    }

    public String nextQuestion(String playerName) {
        return iPlayQuiz.nextQuestion();
    }

    public void processAnswer(String playerName, String answer) {
        iPlayQuiz.processAnswer(answer);
    }

    public boolean quizFinished(String playerName) {
        return iPlayQuiz.quizFinished();
    }

    public String getLettersForRightAnswers(String playerName) {
        return iPlayQuiz.getLettersForRightAnswer();
    }

    public int calculateScore(String playerName, String word) {
        if (playerName == null) {
            return 0;
        }
        return iPlayQuiz.calculateScore(word, MockDatabase.getUser(playerName).getIsAdvanced());
    }

    public void setUsers(String playerName) {
        if (this.users.isEmpty()) {
            this.users = new ArrayList<>();
        }
        this.users.add(MockDatabase.getUser(playerName));
    }
}

