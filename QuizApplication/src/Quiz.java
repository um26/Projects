import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private String quizTitle;
    private List<Question> questions;

    public Quiz(String quizTitle){
        this.quizTitle = quizTitle;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public String getTitle(){
        return quizTitle;
    }

    public void startQui(Scanner scanner){
        int score = 0;
        System.out.println("\nStarting Quiz: " + quizTitle);
        for(Question question : questions){
            System.out.println(question);
            System.out.print("Enter your answer (1-4): ");
            int answer= scanner.nextInt();
            if(question.isCorrect(answer - 1)){
                System.out.println("Correct!\n");
                score++;
            }else{
                System.out.println("Wrong!\n");
            }
        }
        System.out.println("Quiz Over! Your Score: " + score + "/" + questions.size());
    }
}
