import java.util.Scanner;

public class logical_and {
    static void main(String[] args) {
        //using and logical operator
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        boolean weather=true;
        if (a>20 && a<30 && weather){
            System.out.println("the temperature is perfect");
        }else {
            System.out.println("the temperature is not perfect");
        }

    }
}
