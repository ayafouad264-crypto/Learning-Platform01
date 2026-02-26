
package quiz.pkg01;

import View.QuizView;
import model.Quiz;
import controller.QuizController;


public class Quiz01 {

   
    public static void main(String[] args) {
       
        Quiz quiz1 = new Quiz(1,"What is Multimedia?",
        "Combination of text, audio, video, and images" ,5.30);
        QuizView qView = new QuizView();
        QuizController Controller = new QuizController(quiz1, qView);
        
        Controller.createQuiz();
        Controller.viewQuiz();
     
    }
    
}
