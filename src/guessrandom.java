import java.util.Random;
import java.util.Scanner;

public class guessrandom {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int guess;
        int randomnumber = rand.nextInt(1,11);
        int attempt=0 ;

        do {
            System.out.println("enter your guess:");
            guess =sc.nextInt();
            attempt++;
            if (guess>randomnumber) {
                System.out.println("your guess is too high");
            }
            else if (guess<randomnumber) {
                System.out.println("your guess is too low");
            }
        }while (guess != randomnumber);

        System.out.printf("your guess is %d and it took you %d attempts",guess,attempt);
    }
}
