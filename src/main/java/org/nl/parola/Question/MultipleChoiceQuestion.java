package org.nl.parola.Question;

import org.nl.parola.Question.Answer.Answer;

import java.util.List;


public class MultipleChoiceQuestion extends Question {

    ILetterCalculation letterCalculation = new LetterStrategyFirstLetter();

    String question;
    List<Answer> wrongAnswers;

    Answer rightAnswer;

    public MultipleChoiceQuestion(String question, List<Answer> answers, Answer rightAnswer) {
        this.question = question;
        this.wrongAnswers = answers;
        this.rightAnswer = rightAnswer;
    }

    @Override
    public char checkAnswer(String answerGiven) {
            return rightAnswer.checkAnswer(answerGiven) ? letterCalculation.getLetter(question) : ' ';
    }

    @Override
    public String getQuestion() {
        return question;
    }
}
