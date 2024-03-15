package org.nl.parola;


import org.nl.parola.antwoord.Antwoord;
import org.nl.parola.parola.Parola;
import org.nl.parola.quiz.Quiz;
import org.nl.parola.rollen.Gebruiker;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz(new Gebruiker("test@gmail.com", "1q23452"));
        Parola parola = new Quiz(new Gebruiker("test@gmail.com", "1q23452"));
        parola.beantwoordVraag(new Antwoord("Ik ben een antwoord"));
        parola.geefWoord("Appel");
    }
}