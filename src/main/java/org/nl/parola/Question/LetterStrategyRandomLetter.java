package org.nl.parola.Question;

import java.util.Random;

public class LetterStrategyRandomLetter implements ILetterCalculation {

    public char getLetter(String answer) {
        Random random = new Random();
        int index = random.nextInt(answer.length());
        return answer.charAt(index);
    }
}
