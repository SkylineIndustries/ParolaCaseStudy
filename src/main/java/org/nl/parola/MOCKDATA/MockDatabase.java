package org.nl.parola.MOCKDATA;

import org.nl.parola.antwoord.Answer;
import org.nl.parola.quiz.Quiz;
import org.nl.parola.rollen.User;
import org.nl.parola.vraag.MultipleChoiceQuestion;
import org.nl.parola.vraag.Question;
import org.nl.parola.vraag.ShortAnswerQuestion;

import java.util.List;

public class MockDatabase {

    static Question question = new ShortAnswerQuestion("wat is kaas in het engels?", 'k', List.of(new Answer("cheese")));
    static Question question2 = new MultipleChoiceQuestion("wat is koe in het engels? A: cow, B: chicken, C: horse, D: dog", 'c', List.of(new Answer("a")));
    static Question question3 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'water'?", 'q', List.of(new Answer("water")));
    static Question question4 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'boom'?", 't', List.of(new Answer("tree")));
    static Question question5 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'huis'?", 'w', List.of(new Answer("house")));
    static Question question6 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'auto'?", 'x', List.of(new Answer("car"), new Answer("automobile")));
    static Question question7 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'fiets'?", 'o', List.of(new Answer("bike"), new Answer("bicycle")));
    static Question question8 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'vliegtuig'?", 'a', List.of(new Answer("plane"), new Answer("airplane")));

    static List<Question> questions = List.of(question, question2, question3, question4, question5, question6, question7, question8);

    public static Quiz getQuiz(String user) {
        User user1 = new User(user, user);
        return new Quiz(user1, questions);
    }
}
