
package controller;

import View.QuizView;
import model.Quiz;


public class QuizController {

    private Quiz quiz;
    private QuizView view;

    
    public QuizController(Quiz qu, QuizView v) {
        this.quiz = qu;
        this.view = v;
    }

    // إنشاء Quiz
    public void createQuiz() {
        view.showNotification("Quiz Created Successfully");
    }

    // عرض Quiz
    public void viewQuiz() {
        view.displayQuizInfo(quiz);
    }
}
