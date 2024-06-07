package org.nl.parola.MOCKDATA;

import org.nl.parola.Question.Answer.Answer;
import org.nl.parola.Quiz.IPlayQuiz;
import org.nl.parola.Quiz.Quiz;
import org.nl.parola.Roles.User;
import org.nl.parola.Question.MultipleChoiceQuestion;
import org.nl.parola.Question.Question;
import org.nl.parola.Question.ShortAnswerQuestion;

import java.util.ArrayList;
import java.util.List;

public class MockDatabase {

    static Question question = new ShortAnswerQuestion("Wat is kaas in het engels?", List.of(new Answer("cheese")));
    static Question question2 = new MultipleChoiceQuestion("Hoe noem je een koe in het engels? A: cow, B: chicken, C: horse, D: dog", List.of(new Answer("a")));
    static Question question3 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'water'?", List.of(new Answer("water")));
    static Question question4 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'boom'?", List.of(new Answer("tree")));
    static Question question5 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'huis'?", List.of(new Answer("house")));
    static Question question6 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'auto'?", List.of(new Answer("car"), new Answer("automobile")));
    static Question question7 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'fiets'?", List.of(new Answer("bike"), new Answer("bicycle")));
    static Question question8 = new ShortAnswerQuestion("Wat is de Engelse vertaling van 'vliegtuig'?", List.of(new Answer("plane"), new Answer("airplane")));

    static List<Question> questions = List.of(question, question2, question3, question4, question5, question6, question7, question8);

    public static Quiz getQuiz(String user) {
        Quiz quiz = new Quiz(questions);
        List<Quiz> quizList = new ArrayList<>();
        quizList.add(quiz);
        return determineQuiz(quizList, user);
    }
    public static User getUser(String playerName) {
        return new User(playerName, playerName);
    }

    /**
     *     This would retrieve a quiz based on the quizzes the user had played and the quizzes that are left
      */
    private static Quiz determineQuiz(List<Quiz> quizList, String user){
        return quizList.get(0);
    }

    public static void saveQuizData(int score, User user, IPlayQuiz quiz){
        //Mock saving data to DB
    }
}
