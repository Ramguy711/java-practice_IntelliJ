import java.util.Scanner;

public class quiz_pro {
    public static void main(String[] args) {
        String[] questions = {
                "What is the capital of India?",
                "Which planet is known as the Red Planet?",
                "How many days are there in a week?",
                "What is the largest ocean on Earth?",
                "Who is known as the Father of Computers?"
        };


        String [][] options ={{"1) Mumbai  2) Delhi  3) Chennai  4) Kolkata"},
                {"1) Earth  2) Mars  3) Venus  4) Jupiter\n"},
                {"1) 5  2) 6  3) 7  4) 8\n"},
                {"1) Atlantic  2) Indian  3) Pacific  4) Arctic\n"},
                {"1) Alan Turing  2) Charles Babbage  3) Bill Gates  4) Steve Jobs"}};
        int [] guess = {2,2,3,3,2};
    int correct = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("welcome to the quiz");
        System.out.println("*******************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println("\n" + questions[i]);
            System.out.println(options[i][0]);

            System.out.println("enter your choice  ");
            int choice = sc.nextInt();
            if(choice == guess[i]){
                System.out.println("Correct!");
                correct++;
            }else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("your final score: " + correct);
    }
}
