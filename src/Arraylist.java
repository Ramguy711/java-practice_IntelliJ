import java.util.ArrayList;
import java.util.Scanner;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");

        System.out.println("current list "+ fruit);

        System.out.println("size of fruit "+ fruit.size());

        System.out.println("enter the index to update");
        int index = sc.nextInt();

        sc.nextLine();

        System.out.println("enter the new fruit name");
        String newfruit = sc.nextLine();

        fruit.set(index, newfruit);

        System.out.println("updated  list "+ fruit);








    }
}
