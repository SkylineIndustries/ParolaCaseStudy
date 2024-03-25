package org.nl.parola.quiz;

import org.nl.parola.External_Software.External_Software;
import org.nl.parola.External_Software.MockExternalSoftware;
import org.nl.parola.MOCKDATA.Timer;
import org.nl.parola.rollen.User;
import org.nl.parola.testcode.IScoreCalculation;
import org.nl.parola.testcode.ScoreStrategyA;
import org.nl.parola.testcode.ScoreStrategyB;
import org.nl.parola.testcode.ScoreStrategyC;
import org.nl.parola.vraag.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Quiz {
    public List<User> user = new ArrayList<>();
    private int answerCount = 0;
    private StringBuilder letters = new StringBuilder();
    private final List<Question> questions;
    private Question currentQuestion;
    private int questionsCorrect;

    public Quiz(User user, List<Question> questions) {
        this.user.add(user);
        this.questions = questions;
    }
    public void startQuiz(String playername) {
        Timer.startTimer();
        User currentUser = getCurrentUser(playername);
        if (currentUser == null) {
            return;
        }
        currentUser.reduceerCredits();
    }

    public String nextQuestion(String playername) {
        if (getCurrentUser(playername) != null) {
            currentQuestion = questions.get(answerCount);
            return currentQuestion.getQuestion();
        }
        return "";
    }

    public void processAnswer(String playername, String answer) {
        if (getCurrentUser(playername) != null) {
            letters.append(currentQuestion.checkAnswer(answer));
            answerCount++;
        }
    }

    public boolean quizFinished(String playername) {
        if (getCurrentUser(playername) != null) {
            return answerCount == 8;
        }
        return false;
    }

    public String getLettersForRightAnswers(String playername) {
        if (getCurrentUser(playername) != null) {
            return letters.toString().replaceAll("\\s", "");
        }
        return "";
    }

    /**
     * This method determines what the status of the user is and calculates a score based on that information.
     *
     * @param playerName name of the user.
     * @param word       word that has been given as an answer.
     * @return the score that the user got.
     */
    public int calculateScore(String playerName, String word) {
        String playerDifficulty = "";
        User currentUser = getCurrentUser(playerName);
        if (currentUser == null) {
            return 0;
        }
        playerDifficulty = currentUser.getIsAdvanced();
        word = checkLegitimateWord(word);
        Timer.stopTimer();
        return calculateScore(deterimeScoreStrategy(playerDifficulty), word);
    }

    private String checkLegitimateWord(String word) {
        External_Software external_software = new MockExternalSoftware();
        Pattern pattern = Pattern.compile("[" + letters.toString() + "]+");
        if (!external_software.isCorrectWord(word) || !word.matches(pattern.pattern())) {
            return "";
        }
        return word;
    }

    private IScoreCalculation deterimeScoreStrategy(String playerDifficulty) {
        return switch (playerDifficulty) {
            case "Amateur" -> ScoreStrategyA.getInstance();
            case "Geavanceerd" -> ScoreStrategyB.getInstance();
            default -> ScoreStrategyC.getInstance();
        };
    }

    private int calculateScore(IScoreCalculation scoreCalculation, String word) {
        return scoreCalculation.calculateScore(getTime(), word);
    }

    /**
     * This method returns the current user of the quiz. If no user has been found, it returns null.
     * This should be handled using exception handling, however due to the scope of the project/case study, this is not needed.
     * You could also add the player to the quiz if a player is not found, but since there is no DB, this will not be done.
     *
     * @param playername name of the current player of the quiz.
     * @return the user from the list of users that plays or has played the quiz.
     */
    private User getCurrentUser(String playername) {
        for (User userQuiz : this.user
        ) {
            if (userQuiz.getEmail().equals(playername)) {
                return userQuiz;
            }
        }
        return null;
    }

    public int getTime() {
        return Timer.getTimeDifference();
    }
}
