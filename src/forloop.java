import java.util.Scanner;

public class forloop {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
        System.out.println(i);
        Thread.sleep(1000);
    }
    }


}
