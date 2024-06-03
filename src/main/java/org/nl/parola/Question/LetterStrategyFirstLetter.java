package org.nl.parola.Question;

public class LetterStrategyFirstLetter implements ILetterCalculation{

    public char getLetter(String question) {
        return question.substring(0, 1).charAt(0);
    }
}
