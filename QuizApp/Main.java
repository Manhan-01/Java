package QuizApp;

public class Main {

    public static void main(String args[]){
        System.out.println("Start");
        // System.out.println("Hello World");
        QuestionService service = new QuestionService();
        service.displayQuestions();



        System.out.println("End");
    }
}