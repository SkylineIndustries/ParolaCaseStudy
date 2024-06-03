package org.nl.parola.Question;

import org.nl.parola.Question.Answer.Answer;

import java.util.List;


public class MultipleChoiceQuestion extends Question {

    ILetterCalculation letterCalculation = new LetterStrategyRandomLetter();

    String question;
    List<Answer> answers;

    public MultipleChoiceQuestion(String question, List<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }

    @Override
    public char checkAnswer(String answerGiven) {
        for (Answer answer : answers
        ) {
            return answer.checkAnswer(answerGiven) ? letterCalculation.getLetter(question) : ' ';
        }
        return ' ';
    }

    @Override
    public String getQuestion() {
        return question;
    }
}
