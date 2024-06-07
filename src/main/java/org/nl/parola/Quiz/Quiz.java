package org.nl.parola.Quiz;

import org.nl.parola.External_Software.External_Software;
import org.nl.parola.External_Software.MockExternalSoftware;
import org.nl.parola.MOCKDATA.Timer;
import org.nl.parola.Question.Question;
import org.nl.parola.Score.IScoreCalculation;

import java.util.List;
import java.util.regex.Pattern;

public class Quiz implements IPlayQuiz {
    private final List<Question> questions;
    private StringBuilder letters = new StringBuilder();
    private int answerCount = 0;
    private Question currentQuestion;
    private int questionsCorrect;

    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public void startQuiz() {
        Timer.startTimer();
    }

    public String nextQuestion() {
        currentQuestion = questions.get(answerCount);
        return currentQuestion.getQuestion();
    }

    public void processAnswer(String answer) {
        letters.append(currentQuestion.checkAnswer(answer));
        answerCount++;
    }

    public boolean quizFinished() {
        return answerCount == 8;
    }

    public String getLettersForRightAnswer() {
        String lettersQuiz = letters.toString().replaceAll("\\s", "");
        questionsCorrect = lettersQuiz.length();
        return lettersQuiz.toLowerCase();
    }

    /**
     * This method determines what the status of the user is and calculates a score based on that information.
     *
     * @param advancementUser advancement of the user.
     * @param word            word that has been given as an answer.
     * @return the score that the user got.
     */
    public int calculateScore(String word, IScoreCalculation advancementUser) {
        word = checkLegitimateWord(word);
        Timer.stopTimer();
        return calculateScore(advancementUser, word);
    }

    private String checkLegitimateWord(String word) {
        External_Software external_software = new MockExternalSoftware();
        Pattern pattern = Pattern.compile("[" + letters + "]+");
        if (!external_software.isCorrectWord(word) || !word.matches(pattern.pattern())) {
            return "";
        }
        return word;
    }

    private int calculateScore(IScoreCalculation scoreCalculation, String word) {
        return scoreCalculation.calculateScore(getTime(), word, questionsCorrect);
    }

    public int getTime() {
        return Timer.getTimeDifference();
    }
}
