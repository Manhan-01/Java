package QuizApp;

import java.beans.JavaBean;
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String ans[] = new String[5];
    int score = 0;


    public QuestionService(){
        questions[0] = new Question(1, "Language", "Java", "Python", "CPP", "Bash", "Java");
        questions[1] = new Question(2, "Movie", "Bahubali", "KGF", "Salar", "All", "All");
        questions[3] = new Question(3, "Director", "Rajamouli", "Neel", "Hirani", "Uppi", "Rajamouli");
        questions[4] = new Question(4, "Place", "Bengaluru", "London", "Mangaluru", "Japan", "London");
        questions[2] = new Question(5, "Company", "Google", "Microsoft", "Netflix", "SpaceX", "SpaceX");
    }
    

    public void playQuiz(){
        // System.out.println("in display Questions");
        // System.out.println(questions[0].getQuestion());

        // Enhanced for loop
        int i = 0;
        // int score = 0;
        for(Question q : questions){
            // System.out.println(q.getQuestion());
            // System.out.println(q);
            System.out.println("Question : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("a) "+q.getOpt1());
            System.out.println("b) "+q.getOpt2());
            System.out.println("c) "+q.getOpt3());
            System.out.println("d) "+q.getOpt4());
            System.out.println("");
            Scanner sc = new Scanner(System.in);
            ans[i] = sc.nextLine();
            // if(ans[i] == q.getAnswer()){
            //     score++;
            // }

            if(ans[i].equals(q.getAnswer())){
                score++;
            }

            i++;
            // if(ans == q.getAnswer()){
            //     System.out.println("Correct");
            // }
            // else{
            //     System.out.println("False, Your answer is : "+ans+", and correct answer is : "+q.getAnswer());
            }
            for(String s : ans){
                System.out.println(s);
            }


            System.out.println("");
            System.out.println("");

            

            
        }
        public void printScore(){
            System.out.println("Your score is : "+score);
        }

    }

    

    
