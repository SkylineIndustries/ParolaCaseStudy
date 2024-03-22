package org.nl.parola.antwoord;

public class Answer {
    private boolean isCorrect;
    private String name;

    public Answer(String name) {
        this.name = name;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

}
