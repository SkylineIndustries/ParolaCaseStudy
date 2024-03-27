package org.nl.parola.Question;

import org.nl.parola.Question.Answer.Answer;

import java.util.List;

public class ShortAnswerQuestion extends Question {

    char letter;
    String question;

    List<Answer> answers;

    public ShortAnswerQuestion(String question, char letter, List<Answer> answers) {
        this.question = question;
        this.letter = letter;
        this.answers = answers;
    }

    @Override
    public char checkAnswer(String answerGiven) {
        for (Answer answer : answers
        ) {
            return answer.checkAnswer(answerGiven) ? letter : ' ';
        }
        return ' ';
    }

    @Override
    public String getQuestion() {
        return question;
    }
}
