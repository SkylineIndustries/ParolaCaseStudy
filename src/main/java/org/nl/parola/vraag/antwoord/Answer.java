package org.nl.parola.vraag.antwoord;

public class Answer {

    String answer;

    public Answer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String answer) {
        return this.answer.equalsIgnoreCase(answer);
    }

}