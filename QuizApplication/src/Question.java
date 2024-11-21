import java.util.List;

public class Question {
    private String questionText;
    private List<String> options;
    private int correctAnswer;

    public Question(String questionText, List<String> options, int correctAnswer){
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer= correctAnswer;
    }

    public boolean isCorrect(int userAnswer){
        return userAnswer == correctAnswer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(questionText + "\n");
        for(int i =0; i< options.size(); i++){
            sb.append((i+1) + ". " + options.get(i)+ "\n");
        }
        return sb.toString();
    }
}
