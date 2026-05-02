import java.util.Scanner;

public class areaofrec {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("whats the length of rectangle");
        Integer Length = sc.nextInt();
        System.out.println("wahts the breadth of the rectangle");
        Integer Bredth = sc.nextInt();
        Integer area = Length * Bredth;
        System.out.println("the length of rectangle is " + Length);
        System.out.println("the breadth of rectangle is " + Bredth);
        System.out.println("the area if the rectangle is " + area);



    }
}
