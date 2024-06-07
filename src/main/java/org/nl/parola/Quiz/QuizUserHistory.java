package org.nl.parola.Quiz;

import org.nl.parola.MOCKDATA.MockDatabase;
import org.nl.parola.Roles.User;

import java.util.ArrayList;
import java.util.List;

public class QuizUserHistory {

    private static QuizUserHistory instance;
    private int score;
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
        if(playerName.isEmpty()){
            return "";
        }
        return iPlayQuiz.nextQuestion();
    }

    public void processAnswer(String playerName, String answer) {
        if(playerName.isEmpty()){
            return;
        }
        iPlayQuiz.processAnswer(answer);
    }

    public boolean quizFinished(String playerName) {
        return iPlayQuiz.quizFinished() && !playerName.isEmpty();
    }

    public String getLettersForRightAnswers(String playerName) {
        if(playerName.isEmpty()){
            return "";
        }
        return iPlayQuiz.getLettersForRightAnswer();
    }

    public int calculateScore(String playerName, String word) {
        if (playerName == null) {
            return 0;
        }
        this.score = iPlayQuiz.calculateScore(word, MockDatabase.getUser(playerName).getIsAdvanced());
        saveQuizData();
        return this.score;
    }

    public void saveQuizData() {
        MockDatabase.saveQuizData(score, currentUser, iPlayQuiz);
    }

    public void setUsers(String playerName) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        currentUser = MockDatabase.getUser(playerName);
        this.users.add(currentUser);
    }
}

