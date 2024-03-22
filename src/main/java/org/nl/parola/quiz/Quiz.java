package org.nl.parola.quiz;

import org.nl.parola.rollen.User;
import org.nl.parola.testcode.IScoreCalculation;
import org.nl.parola.testcode.ScoreStrategyA;
import org.nl.parola.testcode.ScoreStrategyB;
import org.nl.parola.testcode.ScoreStrategyC;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private int time;
    public List<User> user = new ArrayList<>();

    public Quiz(User user) {
        this.user.add(user);
    }

    /**
     * This method determines what the status of the user is and calculates a score based on that information.
     * @param playerName name of the user.
     * @param word word that has been given as an answer.
     * @return the score that the user got.
     */
    public int calculateScore(String playerName, String word) {
        String playerDifficulty = "";
        for (User userQuiz : this.user
        ) {
            if (userQuiz.getEmail().equals(playerName)) {
                playerDifficulty = userQuiz.getIsAdvanced();
            }
        }
        return calculateScore(deterimeScoreStrategy(playerDifficulty), word);
    }


    private IScoreCalculation deterimeScoreStrategy(String playerDifficulty){
        switch (playerDifficulty){
            case "Amateur":
                return ScoreStrategyA.getInstance();
            case "Geavanceerd":
                return ScoreStrategyB.getInstance();
            default:
                return ScoreStrategyC.getInstance();
        }
    }

    private int calculateScore(IScoreCalculation scoreCalculation, String word) {
        return scoreCalculation.calculateScore(getTime(), word);
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}
