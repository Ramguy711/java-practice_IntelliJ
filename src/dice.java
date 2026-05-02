import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the no of times you want to roll the dice");
        int rolldice = input.nextInt();
        Random rand = new Random();
        int total = 0;

        if(rolldice>0){
            for(int i=1;i<=rolldice;i++){
                int roll=rand.nextInt(1,7);
                System.out.println("you rolled "+roll);
                ascii(roll);

                total+=roll;
                System.out.println("the total is "+total);
            }
        }else {
            System.out.println("Invalid Input");
        }
    }

    static void ascii(int roll){

        String roll1= """
                ----------
                |        |
                |    O   | 
                |        |
                ----------
                """;
        String roll2= """
                ----------
                |        |
                | O    O | 
                |        |
                ----------
                """;
        String roll3= """
                ----------
                | O      |
                |    O   | 
                |       O|
                ----------
                """;
        String roll4= """
                ----------
                | O     O|
                |        | 
                | O     O|
                ----------
                """;
        String roll5= """
                ----------
                | O     O|
                |    O   | 
                | O     O|
                ----------
                """;
        String roll6= """
                        ----------
                        | O     O|
                        | O     O|
                        | O     O|
                        ----------
                        """;

        switch (roll){
            case 1 -> System.out.println(roll1);
            case 2 -> System.out.println(roll2);
            case 3 -> System.out.println(roll3);
            case 4 -> System.out.println(roll4);
            case 5 -> System.out.println(roll5);
            case 6 -> System.out.println(roll6);
        }





    }
}
