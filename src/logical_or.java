import java.util.Scanner;

public class logical_or {
   public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("enter your name:");
        name = sc.nextLine();

        if (name.length()<4 ||name.length()>12){
            System.out.println("name must be between 4 and 12 characters");
        } else if (name.contains("_") || name.contains(" ")) {
            System.out.println("name cannot contain spaces and underscores");
        } else {
            System.out.println("Hello " + name);
        }


    }
}
