package model;

public class Quiz {

    private int quizID;
    private String question;
    private String correctanswer;
    private double timestamp;

    public Quiz(int id, String qu, String coans, double time) {
        this.quizID = id;
        this.question = qu;
        this.correctanswer = coans;
        this.timestamp = time;
    }

    public int getQuizID() {
        return quizID;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectanswer() {
        return correctanswer;
    }

    public double getTimestamp() {
        return timestamp;
    }
}
