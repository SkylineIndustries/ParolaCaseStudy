package org.nl.parola.vraag;

import org.nl.parola.vraag.antwoord.Answer;

import java.util.List;

public abstract class Question {

    String question;
    private List<Answer> answers;


    public char checkAnswer(String answer) {
        return 0;
    }

    public String getQuestion() {
        return question;
    }
}
