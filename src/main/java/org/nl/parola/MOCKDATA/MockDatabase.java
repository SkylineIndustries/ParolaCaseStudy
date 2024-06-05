package org.nl.parola.MOCKDATA;

import org.nl.parola.Question.Answer.Answer;
import org.nl.parola.Question.MultipleChoiceQuestion;
import org.nl.parola.Question.Question;
import org.nl.parola.Question.ShortAnswerQuestion;
import org.nl.parola.Quiz.Quiz;
import org.nl.parola.Roles.User;

import java.util.List;

public class MockDatabase {

    static Question question = new ShortAnswerQuestion("Wat is kaas in het engels?", List.of(new Answer("cheese")));
    static Question question2 = new MultipleChoiceQuestion("Hoe noem je een koe in het engels? A: cow, B: chicken, C: horse, D: dog", List.of(new Answer("b"), new Answer("c"), new Answer("d")), new Answer("a"));
    static Question question3 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'water'?", List.of(new Answer("water")));
    static Question question4 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'boom'?", List.of(new Answer("tree")));
    static Question question5 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'huis'?", List.of(new Answer("house")));
    static Question question6 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'auto'?", List.of(new Answer("car"), new Answer("automobile")));
    static Question question7 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'fiets'?", List.of(new Answer("bike"), new Answer("bicycle")));
    static Question question8 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'vliegtuig'?", List.of(new Answer("plane"), new Answer("airplane")));

    static List<Question> questions = List.of(question, question2, question3, question4, question5, question6, question7, question8);

    public static Quiz getQuiz(String user) {
        User user1 = new User(user, user);
        return new Quiz(user1, questions);
    }
}
