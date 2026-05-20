package QuizApp;

import java.beans.JavaBean;

public class QuestionService {

    Question[] questions = new Question[5];


    public QuestionService(){
        questions[0] = new Question(1, "Language", "Java", "Python", "CPP", "Bash", "Java");
        questions[1] = new Question(2, "Movie", "Bahubali", "KGF", "Salar", "All", "All");
        questions[3] = new Question(3, "Director", "Rajamouli", "Neel", "Hirani", "Uppi", "Rajamouli");
        questions[4] = new Question(4, "Place", "Bengaluru", "London", "Mangaluru", "Japan", "London");
        questions[2] = new Question(5, "Company", "Google", "Microsoft", "Netflix", "SpaceX", "SpaceX");
    }

    public void displayQuestions(){
        // System.out.println("in display Questions");
        System.out.println(questions[0].getQuestion());
    }

    

    
}