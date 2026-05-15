import java.util.Scanner;

public class methord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your year and name");
        int year = sc.nextInt();
        String name = sc.next();
         Birthday(year,name);

    }
    static void Birthday(int year,String name) {
        System.out.println(year);
        System.out.println(name);
        System.out.println("happy birthday");

    }
}
