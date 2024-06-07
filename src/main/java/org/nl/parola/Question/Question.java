package org.nl.parola.Question;

public abstract class Question {

    String question;

    boolean active;

    public char checkAnswer(String answer) {
        return 0;
    }

    public String getQuestion() {
        return question;
    }
}
