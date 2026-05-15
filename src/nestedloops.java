import java.util.Scanner;

public class nestedloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows and columns and symbol");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        String symbol = sc.next();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
