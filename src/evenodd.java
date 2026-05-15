import java.util.Scanner;

public class evenodd {

    public static void print(int n) {
        if (n == 0)
            return;


        if(n%2==0);  // recursive call
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();  // fixed
        print(n);
    }
}