package org.nl.parola.vraag;

public abstract class Question {

    private boolean isMultipleChoice;

    public boolean isMultipleChoice() {
        return isMultipleChoice;
    }

    public void setMultipleChoice(boolean multipleChoice) {
        isMultipleChoice = multipleChoice;
    }
}
