public class Quiz {
    String question;
    String[] options;
    char answer;

    public Quiz(String question, String[] options, char answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public boolean checkAnswer(char userAnswer) {
        return Character.toUpperCase(userAnswer) == Character.toUpperCase(answer);
    }

    public void displayQuestion() {
        System.out.println(question);
        char optionChar = 'A';
        for(String option : options) {
            System.out.println(optionChar + ". " + option);
            optionChar++;
        }
    }
}
