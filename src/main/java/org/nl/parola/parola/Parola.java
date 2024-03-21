package org.nl.parola.parola;

import org.nl.parola.antwoord.Antwoord;
import org.nl.parola.rollen.Gebruiker;
import org.nl.parola.quiz.Quiz;
import org.nl.parola.testcode.ScoreStrategyA;
import org.nl.parola.testcode.ScoreStrategyB;

public interface Parola {



    int geefWoord(String woord);
    char[] beantwoordVraag(Antwoord antwoord);

}
