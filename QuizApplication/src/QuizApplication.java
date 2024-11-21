import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApplication {
    private static List<Quiz> quizzes = new ArrayList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nQuizApplication");
            System.out.println("1. Create a New Quiz");
            System.out.println("2. Play a Quiz");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    createQuiz(scanner);
                    break;
                case 2:
                    playQuiz(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while(choice != 3);

        scanner.close();
    }

    private static void createQuiz(Scanner scanner){
        System.out.print("Enter QUiz Title: ");
        String title = scanner.nextLine();
        Quiz quiz = new Quiz(title);

        System.out.println("How many questions do you want to add? ");
        int questionCount = scanner.nextInt();
        scanner.nextLine();

        for(int i =0; i< questionCount;i++){
            System.out.println("\nEnter details for question " + (i+1));
            System.out.println("Question Text: ");
            String questionText = scanner.nextLine();

            List<String> options = new ArrayList<>();
            for(int j=0; j<4; j++){
                System.out.print("Option "+ (j+1) + ": ");
                options.add(scanner.nextLine());
            }

            System.out.println("Enter the correct option (1-4): ");
            int correctOption = scanner.nextInt();
            scanner.nextInt();

            Question question = new Question(questionText, options, correctOption -1);
            quiz.addQuestion(question);
        }

        quizzes.add(quiz);
        System.out.println("Quiz \"" + title + "\" created successfully!");
    }

    private static void playQuiz(Scanner scanner){
        if(quizzes.isEmpty()){
            System.out.println("No quizzes available. Please create one first.");
            return;
        }

        System.out.println("\nAvailable Quizzes:");
        for(int i =0; i<quizzes.size(); i++){
            System.out.println((i+1) + ". " + quizzes.get(i). getTitle());
        }

        System.out.print("Select a quiz to play (1-" + quizzes.size()+ "): ");
        int quizChoice = scanner.nextInt();
        scanner.nextLine();

        if(quizChoice <1 || quizChoice > quizzes.size()){
            System.out.println("Invalid choice. Returning to main menu.");
        } else{
            quizzes.get(quizChoice - 1).startQui(scanner);
        }
    }
}
