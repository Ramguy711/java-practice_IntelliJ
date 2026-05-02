import java.util.Random;
import java.util.Scanner;

public class Stone_pap_sce_pro {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String playagain;
        int score = 0;
        do {

            System.out.println("enter your choice(scissors,rock,paper)");
            String playerchoice = sc.nextLine().toLowerCase();
            if (!playerchoice.equals("scissors") && !playerchoice.equals("rock") && !playerchoice.equals("paper")) {
                System.out.println("Invalid choice.");
            }
            String[] choices = {"rock", "paper", "scissors"};

            String computerchoice = choices[rand.nextInt(choices.length)];

            if (computerchoice.equals("scissors") && playerchoice.equals("rock") || (computerchoice.equals("paper") && playerchoice.equals("scissors")) ||
                    (computerchoice.equals("rock") && playerchoice.equals("paper"))) {
                System.out.println("You win!");
                score++;
            } } } else if (computerchoice.equals(playerchoice)) {{ {
                System.out.println("both are tie");
            } else {
                System.out.println("you lose");
            }
            System.out.println("Do you want to play again? (yes/no)");
            playagain = sc.nextLine().toLowerCase();
        }
        while (playagain.equals("yes"));
        System.out.println("Thanks for playing!");
        System.out.println("your score is "+score);

    }
}