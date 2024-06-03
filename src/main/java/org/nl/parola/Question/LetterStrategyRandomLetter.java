package org.nl.parola.Question;

public class LetterStrategyRandomLetter implements ILetterCalculation {

    public char getLetter(String question) {
        return question.substring((int) (Math.random() * question.length()), (int) (Math.random() * question.length() + 1)).charAt(0);
    }
}
