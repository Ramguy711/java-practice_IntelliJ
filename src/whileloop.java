import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("your age cannot be negative or zero ");
            System.out.println("enter your age");
            n = sc.nextInt();

        }
        System.out.println("your age is " + n);
    }
}
