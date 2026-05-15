import java.util.Scanner;

public class shoppingcart {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("what will you like to purchace today ");
        String item = sc.nextLine();
        System.out.println("at what price will u buy it at ");
        Integer price = sc.nextInt();
        System.out.println("how many of them will u purchace ");
        Integer quantity = sc.nextInt();
        Integer total = price * quantity;
        System.out.println("you will like to purchase " + item + " at this price : " + price + " quantity :" +quantity +" and thus the total is" + total);
    sc.close();
    }

}
