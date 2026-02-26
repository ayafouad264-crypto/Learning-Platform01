
package View;

import model.Quiz;

public class QuizView {
 
    public void displayQuizInfo(Quiz quiz) {
        System.out.println("Quiz ID: " + quiz.getQuizID());
        System.out.println("Question: " + quiz.getQuestion());
        System.out.println("Correct Answer: " + quiz.getCorrectanswer());
        System.out.println("Timestamp: " + quiz.getTimestamp());
    }
    public void showNotification(String msg) {
        System.out.println("Notification: " + msg);
    }
    
}
