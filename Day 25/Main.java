import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quiz[] quizzes = {
                new Quiz("Capital of France?", new String[]{"Paris","London","Berlin","Rome"}, 'A'),
                new Quiz("5 + 7 = ?", new String[]{"10","12","13","14"}, 'B'),
        };

        int score = 0;
        for(Quiz q : quizzes) {
            q.displayQuestion();
            System.out.print("Your answer: ");
            char ans = sc.next().charAt(0);
            if(q.checkAnswer(ans)) {
                System.out.println("Correct! ✅");
                score++;
            } else {
                System.out.println("Wrong ❌");
            }
            System.out.println();
        }

        System.out.println("Your total score: " + score + "/" + quizzes.length);
    }
}

